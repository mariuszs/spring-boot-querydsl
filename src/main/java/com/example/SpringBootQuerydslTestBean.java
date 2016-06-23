package com.example;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.domain.Employee;
import com.example.domain.Phone;
import com.example.repositories.EmployeeRepository;
import com.example.repositories.PhoneRepository;
import com.example.servicies.EmployeeService;

/**
 * Beans for manual testing: uncomment @Configuration or specific @Bean to enable,
 * then Spring Boot will execute on start. 
 * @author Paul Verest
 */
@Configuration // uncomment @Configuration annotation to enable
public class SpringBootQuerydslTestBean {
	
	private static final Logger log = LoggerFactory.getLogger(SpringBootQuerydslTestBean.class);

	@Bean // uncomment @Bean annotation to enable
	public CommandLineRunner testQuerySQLfinds(final EmployeeRepository repository,
			final PhoneRepository phoneRepository, final EmployeeService service) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) {
				log.info("Creating test case 1 data...");
				Employee emp1 = new Employee();
				emp1.setFirstName("Antony");
				emp1.setLastName("Long");
				repository.save(emp1);
				
				Phone tel1 = new Phone("123456789");
				tel1.setOwner(emp1);
				phoneRepository.save(tel1);
				Phone tel2 = new Phone("+20123456789");
				tel2.setOwner(emp1);
				phoneRepository.save(tel2);
				
				List<Phone> antonyPhones = phoneRepository.findByOwner(emp1);
				log.info("Phone owned by "+emp1+":");
				for (Phone p : antonyPhones) {
					log.info(p.toString());
				}
				log.info("");
				
				Iterable<Employee> employees = service.findEmployeesByPhoneNumber("456");
				log.info("Employees found with findEmployeesByPhoneNumber('456'):");
				for (Employee e : employees) {
					log.info(e.toString());
				}
				log.info("");
				
				Iterable<Employee> employees2 = service.findEmployeesByPhoneNumber("123456789");
				log.info("Employees found with findEmployeesByPhoneNumber('123456789'):");
				for (Employee e : employees2) {
					log.info(e.toString());
				}
				log.info("");
				
			}
		};
	}

}

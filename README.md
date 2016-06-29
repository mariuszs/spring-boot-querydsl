Spring Boot Application with JPA, REST, Audit (Envers), Lombok and QueryDsl
-----

Employee and Phone example is taken from [Java Persistence wikibook](https://en.wikibooks.org/wiki/Java_Persistence).

![](https://upload.wikimedia.org/wikipedia/commons/7/7e/ObjectRelational-ManyToOne2.jpg)

Executed query

```java
	public Iterable<Employee> findEmployeesByPhoneNumber(String phoneNumber) {
		return repository.findAll(employee.phones.any().number.contains(phoneNumber));
	}
```

IntelliJ Idea configuration:

* Go to Preferences -> Build, Execution, Deployment -> Annotation Processors;
* Check Enable annotation processing checkbox;
* In "Store generated sources relative to:" select Module content root.

Workarounds
----

 * `package-info.java` is required, for `Revision.java` to compile.

## Links

- [Spring projects links to docs and examples summary](https://github.com/paulvi/spring-projects-links-to-docs-and-examples-summary)
- [Hibernate ORM Envers](http://hibernate.org/orm/envers/), [docs](http://docs.jboss.org/envers/docs/index.html)
- https://en.wikibooks.org/wiki/Java_Persistence

- http://bsideup.blogspot.com/2015/04/querydsl-with-gradle-and-idea.html
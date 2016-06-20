package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

interface TokenRepository extends JpaRepository<Token, Long>, QueryDslPredicateExecutor<Token> {

}

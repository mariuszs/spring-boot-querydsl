package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.QToken.token;

@RestController
public class TokenController {

    private final TokenRepository tokenRepository;

    @Autowired
    public TokenController(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    @RequestMapping("/")
    public void root() {

        tokenRepository.findAll(token.id.eq(1L));
    }

}

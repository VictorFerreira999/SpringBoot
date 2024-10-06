package com.scopes.singleton_prototype.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope ("prototype")
    public Remetente remetente(){
        System.out.println("Criando um ojeto remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation");
        return remetente;
    }
}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(DemoApplication.class, args);
        
        ProdutoRepository produto =  app.getBean(ProdutoRepository.class);
        
        Produto produto1 = new Produto();
        produto1.setDescricao("produto-1");
        produto.save(produto1);
        
        Produto produto2 = new Produto();
        produto1.setDescricao("descrição do produto 2");
        produto.save(produto2);
    }
}

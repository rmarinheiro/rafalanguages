package br.com.rafael.rafalanguages;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem,String> {
    
}

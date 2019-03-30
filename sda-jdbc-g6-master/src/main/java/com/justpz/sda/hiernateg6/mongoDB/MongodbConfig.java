package com.justpz.sda.hiernateg6.mongoDB;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongodbConfig extends AbstractMongoConfiguration {
    @Override
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
    }

    @Override
    protected String getDatabaseName() {
        return "sda";
    }
}

package com.philips.week.repository.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration {

    private static final String DATABASE_NAME = "philips-dev-week";

    public static final String DB_URL = "mongodb+srv://erisnilton:B1s086bNWiKoCJ5g@cluster0.etev7.mongodb.net/";

    @Override
    protected String getDatabaseName() {
        return DATABASE_NAME;
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(DB_URL);
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }

}
package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class MongoConfig {

    @Autowired
    private Mongoproperties mongoproperties;

    @Bean
    public MongoClient client() throws Exception{
//        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost",27017));
        MongoClient mongoClient = new MongoClient(new ServerAddress(mongoproperties.getHost(),mongoproperties.getPort()));
        return mongoClient;
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception{
//        String database = new MongoClientURI("mongodb://root:111111@localhost:27017/user").getDatabase();
        String database = new MongoClientURI(mongoproperties.getUri()).getDatabase();
        return new SimpleMongoDbFactory(client(),database);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception{
        return new MongoTemplate(mongoDbFactory());
    }
}

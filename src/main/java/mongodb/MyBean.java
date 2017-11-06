package mongodb;

import com.mongodb.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Yuwei on 2017/11/6.
 */
@Component
public class MyBean {
    private final MongoDbFactory mongo;

    @Autowired
    public MyBean(MongoDbFactory mongo) {
        this.mongo = mongo;
    }

    public MongoDbFactory getMongo() {
        return mongo;
    }

    public void example(){
        DB db = mongo.getDb();
    }
}

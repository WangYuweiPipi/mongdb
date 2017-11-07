package mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Yuwei on 2017/11/6.
 */
public interface UserRepository extends MongoRepository<User,Long> {

    User findByName(String name);
}

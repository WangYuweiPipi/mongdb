package mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Yuwei on 2017/11/6.
 */
@Repository
public interface UserRepository extends MongoRepository<User,Long> {

    User findByName(String name);
}

package mongodb;

import org.aspectj.apache.bcel.Repository;

/**
 * Created by Yuwei on 2017/11/6.
 */
public interface CityRepository extends Repository<User, Long> {

    User findByName(String name);
}

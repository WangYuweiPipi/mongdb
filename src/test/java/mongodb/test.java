package mongodb;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Yuwei on 2017/11/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {
        userRepository.deleteAll();
    }

    @Test
    public void Test() throws Exception{
        userRepository.save(new User(1L,"Tom",12));
        userRepository.save(new User(2L,"Jerry",12));
        Assert.assertEquals(2,userRepository.findAll().size());
    }

}

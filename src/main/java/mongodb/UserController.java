package mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yuwei on 2017/11/6.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/message")
    public void insertData(){
//        userRepository.save(new User(1L,"Tom",12));
//        userRepository.save(new User(2L,"Jerry",12));
        userRepository.save(new User(3L,"Stone",13));
        for (User user : userRepository.findAll()) {
            System.out.println(user.getName()+","+user.getAge());
        }
    }

    @RequestMapping("/messageByname")
    public User findData(){
        User user = userRepository.findByName("Tom");
        System.out.println(user.getName()+","+user.getAge());
        return user;
    }

    @RequestMapping("/delete")
    public void deleteData(){

    }
}

package cn.ice.boot.service;

import cn.ice.boot.App;
import cn.ice.boot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
// config bootstrap class
@SpringBootTest(classes = {App.class})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    // without @Transactional will raise "could not initialize proxy :no session"
    @Transactional
    public void testFindOne(){
        Long id = 1L;
        User user = userService.load(id);
        if (user == null) {
            System.out.println("Null");
        }else {
            System.out.println(user.toString());
        }

    }

}

import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

//        // 用户实际调用的是业务层，dao层他们不需要接触！
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMysqlImpl());
//
//        userService.getUser();

        // 获取ApplicationContext，拿到Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 需要什么就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();

    }
}

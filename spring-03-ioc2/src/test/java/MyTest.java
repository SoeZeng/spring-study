import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        User user = new User();

        // Spring容器
        // 加载配置的时候就已经创建了对象，调用无参构造函数了
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml"); // User的无参构造


//        User user = (User) context.getBean("user");
//        User user = (User) context.getBean("yonghu");
        UserT user = (UserT) context.getBean("u2");
//        User user2 = (User) context.getBean("user");
        user.show();
//        System.out.println(user == user2);
    }

}

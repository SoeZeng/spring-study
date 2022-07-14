import com.kuang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        Student{name='Magic', address=Address{address='成都'}, books=[红楼梦, 水浒传, 西游记, 三国演义],
        hobbies=[听歌, 敲代码, 看电影], card={身份证=123456123456781234, 银行卡=1231231231231231231},
        games=[LOL, COC, BOB], wife='null', info={password=12345, url=女, driver=20220714, username=Tina}}
         */
    }
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import x.y.Foo;

/**
 * by Irina.Petrovskaya, on 24.03.11, 16:18
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config1.xml");
        Foo boo = ctx.getBean("boo",Foo.class);
        System.out.println("boo.getE_mail() = " + boo.getE_mail());
        Foo zoo = ctx.getBean("zoo", Foo.class);
        System.out.println("zoo.getE_mail() = " + zoo.getE_mail());
    }
}

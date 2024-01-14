import org.example.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW.getMessage());
        HelloWorld bean2HW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2HW.getMessage());
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getName());
    }
}
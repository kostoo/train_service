import org.apache.camel.spring.Main;

public class MyApp {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");

        try {
            System.out.println("Start camel context");
            main.start();
        } finally {
            System.out.println("Stop camel context");
            main.stop();
        }
    }

}

package example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bigwhite
 * @date 2023 -03 -02
 **/
@SpringBootApplication
public class AuthClient2Application {
    public static void main(String[] args) {
        try {
            SpringApplication.run(AuthClient2Application.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

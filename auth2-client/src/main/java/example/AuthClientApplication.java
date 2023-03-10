package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.parameters.P;

/**
 * @author bigwhite
 * @date 2023 -03 -02
 **/
@SpringBootApplication
public class AuthClientApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(AuthClientApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package bigwhite.learn.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bigwhite
 * @date 2023 -03 -01
 **/
@SpringBootApplication
public class Auth2Server {
    public static void main(String[] args) {
        try {
            SpringApplication.run(Auth2Server.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

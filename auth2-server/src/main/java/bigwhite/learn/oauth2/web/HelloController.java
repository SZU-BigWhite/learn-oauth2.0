package bigwhite.learn.oauth2.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bigwhite
 * @date 2023 -03 -01
 **/
@RestController
public class HelloController {
	@GetMapping("hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("hello world", HttpStatus.OK);
	}
}

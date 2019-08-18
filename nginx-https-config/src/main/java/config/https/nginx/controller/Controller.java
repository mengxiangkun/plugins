package config.https.nginx.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author mengxiangkun
 * @date 2019/8/18
 */
@SpringBootApplication
@RestController
public class Controller {
	@GetMapping("/")
	public String getOk() {
		return "Ok";
	}
}

package config.https.nginx.controller;

import config.https.nginx.constants.Constant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengxiangkun
 * @date 2019/8/18
 */
@RestController
public class Controller {
	@GetMapping("/")
	public String getOk() {
		return Constant.OK;
	}
}

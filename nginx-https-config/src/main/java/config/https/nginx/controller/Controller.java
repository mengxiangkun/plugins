package config.https.nginx.controller;

import config.https.nginx.constants.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengxiangkun
 * @date 2019/8/18
 */
@RestController
public class Controller {
	private final Logger logger= LoggerFactory.getLogger(getClass());
	@GetMapping("/")
	public String getOk() {
	logger.info(Constant.OK);
		return Constant.OK;
	}
}

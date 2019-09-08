package config.https.nginx.controller;

import config.https.nginx.constants.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author mengxiangkun
 * @date 2019/8/18
 */
@RestController
@Description("")
@Valid
public class Controller {
	private final Logger logger= LoggerFactory.getLogger(getClass());
	@GetMapping("/")
	public String getOk() {

	logger.info(Constant.OK);
		return Constant.OK;
	}
}
package config.https.nginx.annotations;

import javax.validation.Valid;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * @author mengxiangkun
 * @date 2019//9/6
 */
@Valid
@Inherited
@Target({ElementType.PACKAGE})
public @interface ValidInherited {
}

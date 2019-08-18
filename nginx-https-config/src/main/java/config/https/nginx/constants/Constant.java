package config.https.nginx.constants;

/**
 * @author mengxiangkun 
 * @date 2019/8/18
 */
public class Constant {
	//TODO 客户端证书路径，用了本地绝对路径，需要修改
	public final static String CLIENT_CERT_FILE = "/usr/local/etc/nginx/crt/client.p12";
	//TODO 客户端证书密码
	public final static String CLIENT_PWD = "123456";
	//TODO 信任库路径
	public final static String TRUST_STRORE_FILE = "/Library/Java/JavaVirtualMachines/openjdk-12.0.2.jdk/Contents/Home/conf/security/demo.truststore";
	//TODO 信任库密码
	public final static String TRUST_STORE_PWD = "demodemo";
	public final static String CLIENT_KEY_STORE_TYPE="PKCS12";
	public final static String TRUST_KEY_STORE_TYPE="JKS";
	public final static String SUN_X509="SunX509";
	public final static String SSL="SSL";
	public final static String URI="https://localhost";
	public final static String OK="OK";
}

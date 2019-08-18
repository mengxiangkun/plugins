package config.https.nginx.utils;

import java.io.FileInputStream;
import java.security.KeyStore;

/**
 * @author mengxiangkun
 * @date 2019/8/18
 */
public final class Util {
	public final static KeyStore getKeyStore(String keyStorePath, String password, String type)
		throws Exception {
		try(FileInputStream fileInputStream = new FileInputStream(keyStorePath)){
			KeyStore keyStore = KeyStore.getInstance(type);
			keyStore.load(fileInputStream, password.toCharArray());
			return keyStore;
		}
	}
}

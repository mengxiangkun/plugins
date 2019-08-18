package config.https.nginx.controller;

import config.https.nginx.utils.Util;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.net.URI;
import java.security.KeyStore;
import java.security.SecureRandom;

import static config.https.nginx.constants.Constant.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ControllerTest {
	@BeforeEach
	void setUp() {
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	void getOkTest() throws Exception {
		//TODO 初始化密钥库
		KeyManagerFactory keyManagerFactory = KeyManagerFactory
			.getInstance(SUN_X509);
		KeyStore keyStore = Util.getKeyStore(CLIENT_CERT_FILE, CLIENT_PWD, CLIENT_KEY_STORE_TYPE);
		keyManagerFactory.init(keyStore, CLIENT_PWD.toCharArray());

		//TODO 初始化信任库
		TrustManagerFactory trustManagerFactory = TrustManagerFactory
			.getInstance(SUN_X509);
		KeyStore keyTrustStore = Util.getKeyStore(TRUST_STRORE_FILE, TRUST_STORE_PWD, TRUST_KEY_STORE_TYPE);
		trustManagerFactory.init(keyTrustStore);
		SSLContext sslContext = SSLContext.getInstance(SSL);
		sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), new SecureRandom());
		CloseableHttpClient closeableHttpClient = HttpClients.custom().setSSLContext(sslContext).build();
		HttpGet getCall = new HttpGet();
		getCall.setURI(new URI(URI));
		Integer execute = closeableHttpClient.execute(getCall, httpResponse -> httpResponse.getEntity().getContent().available());
		Assert.isTrue(true, String.valueOf(execute.equals(0)));
	}
}
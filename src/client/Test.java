package client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.ws.Holder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

public class Test {

	static {
	    HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier(){
			@Override
			public boolean verify(String arg0, SSLSession arg1) {
				 if (arg0.equals("221.179.11.204"))
					 return true;
	                
				return false;
			}});
	        
	}
	public static void main(String[] args) throws  IOException   {
		/*HelloService service=new HelloService();
		HelloDelegate delegate= service.getHelloPort();
		String filepath = "C:/Users/mu/Desktop/通讯录.txt";  
		DataHandler dataHandler = new DataHandler(new FileDataSource(filepath));
		byte[] bytes=new byte[1024];
		dataHandler.getInputStream().read(bytes);
		delegate.upload(bytes, "test");*/
		System.setProperty("javax.net.ssl.trustStore","E:/work/eaopClient/eaopClient/eaop.keystore");
		System.setProperty("javax.net.ssl.keyStorePassword", "ydgj123icmcc");
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("jaxwsclient.xml");
		

		EaopServer springService=(EaopServer)applicationContext.getBean("client");
		springService.handle("123");
	}

}

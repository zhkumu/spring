package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
public class SpringTest {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("xml.xml");
		/*OutputStream stream=new FileOutputStream("d://xstream.xml");
		Marshaller marshaller=(Marshaller)applicationContext.getBean("xstreamMarshaller");
		marshaller.marshal(getUser(), new StreamResult(stream));*/
		InputStream inputStream=new FileInputStream("d://xstream.xml");
		Unmarshaller unmarshaller=(Unmarshaller)applicationContext.getBean("xstreamMarshaller");
		User user= (User)unmarshaller.unmarshal(new StreamSource(inputStream));
		System.out.println(user.getUserId());
	}
	public static User getUser(){
		LoginLog log=new LoginLog();
		log.setIp("127.0.0.1");
		log.setLoginDate(new Date());
		log.setLoginLogId(1);
		log.setUserId(1);
		User user=new User();
		user.setUserId(1);
		user.getLogs().add(log);
		return user;
	}
}

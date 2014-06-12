package xml;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Date;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;

public class Test {
	private static XStream xstream;
	private static String str;
	static{
		xstream=new XStream(new DomDriver());
		/*
		//设置类名对应的节点名
		xstream.alias("loginLog", LoginLog.class);
		xstream.alias("user", User.class);
		
		//把字段改名
		xstream.aliasField("id", User.class, "userId");
		
		//把类对象字段的字段改名并设置为属性
		xstream.aliasAttribute(LoginLog.class, "userId", "id");
		xstream.useAttributeFor(LoginLog.class, "userId");
		
		//去掉集合的父节点
		xstream.addImplicitCollection(User.class, "logs");
		
		xstream.registerConverter(new DateConverter());
		*/
		
		/*//使用注解1
		xstream.processAnnotations(User.class);
		xstream.processAnnotations(LoginLog.class);*/
		
		//使用注解2
		xstream.autodetectAnnotations(true);
		
		/*
<xml.User>
  <userId>1</userId>
  <credits>0</credits>
  <logs>
    <xml.LoginLog>
      <loginLogId>1</loginLogId>
      <userId>1</userId>
      <ip>127.0.0.1</ip>
      <loginDate>2014-06-11 16:47:56.534 UTC</loginDate>
    </xml.LoginLog>
  </logs>
</xml.User>
		 */
		
		/*
<user>
  <id>1</id>
  <credits>0</credits>
  <loginLog id="1">
    <loginLogId>1</loginLogId>
    <ip>127.0.0.1</ip>
    <loginDate>2014-06-11 16:55:12.53 UTC</loginDate>
  </loginLog>
</user>
		 */
	}
	
	public static void main(String[] args) throws Exception {
		//object2XMl();
		//XML2Object();
		object2XMLStream();
		XML2ObjectStream();
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
	
	public static void object2XMl() throws Exception{
		User user=getUser();
		FileOutputStream stream=new FileOutputStream("d://xstream.xml");
		xstream.toXML(user,stream);
	}
	
	public static void XML2Object() throws IOException{
		FileInputStream stream=new FileInputStream("d://xstream.xml");
		User user=(User)xstream.fromXML(stream);
		
		System.out.println(user.getUserId());
	}
	
	public static void object2XMLStream() throws IOException{
		User user=getUser();
		StringWriter writer=new StringWriter();
		PrettyPrintWriter prettyPrintWriter=new PrettyPrintWriter(writer);
		ObjectOutputStream out=xstream.createObjectOutputStream(writer);
		out.writeObject(user);
		out.close();
		str=writer.toString();
		System.out.println(str);
	}
	
	public static void XML2ObjectStream() throws IOException, ClassNotFoundException{
		InputStream in=new ByteArrayInputStream(str.getBytes("utf-8"));
		ObjectInputStream input=xstream.createObjectInputStream(in);
		User user=(User)input.readObject();
		System.out.println(user.getUserId());
	}

}

package remote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	@WebMethod
	public String say(String name){
		return "Hello "+name;
	}
	
	@WebMethod
	public List<String> getList(){
		List<String> list=new ArrayList<String>();
		list.add("mu");
		list.add("smell");
		return list;
	}
	
	@WebMethod
	public List<Person> getPersons(){
		List<Person> list=new ArrayList<Person>();
		for(int i=0;i<3;i++){
			Person p=new Person();
			p.setId(i);
			p.setName("mu"+i);
			p.setPwd("123456");
			list.add(p);
		}
		return list;
	}
	
	@WebMethod
	public void upload(byte[] bytes,String filename) {
		File file=new File("C:/Users/mu/Desktop/upload.txt");
		FileOutputStream outputStream=null;
		try {
			outputStream = new FileOutputStream(file);
			outputStream.write(bytes);
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	@WebMethod
	public DataHandler getFile(){
		String filepath = "C:/Users/mu/Desktop/通讯录.txt";  
		DataHandler dataHandler = new DataHandler(new FileDataSource(filepath));  
		return dataHandler; 

	}
}

package test;

import org.springframework.beans.factory.FactoryBean;

public class StudentFactory implements FactoryBean<Student> {

	@Override
	public Student getObject() throws Exception {
		Student student=new Student();
		student.setName("mu");
		student.setCode("001");
		return student;
	}

	@Override
	public Class<Student> getObjectType() {
		return Student.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}

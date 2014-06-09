package test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Boss {

	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	private Map<String,String> cards;

	public Map<String, String> getCards() {
		return cards;
	}

	public void setCards(Map<String, String> cards) {
		this.cards = cards;
	}

	public void init(){
		System.out.println("boss start");
	}
	
	public void distroy(){
		System.out.println("boss end");
	}
	
}

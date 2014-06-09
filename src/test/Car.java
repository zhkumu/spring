package test;

public class Car {
	private String name;
	private String remark;
	private double money;
	private String iDcar;
	public String getIDcar() {
		return iDcar;
	}
	public void setIDcar(String iDcar) {
		this.iDcar = iDcar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	public String toString(){
		return name+" Money:"+money+" ReMark:"+remark;
	}
	public Car(String name, String remark, double money, String iDcar) {
		super();
		this.name = name;
		this.remark = remark;
		this.money = money;
		this.iDcar = iDcar;
	}
	public Car(){
		
	}
}

package Homework;

public class Rahim extends RP {
	
	public int age;
	public String loc;

	public Rahim(String NID, int age,String loc) {
		super(NID);
		this.age=age;
		this.loc=loc;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		System.out.println(age+","+loc);
	}
	

}

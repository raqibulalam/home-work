package Homework;

public class Riksha extends Vehicle {
	private Wheel Whe;
	private Rahim Rah;

	public Riksha(String model,Wheel Whe,Rahim Rah) {
		super(model);
		this.Rah=Rah;
		this.Whe=Whe;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		Rah.display();
		Whe.display();
	}
	public static void main(String[] args) {
		Wheel w=new Wheel(100.845);
		Rahim r=new Rahim("12324154",35,"Barishal");
		Riksha ric=new Riksha("Auto Riksha",w,r);
	}

}

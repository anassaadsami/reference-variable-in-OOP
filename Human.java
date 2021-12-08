package personWithRefereceVariable;

public class Human {
	private String name ;
	private int age ;
	private boolean single ;
	private String address;
	static int no_of_blankett = 0;
	Human partner ;      // reference variable ( from the same class ) as an instance attribute
	public Human(String name , int age , boolean single , String address) {
//		this.name = name ; 
//		this.age = age ;
//		this.single = single ;
//		this.address = address ;
		setName(name);
		setAge(age);
		setSingle(single);
		setAddress(address);
		setNo_of_blankett();     // every time we create an object we increment this value 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSingle() {
		return single;
	}
	public void setSingle(boolean single) {
		this.single = single;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void partnerDetails(){
		if( !this.single) {
			partner = new Human("tania",36, false ,this.address);   // create an object but (THIS IS NOT LOGIC CAUSE ALL THE OBJECT MERRID WIHT TANIA)
			System.out.printf("this is my wife %S and her age is %d and we have the same address %s\n",
					partner.name , partner.age ,partner.address);      // we invoke the name of partner without class name 
		}else
			System.out.println("im free!");
	}
	public void parnterAge() {
		if(!this.single)
			partner = new Human("tania",36, false ,this.address);   // without create an object------> error cause we dont have partner yet
			System.out.println(this.partner.name);   // we can code partner.name also   
	}
	public int getNo_of_blankett() {
		return no_of_blankett;
	}
	public void setNo_of_blankett() {
		Human.no_of_blankett += 1;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", single=" + single + ", address=" + address + ", partner="
				+ partner + "]";
	}
	
	
	

}

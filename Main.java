package personWithRefereceVariable;

public class Main {

	public static void main(String[] args) {
		Human h1 = new Human("anas",40,false,"stockholm");
		System.out.println(h1.getName());
		System.out.println(h1.getAddress());
		System.out.println(h1.isSingle());
		h1.partnerDetails();
		System.out.println(h1.partner);    //  we get all partner's attributes 
		System.out.println(h1.toString());  // we get all h1 attributes and partner's attributes also
		
//		Human h2 = new Human("ali", 30 , true , "uppsala");
//		System.out.println(h2.partner);
//		h2.partnerDetails();
//		System.out.println(h2.getNo_of_blankett());
		
//		Human h3 = new Human("fahad",20,false,"stockholm");
//		h3.parnterAge();

	}

}

import java.util.Scanner;

public class FreshMart {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("===========================================");
		System.out.println("Hi!");
		System.out.println("Welcome to FreshMart Vegetables Shop!");
		System.out.println("===========================================");
		System.out.println();
		System.out.println("============following vegetables are avialable============");
		System.out.println("1.Potato		Price Rate=Rs30/kg");
		System.out.println("2.Onion			Price Rate=Rs40/kg");
		System.out.println("3.Tomato    		Price Rate=Rs25/kg");
		System.out.println("4.Cauliflower		price Rate=Rs40/kg");
		System.out.println("5.Broccoli 		Price Rate=Rs80/kg");
		System.out.println();
		System.out.println("Let's start Shopping!");
		System.out.println("Select an option to collect the vegetables(For Example,press 2 to select onion)");

		
		Vegetables v[]=new Vegetables[5];
		while(true)
		{
			System.out.println("select a vegetables(if Shopping is Done press 6 to generate a Bill:");
			int veg=sc.nextInt();
			switch(veg)
			{
			case 1:
				v[0]=new Vegetables();
				System.out.println("Enter quantity of Potatoes in kg:");
				float q1=sc.nextFloat();
				v[0].setVname("Potatoes");
				v[0].setQuantity(q1);
				v[0].setPrice(30);
				break;
			case 2:
				v[1]=new Vegetables();
				System.out.println("Enter quantity of onions in kg:");
				float q2=sc.nextFloat();
				v[1].setVname("Onions");
				v[1].setQuantity(q2);
				v[1].setPrice(40);
				break;
			case 3:
				v[2]=new Vegetables();
				System.out.println("Enter quantity of Tomatoes in kg:");
				float q3=sc.nextFloat();
				v[2].setVname("Tomatoes");
				v[2].setQuantity(q3);
				v[2].setPrice(25);
				break;
			case 4:
				v[3]=new Vegetables();
				System.out.println("Enter quantity of Cauliflower in kg:");
				float q4=sc.nextFloat();
				v[3].setVname("Cauliflower");
				v[3].setQuantity(q4);
				v[3].setPrice(40);
				break;
			case 5:
				v[4]=new Vegetables();
				System.out.println("Enter quantity of Broccoli in kg:");
				float q5=sc.nextFloat();
				v[4].setVname("Broccoli");
				v[4].setQuantity(q5);
				v[4].setPrice(80);
				break;
			case 6:
				toGenerateBill(v);
				System.exit(0);
				break;
			default:
				System.out.println("Something went Wrong.Please choose valid Option!");
				break;
			}
			}
		

	}
	
	
	private static void toGenerateBill(Vegetables[] v) {
		float sum=0;
		for (int i = 0; i < v.length; i++) {
			if(v[i]!=null)
			sum=sum+(v[i].getPrice()*v[i].getQuantity());	
		}
		System.out.println("===========================================");
		System.out.println("Vegetables name  Quantity(kg)  PriceRate(per kg)  Sum(Rs)");
		for (int i = 0; i < v.length; i++) {
			if(v[i]!=null)
			System.out.println(v[i].getVname()+"  "+v[i].getQuantity()+"  "+v[i].getPrice()+" "+(v[i].getQuantity()*v[i].getPrice()));
			
		}
		System.out.println("=========================");
		System.out.println("Total Bill:"+sum);
		System.out.println();
		System.out.println("Thank you for shopping! Have a nice day :) :)");
		
	}

}

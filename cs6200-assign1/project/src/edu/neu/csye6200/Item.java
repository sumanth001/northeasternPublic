package edu.neu.csye6200;

import java.util.Scanner;

public class Item {
	
	public static String REVISION ;
	private ShoppingItem orderedItems[];
	private Payment payment;
	
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public static void demo() {
		
		Item item = new Item();
		item.getOrder();
		item.calBill();
		System.out.println(item.toString());
		
	}
	
	public void calBill(){
		float totalSum =0;
		
		for(int i=0; i<orderedItems.length; i++) {
			if(orderedItems[i]!=null) {
				totalSum +=orderedItems[i].getItemPrice();
			}
		}
		float changeValue = 20 - totalSum;
		payment=new Payment(totalSum, changeValue);
		
		
	}
	
	public void getOrder() {
		System.out.println("Hey Welcome to walmart. Please Enter the following Items.");
		Scanner input = new Scanner(System.in);
		ShoppingItem[] itemArray = new ShoppingItem[5];

		while(true) {
			System.out.println("Enter the item Number");
			System.out.println("1: Apple(2$ per piece)"); //2 dollars
			System.out.println("2: Pencil(1$ per piece)"); //1 dollars
			System.out.println("3: Notebooks(3$ per piece)"); //3 dollars
			System.out.println("4: Milk(4$ per gallon)");  //4 dollars
			System.out.println("5: Eggs(3$ per dozen)"); //3 dollars
			System.out.println("0: Continue to checkout");
			int orderItem = input.nextInt();
			boolean isCheckout = false;
			switch(orderItem) {
				case 0:
					isCheckout= true;
					break;
				case 1: 
					System.out.println("Enter the number of apples");
					int n = input.nextInt();
					int price = 2* n;
					ShoppingItem s1 = new ShoppingItem("Apple",price,n);
					itemArray[0]=s1;
					
					break;
				case 2: 
					System.out.println("Enter the number of Pencil");
					n = input.nextInt();
					price = 1* n;
					ShoppingItem s2 = new ShoppingItem("Pencil",price,n);
					itemArray[1]=s2;
					break;
				case 3: 
					System.out.println("Enter the number of notebooks");
					n = input.nextInt();
					price = 3* n;
					ShoppingItem s3 = new ShoppingItem("NoteBook",price,n);
					itemArray[2]=s3;
					break;
				case 4: 
					System.out.println("Enter the gallon of milk");
					n = input.nextInt();
					price = 4* n;
					ShoppingItem s4 = new ShoppingItem("Milk",price,n);					
					itemArray[3]=s4;
					break;
				case 5: 
					System.out.println("Enter no of trays of eggs");
					n = input.nextInt();
					price = 3* n;
					ShoppingItem s5 = new ShoppingItem("Eggs",price,n);					
					itemArray[4] = s5;
					break;
			
				default:
					System.out.println("Item not found. Enter correct serial number.");
					break;
			}
			
			if(isCheckout) {
				break;
			}
		}
		
		setOrderedItems(itemArray);
	}
	

	public ShoppingItem[] getOrderedItems() {
		return orderedItems;
	}


	public void setOrderedItems(ShoppingItem[] orderedItems) {
		this.orderedItems = orderedItems;
	}


	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("Billing");
		st.append("\n");
		st.append("Item(no of Items): Cost");
		st.append("\n");
		for(int i=0; i<orderedItems.length;i++) {
			if(orderedItems[i]!=null) {
				st.append(orderedItems[i].getItemName());
				st.append("(");
				st.append(orderedItems[i].getNumberOfItems());
				st.append("):");
				st.append(orderedItems[i].getItemPrice());
				st.append("\n");
			}
			
		}
		st.append("------------");
		st.append("\n");
		st.append("Total::");
		st.append(payment.getPaidValue());
		st.append("\n");
		st.append("Paid amount::");
		st.append("20");
		st.append("\n");
		st.append("Change amount::");
		st.append(payment.getChangeValue());
		return st.toString();
	}
	
}

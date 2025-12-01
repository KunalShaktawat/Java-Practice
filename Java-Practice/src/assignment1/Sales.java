package assignment1;

import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total sales: ");
		float sale =sc.nextFloat();
		System.out.println("Sale ammount: "+sale);
		float commission;
		if(sale>30000) {
			commission=25/100f;
		}else if(sale>20000) {
			commission=20/100f;
		}else if(sale>10000) {
			commission=10/100f;
		}else {
			commission=0/100f;
		}
		System.out.println("Commission: "+commission);
		float total=sale-sale*commission;
		System.out.println("Total: "+total);
	}

}

package gyak_02_26;

import java.util.Scanner;

public class szamologep {

	public static void main(String[] args) {
		Scanner bemenet = new Scanner(System.in);
		System.out.println("Kerem az elso erteket: ");
		System.out.println("az elso operandus erteke ");
		double elso_operandus=bemenet.nextDouble();
		 
					System.out.println("Kerem a masodik erteket: ");
					System.out.println("a masodik operandus erteke: ");
					double masodik_operandus = bemenet.nextDouble();
				
		 
						System.out.println("Kerem az operatort! ");
						System.out.println("operator: ");
						String operator=bemenet.nextLine();
							
		double eredmeny;
		switch(operator){
		
		case "+":
			eredmeny=elso_operandus+masodik_operandus;
			System.out.print("Eredmeny: "+eredmeny);
			break;
			
		case "-":
			eredmeny=elso_operandus-masodik_operandus;
			System.out.print("Eredmeny: "+eredmeny);
			break;
		case "*":
			eredmeny=elso_operandus*masodik_operandus;
			System.out.print("Eredmeny: "+eredmeny);
			break;
		case "/":
			eredmeny=elso_operandus/masodik_operandus;
			System.out.print("Eredmeny: "+eredmeny);
			break;
		
		}
		
						
						
		
				 System.out.println(elso_operandus);
		bemenet.close();
	}

}

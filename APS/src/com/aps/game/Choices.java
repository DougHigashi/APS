package com.aps.game;
import java.util.Scanner;

public class Choices {
	
	protected int choice;
	protected static String outText= "O dia come�ou\nVoc� quer tomar um banho?\n1 - Sim    2 - N�o  ";
	
	
	public Choices(Banho banho, Teeth teeth, Breakfast breakfast, Car car, Subway subway, Uber uber, Faltar faltar) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your score: " + Score.getScore() );
		System.out.println("O dia come�ou");
		System.out.println("Voc� quer tomar um banho?");
		System.out.println("1 - Sim    2 - N�o  ");
		
//		outText = "Your score: " + Score.getScore() +"\nO dia come�ou\nVoc� quer tomar um banho?\n1 - Sim    2 - N�o  ";
		choice = scanner.nextInt();
		
		if(choice == 1) {banho.sim();}
		else if(choice == 2) {banho.nao();}
		
		
		System.out.println("Your score: " + Score.getScore());
		System.out.println("Voc� quer escovar os dentes?");
		System.out.println("1 - Sim    2 - N�o  ");
		
		outText = "\nVoc� quer escovar os dentes?\n1 - Sim    2 - N�o  ";
		choice = scanner.nextInt();
		
		if(choice == 1) {teeth.sim();}
		else if(choice == 2) {teeth.nao();}
		
		System.out.println("Your score: " + Score.getScore());
		System.out.println("Voc� quer tomar caf� da manh�?");
		System.out.println("1 - Sim    2 - N�o  ");
		
		outText = "Your score: " + Score.getScore() + "Voc� quer tomar caf� da manh�?\n1 - Sim    2 - N�o  ";
		choice = scanner.nextInt();
		
		if(choice == 1) {breakfast.sim();}
		else if(choice == 2) {breakfast.nao();}
		
		if(teeth.chosen == true && breakfast.chosen == true) {
			System.out.println("Your score: " + Score.getScore());
			System.out.println("Voc� quer escovar os dentes de novo?");
			System.out.println("1 - Sim    2 - N�o  ");
			
			outText = "Your score: " + Score.getScore() + "Voc� quer escovar os dentes de novo?\n1 - Sim    2 - N�o  ";
			choice = scanner.nextInt();
			
			if(choice == 1) {teeth.sim2();}
			else if(choice == 2) {teeth.nao();}
		}
		System.out.println("Your score: " + Score.getScore());
		System.out.println("Voc� precisa ir para a faculdade");
		System.out.println("Quer ir de carro?");
		System.out.println("1 - Sim    2 - N�o  ");
		
		outText = "Your score: " + Score.getScore() + "Voc� precisa ir para a faculdade\nQuer ir de carro?\n1 - Sim    2 - N�o  ";
		choice = scanner.nextInt();
		
		if(choice == 1) {car.sim();}
		else if(choice == 2) {car.nao();}
		
		if(car.chosen == false) {
			System.out.println("Quer ir de metr�?");
			System.out.println("1 - Sim    2 - N�o  ");
			
			outText= "Quer ir de metr�?\n1 - Sim    2 - N�o  ";
			choice = scanner.nextInt();
			
			if(choice == 1) {subway.sim();}
			else if(choice == 2) {subway.nao();}
			
			if(subway.chosen == false) {
				System.out.println("Quer ir de uber?");
				System.out.println("1 - Sim    2 - N�o  ");
				
				outText="Quer ir de uber?\n1 - Sim    2 - N�o  ";
				choice = scanner.nextInt();
				
				if(choice == 1) {subway.sim();}
				else if(choice == 2) {subway.nao();}
				
				if(subway.chosen == false) {
					System.out.println("Voc� escolheu faltar. Pelo menos ta salvando o planeta ;)");
					outText= "Voc� escolheu faltar. Pelo menos ta salvando o planeta ;)";
					faltar.sim();
				}
				
			}
		}
		dayEnd();
	}
	public void dayEnd() {
		System.out.println("Sua pontua��o final foi: " + Score.getScore());
	}
	
	public static String getString() {
		return outText;
	}

}	


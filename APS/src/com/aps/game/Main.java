package com.aps.game;

import java.util.Scanner;

public class Main {
	Banho banho = new Banho();
	Teeth teeth = new Teeth();
	Breakfast breakfast = new Breakfast();
	Car car = new Car();
	Subway subway = new Subway();
	Uber uber = new Uber();
	Faltar faltar = new Faltar();
	Resposta resposta = new Resposta();
	protected String respondido;
	Scanner scanner = new Scanner(System.in);

	
	
	public void day(){
		Game_Window game = new Game_Window();
		banho.question();
		scanner.hasNext();
		if(game.getResposta() == "Sim") {
			banho.sim();
		}else if(game.getResposta() == "Nao") {
			banho.nao();
		}
		teeth.question();
	}

	public static void main(String[] args) {
		Main main = new Main();
		Game_Window game = new Game_Window();
		Banho banho = new Banho();
		Teeth teeth = new Teeth();
		Breakfast breakfast = new Breakfast();
		Car car = new Car();
		Subway subway = new Subway();
		Uber uber = new Uber();
		Faltar faltar = new Faltar();
		Resposta resposta = new Resposta();
		Thread t1 = new Thread(game);
		
		game.run();
		main.day();

	}

}

package com.aps.game;

public class Banho {
	
	//Variaveis
	protected boolean chosen;
	
	//M�todos
	protected void sim() {
		System.out.println("Voc� escolheu tomar banho");
		Score.scoreMinus();
		this.setChosen(true);
	}
	
	protected void nao() {
		System.out.println("Voc� escolheu n�o tomar banho");
		Score.scoreUp();
		this.setChosen(false);
	}
	
	protected void setChosen(Boolean b) {
		this.chosen = b;
	}
	
}

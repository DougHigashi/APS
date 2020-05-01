package com.aps.game;

public class Banho {
	
	//Variaveis
	protected boolean chosen;
	protected String outText;
	
	//M�todos
	protected void sim() {
		System.out.println("Voc� escolheu tomar banho");
		Score.scoreMinus();
		this.setChosen(true);
	}
	
	protected void nao() {
		System.out.println("Voc� escolheu n�o tomar banho");
		Score.scoreUp();
		setChosen(false);
	}
	
	protected void setChosen(Boolean b) {
		this.chosen = b;
	}
	protected void question() {
		outText= "<html><center>O dia come�ou<br>Voc� quer tomar um banho?</center></html>";


	}
	
}

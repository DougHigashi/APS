package com.aps.game;

public class Banho {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected boolean pressed = false;

	// M�todos
	public void sim() {
		System.out.println("Voc� escolheu tomar banho");
		Score.scoreMinus();
		this.setChosen(true);
	}

	public void nao() {
		System.out.println("Voc� escolheu n�o tomar banho");
		Score.scoreUp();
		setChosen(false);
	}

	public void setChosen(Boolean b) {
		this.chosen = b;
	}

	public void setPressed(Boolean b) {
		this.setPressed(b);
	}

	public void question() {
		Game_Window.setText("<html><center>O dia come�ou<br>Voc� quer tomar um banho?</center></html>");	
	}
}

package com.aps.game;

public class Faltar {

	// Variaveis
	protected boolean chosen;
	protected String outText;
	// M�todos
	protected void sim() {
		this.setChosen(true);
	}

	protected void setChosen(Boolean b) {
		this.chosen = b;
	}

	protected void question(Resposta resposta) {
		Game_Window.setText("<html><center>Voc� escolheu faltar. Pelo menos ta salvando o planeta ;)</html></center>");

	}
	

}

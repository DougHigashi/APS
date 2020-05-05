package com.aps.game;

public class Uber {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected String outText;
	protected String resposta = resp.getResposta();

	// M�todos
	protected void sim() {
		System.out.println("Voc� escolheu ir de uber");
		this.setChosen(true);
	}

	protected void nao() {
		System.out.println("Voc� escolheu n�o ir de uber");
		this.setChosen(false);
	}

	protected void setChosen(Boolean b) {
		this.chosen = b;
	}

	protected void question(Resposta resposta) {
		resp.setResposta(null);
		Game_Window.setText("<html><center>Quer ir de uber?<br>1 - Sim    2 - N�o  </center></html>");
		Game_Window game = new Game_Window();

		if (game.yes_button.getModel().isPressed()) {
			this.sim();
			resp.setResposta("Sim");

		} else if (game.no_button.getModel().isPressed()) {
			this.nao();
			resp.setResposta("N�o");

		}
	}

}

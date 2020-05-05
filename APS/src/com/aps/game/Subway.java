package com.aps.game;

public class Subway {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected String outText;
	protected String resposta = resp.getResposta();
	// M�todos
	protected void sim() {
		System.out.println("Voc� escolheu ir de metr�");
		this.setChosen(true);
	}

	protected void nao() {
		System.out.println("Voc� escolheu n�o ir de metr�");
		this.setChosen(false);
	}

	protected void setChosen(Boolean b) {
		this.chosen = b;
	}

	protected void question(Resposta resposta) {
		resp.setResposta(null);
		Game_Window game = new Game_Window();
		Game_Window.setText("<html><center>Quer ir de metr�?<br>1 - Sim    2 - N�o  </center></html>");
		if (game.yes_button.getModel().isPressed()) {
			this.sim();
			resp.setResposta("Sim");

		} else if (game.no_button.getModel().isPressed()) {
			this.nao();
			resp.setResposta("N�o");

		}

	}
}

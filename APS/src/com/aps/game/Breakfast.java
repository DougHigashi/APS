package com.aps.game;

public class Breakfast {
	Resposta resp = new Resposta();
	// Variaveis
	protected boolean chosen;
	protected String outText;

	// M�todos
	protected void sim() {
		System.out.println("Voc� escolheu tomar caf� da manh�");
		this.setChosen(true);
	}

	protected void nao() {
		System.out.println("Voc� escolheu n�o tomar caf� da manh�");
		this.setChosen(false);
	}

	protected void setChosen(Boolean b) {
		this.chosen = b;
	}

	protected void question(Resposta resposta) {
		resp.setResposta(null);
		Game_Window.setText("<html><center>Voc� quer tomar caf� da manh�?<br>1 - Sim    2 - N�o  </center></html>");
		Game_Window game = new Game_Window();

		Game_Window.setText("<html><center>O dia come�ou<br>Voc� quer tomar um banho?</center></html>");
		if (game.yes_button.getModel().isPressed()) {
			this.sim();
			resp.setResposta("Sim");

		} else if (game.no_button.getModel().isPressed()) {
			this.nao();
			resp.setResposta("N�o");

		}
	}

}

package com.aps.game;

public class Car {
	
	//Variaveis
		protected boolean chosen;
		protected String outText;
		
		//M�todos
		protected void sim() {
			System.out.println("Voc� escolheu ir de carro");
			Score.scoreMinus();
			this.setChosen(true);
		}
		
		protected void nao() {
			System.out.println("Voc� escolheu n�o ir de carro");
			Score.scoreUp();
			this.setChosen(false);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}
		protected void question() {
			outText = "<html><center>Voc� precisa ir para a faculdade<br>Quer ir de carro?\n1 - Sim    2 - N�o  </center></html>";
		}

}

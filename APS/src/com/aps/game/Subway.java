package com.aps.game;

public class Subway {
	
	//Variaveis
		protected boolean chosen;
		protected String outText;
		
		//M�todos
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
		protected void question() {
			outText= "<html><center>Quer ir de metr�?<br>1 - Sim    2 - N�o  </center></html>";
		}

}

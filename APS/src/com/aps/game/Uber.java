package com.aps.game;

public class Uber {
	
	//Variaveis
		protected boolean chosen;
		protected String outText;
		
		//M�todos
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
		protected void question() {
			outText="<html><center>Quer ir de uber?<br>1 - Sim    2 - N�o  </center></html>";
		}

}

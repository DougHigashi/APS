package com.aps.game;

public class Uber {
	
	//Variaveis
		protected boolean chosen;
		
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

}

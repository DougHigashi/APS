package com.aps.game;

public class Faltar {
	
	//Variaveis
		protected boolean chosen;
		
		//M�todos
		protected void sim() {
			System.out.println("Voc� escolheu n�o ir a faculdade");
			this.setChosen(true);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}

}

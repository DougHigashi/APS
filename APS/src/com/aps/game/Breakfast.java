package com.aps.game;

public class Breakfast {
	
	//Variaveis
	protected boolean chosen;
	
		//M�todos
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
		

}

package com.aps.game;

public class Breakfast {
	
	//Variaveis
	protected boolean chosen;
	protected String outText;
	
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
		protected void question() {
			outText = "<html><center>Voc� quer tomar caf� da manh�?<br>1 - Sim    2 - N�o  </center></html>";
		}
		

}

package com.aps.game;

public class Teeth {
	
	//Variaveis
		protected boolean chosen;
		protected short times = 0;
		protected String outText;
		
		//M�todos
		protected void sim() {
			System.out.println("Voc� escolheu escovar os dentes");
			this.times++;
			this.setChosen(true);
		}
		protected void sim2() {
			System.out.println("Voc� escolheu escovar os dentes de novo");
			Score.scoreMinus();
			this.times++;
		}
		
		protected void nao() {
			System.out.println("Voc� escolheu n�o escovar os dentes");
			this.setChosen(false);
		}
		
		protected void setChosen(Boolean b) {
			this.chosen = b;
		}
		
		protected short getTimes() {
			return times;
		}
		protected void question() {
			if(times==0) {
				outText = "<html><center>Voc� quer escovar os dentes?<br>1 - Sim    2 - N�o  </center></html>";
			}
			else if(times == 1) {
				outText = "<html><center>Voc� quer escovar os dentes de novo?<br>1 - Sim    2 - N�o  </center></html>";
			}
		}
		
}

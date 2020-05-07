package com.aps.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YesPressed implements ActionListener {
	Resposta resp = new Resposta();
	protected boolean pressed = false;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		resp.setResposta("Sim");
		pressed = true;
	}
	public void resetPressed() {
		this.pressed = false;
	}
	public boolean getPressed() {
		return pressed;
	}

}

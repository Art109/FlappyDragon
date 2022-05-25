package com.arthur.graficos;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.arthur.main.Game;



public class UI {
	


	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("arial", Font.BOLD,18));
		g.drawString("Pontos: " + Game.Score, 30, 30);
	}
	
}

package com.arthur.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.arthur.main.Game;

public class Torre extends Entity {
	
	
	public Torre(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
		// TODO Auto-generated constructor stub
	}

	public void tick(){
		x--;
		if(x+width <= 0) {
			Game.Score++;
			Game.entities.remove(this);
			return;
		}
	}
	
	public void render(Graphics g) {
		if(sprite != null) {
			g.drawImage(sprite, this.getX(), this.getY(), width, height, null);
		}
		else {
			g.setColor(Color.DARK_GRAY);
			g.fillRect((int)x, (int)y, width, height);
		}	
	}
}

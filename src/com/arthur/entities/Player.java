package com.arthur.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.arthur.main.Game;
import com.arthur.world.Camera;
import com.arthur.world.World;




public class Player extends Entity{
	
	
	private int frames = 0, maxFrames= 8 , index = 0 , maxIndex = 1;
	
	public boolean Jump = false;
	
		
	public BufferedImage[] MoveSprite;

	


	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
		
		MoveSprite = new BufferedImage[2];
		
		for(int i = 0 ; i < 2 ; i++) {
			MoveSprite[i] = Game.spritesheet.getSprite(0, 0 + (i * 16), 16, 16);
		}
	}
	
	public void tick(){
		
		if(!Jump) {
			y+=1;
		}
		else {
			y-=1;
		}
		if(y > Game.HEIGHT )  {
			World.restartGame();
		}

		frames++;
		if(frames == maxFrames) {
			frames = 0;
			index++;
			if(index > maxIndex) {
				index = 0;
			}
		}
		
		for(int i = 0 ; i < Game.entities.size(); i++) {
			Entity e = Game.entities.get(i);
			if(e != this) {
				if(Entity.isColidding(this, e)) {
					World.restartGame();
				}
			}
			
		}
		

	}
	
	
	
	
	
	public void render(Graphics g) {
		g.drawImage(MoveSprite[index],this.getX() - Camera.x,this.getY() - Camera.y,null);
	}

	


}

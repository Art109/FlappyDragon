package com.arthur.world;



import java.util.Random;

import com.arthur.entities.Torre;
import com.arthur.main.Game;

public class TorreGenerator {
	
	
	public int time = 0 ;
	public int targetTime = 60;
	public Random rand = new Random();
	
	public void tick() {
		time++;
		if(time == 60) {
			time = 0;
			int altura1 = rand.nextInt(100 - 60) + 60;
			int altura2 = rand.nextInt(100 - 60) + 80;
			Torre torre1 = new Torre(Game.WIDTH,0,20,altura1,1,null);		
			Torre torre2 = new Torre(Game.WIDTH,Game.WIDTH - altura2,20,altura2,1,null);	
			
			
			Game.entities.add(torre1);
			Game.entities.add(torre2);
		}
	}
}

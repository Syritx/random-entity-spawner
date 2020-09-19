package me.Syritx.CommandsLib;

import java.util.Random;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockBreakEvent;

public class Events implements Listener {
	
	@EventHandler
	public void blockBreak(BlockBreakEvent e) {
		
		Block block = e.getBlock();
		Location blockLocation = block.getLocation();
		World world = block.getWorld();
		
		for (int i = 0; i < 5; i++) {
			int id = new Random().nextInt(EntitiesToSpawn.types.length);
			world.spawnEntity(blockLocation, EntitiesToSpawn.types[id]);
		}
	}
}

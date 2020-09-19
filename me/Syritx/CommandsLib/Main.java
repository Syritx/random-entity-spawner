package me.Syritx.CommandsLib;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new Events(), this);
	}
	
	@Override
	public void onDisable() {}
}

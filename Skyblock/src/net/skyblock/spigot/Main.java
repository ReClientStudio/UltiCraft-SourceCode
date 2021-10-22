package net.skyblock.spigot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.skyblock.spigot.cmds.SkyBlockGuide;
import net.skyblock.spigot.cmds.SkyBlockItemDebug;
import net.skyblock.spigot.events.BookOnClick;
import net.skyblock.spigot.events.BreakBlock;
import net.skyblock.spigot.events.ItemInteract;
import net.skyblock.spigot.events.Join;;

public class Main extends JavaPlugin{
	
	public static Main instance;

	@Override
	public void onEnable() {
		registerEvents();
		getCommand("skyblockitemdebug").setExecutor(new SkyBlockItemDebug());
		getCommand("skyblockguide").setExecutor(new SkyBlockGuide());
	}
	
	//public static Plugin plugin = Main.getPlugin(Main.class);
	
	@Override
	public void onDisable() {
		
	}
	
	private void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		//pm.registerEvents(new AdvanceRecipe(), this);
		pm.registerEvents(new BreakBlock(), this);
		pm.registerEvents(new ItemInteract(), this);
		pm.registerEvents(new Join(), this);
		pm.registerEvents(new BookOnClick(), this);
		
	}
	
	public static Main getInstance(){
        return instance;
    }
	
}

package net.ulticraft.practice;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.ulticraft.practice.events.QueueLeave;
import net.ulticraft.practice.events.UnrankedGUIInteract;
import net.ulticraft.practice.events.UnrankedInteract;
import net.ulticraft.practice.events.join;
import net.ulticraft.practice.events.noDrop;


public class Main extends JavaPlugin{
	
	public static HashMap<Player, Player> combat = new HashMap<Player, Player>();
	
	@Override
	public void onEnable() {
		System.out.println("Practice > On");
		registerEvents();
	}
	
	private void registerEvents() {
		//Ex: pm.registerEvent(new UnClassAyantUnListener(), this);

		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new join(), this);
		pm.registerEvents(new UnrankedInteract(), this);
		pm.registerEvents(new UnrankedGUIInteract(), this);
		pm.registerEvents(new noDrop(), this);
		pm.registerEvents(new QueueLeave(), this);
	}

	@Override
	public void onDisable() {
		System.out.println("Practice > Off");
		
	}

}

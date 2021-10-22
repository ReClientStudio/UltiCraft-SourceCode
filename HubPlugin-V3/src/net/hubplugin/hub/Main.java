package net.hubplugin.hub;

import java.util.HashMap;
import java.util.Map;

import net.hubplugin.hub.cmds.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.hubplugin.hub.coins.Coins;
import net.hubplugin.hub.events.JeuxGUIInteract;
import net.hubplugin.hub.events.JeuxInteract;
import net.hubplugin.hub.events.PlayerChat;
import net.hubplugin.hub.events.PracticeObjetEvent;
import net.hubplugin.hub.events.join;
import net.hubplugin.hub.events.noDrop;
import net.hubplugin.hub.mysql.MySQL;
import net.hubplugin.hub.rank.Rank;
import net.hubplugin.hub.scoreboards.ScoreboardSign;

public class Main extends JavaPlugin
{
	
	public Map<Player, ScoreboardSign> lobby = new HashMap<>();
	
	public MySQL mysql = new MySQL();
	public Rank rank = new Rank(this);
	public Coins coins = new Coins(this);
	
	@Override
	public void onEnable()
	{
		
		System.out.println("Hub > On");
		registerCommands();
		registerEvents();
		this.getCommand("hub").setExecutor(new HubCommand());
		this.getCommand("ac").setExecutor(new AcCommand(this));
		this.getCommand("manage").setExecutor(new ManageCommand(this));
		this.getCommand("fly").setExecutor(new FlyCommand(this));
		this.getCommand("coins").setExecutor(new CoinsCommand(this));
		mysql.connect("url", "database", 3306, "user", "password");
	}

	private void registerCommands()
	{}

	private void registerEvents()
	{
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new join(this), this);
		pm.registerEvents(new noDrop(), this);
		pm.registerEvents(new JeuxInteract(), this);
		pm.registerEvents(new JeuxGUIInteract(), this);
		pm.registerEvents(new PlayerChat(this), this);
		pm.registerEvents(new PracticeObjetEvent(), this);
	}
	
	@Override
	public void onDisable()
	{ mysql.disconnect();}
	
}
 
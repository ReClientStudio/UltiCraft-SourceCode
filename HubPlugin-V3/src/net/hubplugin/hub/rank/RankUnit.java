package net.hubplugin.hub.rank;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;

public enum RankUnit {
	
	JOUEUR(0, "Joueur", "§7", ChatColor.GRAY),
	VIP(1, "Vip", "Vip ", ChatColor.GREEN),
	VIP1(2, "Vip+", "Vip"+ChatColor.RED+"+ ", ChatColor.GREEN),
	MVP(3, "MVP", "Mvp ", ChatColor.AQUA),
	MVP1(4, "MVP+", "§bMvp"+ChatColor.RED+"+ ", ChatColor.AQUA),
	MVP2(5, "MVP++", "Mvp"+ChatColor.RED+"++ ", ChatColor.GOLD),
	YOUTUBER(6, "YOUTUBER", "Youtube ", ChatColor.RED),
	HELPER(7, "HELPER", "Helper ", ChatColor.BLUE),
	MOD(8, "MOD", "Moderator ", ChatColor.DARK_GREEN),
	SUPMOD(9, "SUPMOD", "Super-Mod ", ChatColor.RED),
	ADMIN(10, "ADMIN", "Admin ", ChatColor.RED);

	private int power;
	private String name;
	private String prefix;
	private ChatColor color;
	
	private static Map<Integer, RankUnit> ID_MAP = new HashMap<>();
	
	private RankUnit(int power, String name, String prefix, ChatColor color) {
		this.power = power;
		this.name = name;
		this.prefix = prefix;
		this.color = color;
	}
	
	static {
		for(RankUnit rank : values()) {
			ID_MAP.put(rank.power, rank);
		}
	}
	
	public static RankUnit getFromPower(int power) {
		return ID_MAP.get(power);
	}
	
	public int getPower() {
		return power;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public ChatColor getColor() {
		return color;
	}
	
	
}

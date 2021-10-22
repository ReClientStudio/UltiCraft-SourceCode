package net.ulticraft.practice.utils;

import net.md_5.bungee.api.ChatColor;

public class ChatUtils {

	public static String format(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	
	public static String formatWithPrefix(String message) {
		return ChatColor.translateAlternateColorCodes('&', "§9Practice §6> §7" + message);
	}
	
}

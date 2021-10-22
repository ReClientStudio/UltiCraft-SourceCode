package net.ulticraft.practice.utils;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.entity.Player;

public class QueueManager {

	public static ArrayList<Player> unrankedDiamond = new ArrayList<Player>();
	public static ArrayList<Player> unrankedGapple = new ArrayList<Player>();
	public static ArrayList<Player> unrankedNoDebuff = new ArrayList<Player>();
	public static ArrayList<Player> unrankedClassic = new ArrayList<Player>();
	public static ArrayList<Player> unrankedSoup = new ArrayList<Player>();
	public static ArrayList<Player> rankedDebuff = new ArrayList<Player>();
	public static HashMap<Player, Player> fightingPlayer = new HashMap<Player, Player>();
	
	/*
	 * 
	 *  Unranked Diamond Queue
	 * 
	 */
	
	public static Integer getUnrankedDiamondSize() {
		return unrankedDiamond.size();
	}
	
	public static void addUnrankedDiamond(Player p) {
		unrankedDiamond.add(p);
	}
	
	public static void removeUnrankedDiamond(Player p) {
		unrankedDiamond.remove(p);
	}
	
	/*
	 * 
	 *  Fighting Player
	 * 
	 */
	
	public static Player getFightingPlayer(Player p) {
		return fightingPlayer.get(p);
	}
	
	public static void addFightingPlayer(Player p, Player t) {
		fightingPlayer.put(p, t);
		fightingPlayer.put(t, p);
	}
	
	public static void removeFightingPlayer(Player p, Player t) {
		fightingPlayer.remove(p, t);
		fightingPlayer.remove(t, p);
	}
	
	/*
	 * 
	 *  Unranked Gapple Queue
	 * 
	 */
	
	public static Integer getUnrankedGappleSize() {
		return unrankedGapple.size();
	}
	
	public static void addUnrankedGapple(Player p) {
		unrankedGapple.add(p);
	}
	
	public static void removeUnrankedGapple(Player p) {
		unrankedGapple.remove(p);
	}
	
	/*
	 * 
	 *  Unranked NoDebuff Queue
	 * 
	 */
	
	public static Integer getUnrankedNoDebuffSize() {
		return unrankedNoDebuff.size();
	}
	
	public static void addUnrankedNoDebuff(Player p) {
		unrankedNoDebuff.add(p);
	}
	
	public static void removeUnrankedNoDebuff(Player p) {
		unrankedNoDebuff.remove(p);
	}
	
	/*
	 * 
	 *  Unranked Classic Queue
	 * 
	 */
	
	public static Integer getUnrankedClassicSize() {
		return unrankedClassic.size();
	}
	
	public static void addUnrankedClassic(Player p) {
		unrankedClassic.add(p);
	}
	
	public static void removeUnrankedClassic(Player p) {
		unrankedClassic.remove(p);
	}
	
	/*
	 * 
	 * Ranked Debuff Queue
	 *
	 */
	
	public static Integer getrankedNoDebuffSize() {
		return rankedDebuff.size();
	}
	
	public static void addrankedNoDebuff(Player p) {
		rankedDebuff.add(p);
	}
	
	public static void removerankedNoDebuff(Player p) {
		rankedDebuff.remove(p);
	}
	
	/*
	 * 
	 *  Unranked NoDebuff Queue
	 * 
	 */
	
	public static Integer getUnrankedSoupSize() {
		return unrankedSoup.size();
	}
	
	public static void addUnrankedSoup(Player p) {
		unrankedSoup.add(p);
	}
	
	public static void removeUnrankedSoup(Player p) {
		unrankedSoup.remove(p);
	}
	
}

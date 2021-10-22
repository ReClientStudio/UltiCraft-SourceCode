package net.ulticraft.practice.asset;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Classic {
	
	public static void giveItems(Player p) {
		Inventory inv = p.getInventory();
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFoodLevel(20);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.getInventory().clear();
		
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 0, 0),true);
		
		ItemStack Sword = new ItemStack(Material.IRON_SWORD);
		ItemStack Bow = new ItemStack(Material.BOW);
		ItemStack CanneAPeche = new ItemStack(Material.FISHING_ROD);
		ItemStack Gapple = new ItemStack(Material.GOLDEN_APPLE, 3);
		ItemStack Arrow = new ItemStack (Material.ARROW, 12);
		ItemStack H = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemStack C = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack L = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemStack B = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemStack Beef = new ItemStack(Material.COOKED_BEEF, 64);
		
		p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10000000, 2),true);
		
		inv.setItem(0, Sword);
		inv.setItem(1, CanneAPeche);
		inv.setItem(3, Bow);
		inv.setItem(4, Gapple);
		p.getInventory().setHelmet(H);
		p.getInventory().setChestplate(C);
		p.getInventory().setLeggings(L);
		p.getInventory().setBoots(B);
		inv.setItem(7, Arrow);
		inv.setItem(8, Beef);
	}
	
}

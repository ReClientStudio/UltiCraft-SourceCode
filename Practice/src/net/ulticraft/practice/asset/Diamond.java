package net.ulticraft.practice.asset;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Diamond {

	public static void giveItems(Player p) {
		Inventory inv = p.getInventory();
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0),true);
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFoodLevel(20);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.getInventory().clear();
		
		ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemStack H = new ItemStack(Material.DIAMOND_HELMET);
		ItemStack C = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemStack L = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemStack B = new ItemStack(Material.DIAMOND_BOOTS);
		ItemStack Beef = new ItemStack(Material.COOKED_BEEF, 64);
		
		inv.setItem(0, Sword);
		p.getInventory().setHelmet(H);
		p.getInventory().setChestplate(C);
		p.getInventory().setLeggings(L);
		p.getInventory().setBoots(B);
		inv.setItem(8, Beef);
	}
	
}

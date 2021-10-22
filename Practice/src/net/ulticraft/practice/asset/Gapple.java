package net.ulticraft.practice.kit;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Gapple {
	
	public static void giveItems(Player p) {
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0),true);
		p.getInventory().setHelmet(null);
		p.getInventory().setChestplate(null);
		p.getInventory().setLeggings(null);
		p.getInventory().setBoots(null);
		Inventory inv = p.getInventory();
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFoodLevel(20);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.getInventory().clear();
		
		ItemStack Gapple = new ItemStack(Material.GOLDEN_APPLE, 64, (short)1);
		
		ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta SwordM = Sword.getItemMeta();
		SwordM.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		SwordM.addEnchant(Enchantment.DURABILITY, 3, true);
		Sword.setItemMeta(SwordM);
		
		ItemStack H = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta HM = H.getItemMeta();
		HM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		HM.addEnchant(Enchantment.DURABILITY, 3, true);
		H.setItemMeta(HM);
		
		ItemStack C = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta CM = C.getItemMeta();
		CM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		CM.addEnchant(Enchantment.DURABILITY, 3, true);
		C.setItemMeta(CM);
		
		ItemStack L = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta LM = L.getItemMeta();
		LM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		LM.addEnchant(Enchantment.DURABILITY, 3, true);
		L.setItemMeta(LM);
		
		ItemStack B = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta BM = B.getItemMeta();
		BM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		BM.addEnchant(Enchantment.DURABILITY, 3, true);
		B.setItemMeta(BM);
		
		p.getInventory().setHelmet(H);
		p.getInventory().setChestplate(C);
		p.getInventory().setLeggings(L);
		p.getInventory().setBoots(B);
		
		p.addPotionEffect((new PotionEffect(PotionEffectType.SPEED, 200000, 1)));
		p.addPotionEffect((new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200000, 1)));
		
		inv.setItem(1, Gapple);
		inv.setItem(0, Sword);
		
	}	
}

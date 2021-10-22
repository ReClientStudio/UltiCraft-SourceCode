package net.ulticraft.practice.asset;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NoDebuff {
	
	public static void giveItems(Player p) {
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0),true);
		p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0),true);
		Inventory inv = p.getInventory();
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFoodLevel(20);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.getInventory().clear();
		
		ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta SwordM = Sword.getItemMeta();
		SwordM.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		SwordM.addEnchant(Enchantment.DURABILITY, 3, true);
		Sword.setItemMeta(SwordM);
		
		ItemStack H = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta HM = H.getItemMeta();
		HM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		HM.addEnchant(Enchantment.DURABILITY, 4, true);
		H.setItemMeta(HM);
		
		ItemStack C = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta CM = C.getItemMeta();
		CM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		CM.addEnchant(Enchantment.DURABILITY, 4, true);
		C.setItemMeta(CM);
		
		ItemStack L = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta LM = L.getItemMeta();
		LM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		LM.addEnchant(Enchantment.DURABILITY, 4, true);
		L.setItemMeta(LM);
		
		ItemStack B = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta BM = B.getItemMeta();
		BM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		BM.addEnchant(Enchantment.DURABILITY, 4, true);
		B.setItemMeta(BM);
		
		ItemStack Vie = new ItemStack(Material.POTION, 1, (short) 16421);
		ItemStack Speed = new ItemStack(Material.POTION, 1, (short) 8258);
		ItemStack Fire = new ItemStack(Material.POTION, 1, (short) 8259);
		ItemStack Beef = new ItemStack(Material.COOKED_BEEF, 64);
		
		p.getInventory().setHelmet(H);
		p.getInventory().setChestplate(C);
		p.getInventory().setLeggings(L);
		p.getInventory().setBoots(B);
		
		inv.setItem(0, Sword);
		
		inv.setItem(8, Beef);
		inv.setItem(7, Speed);
		inv.setItem(6, Fire);
		
		inv.setItem(1, Vie);
		inv.setItem(2, Vie);
		inv.setItem(3, Vie);
		inv.setItem(4, Vie);
		inv.setItem(5, Vie);
		inv.setItem(9, Vie);
		inv.setItem(10, Vie);
		inv.setItem(11, Vie);
		inv.setItem(12, Vie);
		inv.setItem(13, Vie);
		inv.setItem(14, Vie);
		inv.setItem(15, Vie);
		inv.setItem(16, Vie);
		inv.setItem(17, Vie);
		inv.setItem(18, Vie);
		inv.setItem(19, Vie);
		inv.setItem(20, Vie);
		inv.setItem(21, Vie);
		inv.setItem(22, Vie);
		inv.setItem(23, Vie);
		inv.setItem(24, Vie);
		inv.setItem(25, Vie);
		inv.setItem(26, Vie);
		inv.setItem(27, Vie);
		inv.setItem(28, Vie);
		inv.setItem(29, Vie);
		inv.setItem(30, Vie);
		inv.setItem(31, Vie);
		inv.setItem(32, Vie);
		inv.setItem(33, Vie);
		inv.setItem(34, Vie);
		inv.setItem(35, Vie);
	}
}

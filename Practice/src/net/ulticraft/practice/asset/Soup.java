package net.ulticraft.practice.asset;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Soup {
	
	public static void giveItems(Player p) {
		Inventory inv = p.getInventory();
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFoodLevel(20);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.getInventory().clear();
		
		ItemStack Sword = new ItemStack(Material.STONE_SWORD);
		
		ItemStack H = new ItemStack(Material.IRON_HELMET);

		ItemStack C = new ItemStack(Material.IRON_CHESTPLATE);
		
		ItemStack L = new ItemStack(Material.IRON_LEGGINGS);
		
		ItemStack B = new ItemStack(Material.IRON_BOOTS);
		
		ItemStack Vie = new ItemStack(Material.MUSHROOM_SOUP);
		ItemStack Beef = new ItemStack(Material.COOKED_BEEF, 64);
		
		p.getInventory().setHelmet(H);
		p.getInventory().setChestplate(C);
		p.getInventory().setLeggings(L);
		p.getInventory().setBoots(B);
		
		inv.setItem(0, Sword);
		
		inv.setItem(8, Beef);
		
		inv.setItem(7, Vie);
		inv.setItem(6, Vie);
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

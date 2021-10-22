package net.skyblock.spigot.utiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import net.skyblock.spigot.Main;

public class AdvanceRecipe extends BukkitRunnable implements Listener {
	
	private List<Character> shape = new LinkedList<Character>();
	private ItemStack result;
	@SuppressWarnings("unused")
	private Boolean register = false;
	private Boolean run = false;
	private Boolean crafted = false;
	private int slot;
	private Player player;
	private HashMap<Integer, ItemStack> ingredients = new HashMap<Integer, ItemStack>();
	
	public AdvanceRecipe(ItemStack result) {
		
		this.result = result;
		Main.plugin.getServer().getPluginManager().registerEvents(this, Main.plugin);
		
	}
	
	public void shape(String column1, String column2, String column3) {
		
		for (char character : column1.toCharArray()) {
			
			shape.add(character);
			
		}
		
		for (char character : column2.toCharArray()) {
			
			shape.add(character);
			
		}

		for (char character : column3.toCharArray()) {
			
			shape.add(character);	
			
		}
		
		for (int i = 0; i < shape.size(); i++) {
			
			ingredients.put(i, null);
			
		}
	
	}
	
	public void setIngredient(char character, ItemStack item) {
		
		for (int i = 0; i < shape.size(); i++) {
			
			if (shape.get(i).equals(character)) {
				
				ingredients.put(i, item);
				
			}
			
		}
		
	}
	
	public void register() {
		
		register = true;
		runTaskTimer(Main.plugin, 0, 1);
		
	}
	
	@EventHandler
	public void open(InventoryOpenEvent event) {
		
		player = (Player) event.getPlayer();
		run = true;
	
	}
	
	@EventHandler
	public void click(InventoryClickEvent event) {
		
		slot = event.getRawSlot();
		
	}
	
	@EventHandler
	public void close(InventoryCloseEvent event) {
		
		run = false;
		
	}
	
	public void run() {
		
		if (run) {
			
			Inventory inventory = player.getOpenInventory().getTopInventory();
			
			if (player.getInventory() == inventory) return;
			
			if (inventory.getName().equalsIgnoreCase("§5Super table de craft")) {
				
				if (slot == 24 && inventory.getItem(24) != null && crafted) {
					
					if (!(inventory.getItem(11) == null ||  inventory.getItem(11).getAmount() == 1)) {

						ItemStack replace = inventory.getItem(11);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(11, replace);
					
					}
					
					else inventory.setItem(11, null);
					
					if (!(inventory.getItem(12) == null ||  inventory.getItem(12).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(12);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(12, replace);
					
					}
					
					else inventory.setItem(12, null);

					if (!(inventory.getItem(13) == null ||  inventory.getItem(13).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(13);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(13, replace);
					
					}
					
					else inventory.setItem(13, null);
					
					if (!(inventory.getItem(20) == null ||  inventory.getItem(20).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(20);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(20, replace);
					
					}
					
					else inventory.setItem(20, null);
					
					if (!(inventory.getItem(21) == null ||  inventory.getItem(21).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(21);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(21, replace);
					
					}
					
					else inventory.setItem(21, null);
					
					if (!(inventory.getItem(22) == null ||  inventory.getItem(22).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(22);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(22, replace);
					
					}
					
					else inventory.setItem(22, null);
					
					if (!(inventory.getItem(29) == null ||  inventory.getItem(29).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(29);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(29, replace);
					
					}
					
					else inventory.setItem(29, null);
					
					if (!(inventory.getItem(30) == null ||  inventory.getItem(30).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(30);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(30, replace);
					
					}
					
					else inventory.setItem(30, null);
					
					if (!(inventory.getItem(31) == null ||  inventory.getItem(31).getAmount() == 1)) {
						
						ItemStack replace = inventory.getItem(31);
						replace.setAmount(replace.getAmount()-1);
						inventory.setItem(31, replace);
					
					}
					
					else inventory.setItem(31, null);
					crafted = false;
					
				}
				
				List<ItemStack> items = new ArrayList<ItemStack>();
				items.add(inventory.getItem(11));
				items.add(inventory.getItem(12));
				items.add(inventory.getItem(13));
				items.add(inventory.getItem(20));
				items.add(inventory.getItem(21));
				items.add(inventory.getItem(22));
				items.add(inventory.getItem(29));
				items.add(inventory.getItem(30));
				items.add(inventory.getItem(31));
				Boolean same = true;
				
				for (int i = 0;i < 9; i++) {
					
					if (ingredients.get(i) == null || items.get(i) == null) {
						
						if (!(ingredients.get(i) == null && items.get(i) == null)) {
							
							same = false;
							
						}
						
					}
					
					else {
						
						if (!(ingredients.get(i).getType() == items.get(i).getType())) {
							
							same = false;
							
						}
						
						else {
							
							if (!(ingredients.get(i).getAmount() == items.get(i).getAmount())) {
								
								
								same = false;
								
							}
							
							else {
							
								if (ingredients.get(i).hasItemMeta() || items.get(i).hasItemMeta()) {
									
									if (!(ingredients.get(i).hasItemMeta() == items.get(i).hasItemMeta())) {
										
										same = false;
										
									}
									
									else {
										
										if (ingredients.get(i).getItemMeta().hasDisplayName() || items.get(i).getItemMeta().hasDisplayName()) {
											
											if (!(ingredients.get(i).getItemMeta().hasDisplayName() == items.get(i).getItemMeta().hasDisplayName()))  {
												
												same = false;
												
											}
											
											else {
												
												if (!(ingredients.get(i).getItemMeta().getDisplayName().equalsIgnoreCase(items.get(i).getItemMeta().getDisplayName()))) {
													
													same = false;
													
												}
												
											}
											
										}
										
										else if (ingredients.get(i).getItemMeta().hasEnchants() || items.get(i).getItemMeta().hasEnchants()) {
											
											if (!(ingredients.get(i).getItemMeta().hasEnchants() == items.get(i).getItemMeta().hasEnchants())) {
												
												same = false;
												
											}
											
											else {
												
												if (!(ingredients.get(i).getItemMeta().getEnchants().equals(items.get(i).getItemMeta().getEnchants()))) {
													
													same = false;
													
												}
												
											}
											
										}
										
									}
									
								}
								
								
							}
							
						}
						
					}
					
					
				}
				
				if (same) {
					
					inventory.setItem(24, result);
					crafted = true;	
					
				}
				
				else if (inventory.getItem(24) == null) {
					
					return;
				
				}
				
				else if (inventory.getItem(24).getType() == result.getType()) {
					
					if (inventory.getItem(24).hasItemMeta() || result.hasItemMeta()) {
						
						if (inventory.getItem(24).hasItemMeta() == result.hasItemMeta()) {
							
							if (inventory.getItem(24).getItemMeta().hasDisplayName() || result.getItemMeta().hasDisplayName()) {
								
								if (inventory.getItem(24).getItemMeta().hasDisplayName() == result.getItemMeta().hasDisplayName()) {
									
									if (inventory.getItem(24).getItemMeta().getDisplayName().equalsIgnoreCase(result.getItemMeta().getDisplayName())) {
										
										if (inventory.getItem(24).getItemMeta().hasEnchants() || result.getItemMeta().hasEnchants()) {
											
											if (inventory.getItem(24).getItemMeta().hasEnchants() == result.getItemMeta().hasEnchants()) {
												
												if (inventory.getItem(24).getItemMeta().getEnchants().equals(result.getItemMeta().getEnchants())) {
													
													inventory.setItem(24, null);
													crafted = false;
													
												}
										
											}
									
										}
										
										else {
											
											inventory.setItem(24, null);
											crafted = false;
											
										}
									
									}
								
								}
								
							}
							
							else if (inventory.getItem(24).getItemMeta().hasEnchants() || result.getItemMeta().hasEnchants()) {
								
								if (inventory.getItem(24).getItemMeta().hasEnchants() == result.getItemMeta().hasEnchants()) {
									
									if (inventory.getItem(24).getItemMeta().getEnchants().equals(result.getItemMeta().getEnchants())) {
											
										inventory.setItem(24, null);
										crafted = false;
									
									}
									
								}
								
							}
							
						}
						
					}
					
					else {
					
						inventory.setItem(24, null);
						crafted = false;
						
					}
					
				}
				 
			}
			
		}
		
	}
	
}

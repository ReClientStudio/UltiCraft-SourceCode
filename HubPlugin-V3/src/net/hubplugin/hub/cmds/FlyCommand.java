package net.hubplugin.hub.cmds;

import net.hubplugin.hub.Main;
import net.hubplugin.hub.rank.Rank;
import net.hubplugin.hub.rank.RankUnit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor
{

    private Main main;

    public boolean Fly = false;
    public FlyCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        if(sender instanceof Player)
        {
            Player p = ((Player) sender).getPlayer();
            String world = p.getLocation().getWorld().getName();
            if (world.equals("world")) {

                if (main.rank.getRank(p).getPower() <= RankUnit.VIP.getPower()) {
                    if (Fly = true) {
                        p.setAllowFlight(false);
                        p.setFlying(false);
                        p.sendMessage("§aThe fly was turn off");
                    }
                    if (Fly = false) {
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.sendMessage("§aThe fly was turn on");
                    }
                }
            }
        }
        return true;
    }
}

package net.hubplugin.hub.cmds;

import net.hubplugin.hub.Main;
import net.hubplugin.hub.rank.RankUnit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CoinsCommand implements CommandExecutor
{
    private Main main;

    public CoinsCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args)
    {
        if(sender instanceof Player)
        {
            Player p = ((Player) sender).getPlayer();
            if(main.rank.getRank(p).getPower() == RankUnit.ADMIN.getPower())
            {
                if (args.length == 3)
                {
                    if (args[0].equalsIgnoreCase("add"))
                    {

                    }
                }
            }
        }
        return false;
    }
}

package fr.playerapi.rank;

import org.bukkit.ChatColor;

import java.util.HashMap;
import java.util.Map;

public enum RankUnit {

    JOUEUR(0, "Joueur","§7", ChatColor.GRAY),
    VIP(1, "Vip", "§a[Vip] ", ChatColor.GREEN),
    VIPX(2, "Vip+", "§a[Vip§c+§a] ", ChatColor.GREEN),
    MVP(3, "MVP", "§b[Mvp] ", ChatColor.AQUA),
    MVPX(4, "MVP+", "§b[Mvp§c+§b] ", ChatColor.AQUA),
    MVPXX(5, "MVP++", "§6[Mvp§d++§6] ", ChatColor.GOLD),
    YOUTUBE(6, "Youtube", "§d[Youtube]", ChatColor.LIGHT_PURPLE),
    BUILDER(7, "Builder", "§2[Builder] ", ChatColor.DARK_GREEN),
    HELPER(8, "Helper", "§2[Helper] ", ChatColor.DARK_GREEN),
    MODERATOR(9, "Moderator", "§6[Moderator] ", ChatColor.GOLD),
    SUPERMOD(10, "Super-Moderator", "§6[Super-Mod] ", ChatColor.GOLD),
    DEVELOPPEUR(11, "Développeur", "§6[Développeur] ", ChatColor.GOLD),
    RESPONSABLE(12, "Responsable", "§c[Responsable] ", ChatColor.RED),
    ADMIN(13, "Administrateur", "§c[Adminstrateur] ", ChatColor.RED);

    private int power;
    private String name;
    private String prefix;
    private ChatColor color;

    private static Map<Integer, RankUnit> ID_MAP = new HashMap<>();
    private static Map<String, RankUnit> fromName = new HashMap<>();

    private  RankUnit(int power, String name, String prefix, ChatColor color){
        this.power = power;
        this.name = name;
        this.prefix = prefix;
        this.color = color;
    }

    static {
        for(RankUnit rank : values()){
            ID_MAP.put(rank.power, rank);
            fromName.put(rank.name, rank);
        }
    }

    public static RankUnit getFromPower(int power){
        return ID_MAP.get(power);
    }

    public int getPower(){
        return power;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public ChatColor getColor() {
        return color;
    }
}


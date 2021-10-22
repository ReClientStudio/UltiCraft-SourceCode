package fr.playerapi;

import fr.playerapi.managers.EventsManager;
import fr.playerapi.mysql.MySQL;
import fr.playerapi.rank.Rank;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    private static main instance;

    public MySQL mysql = new MySQL();
    public Rank rank = new Rank(this);


    public void onEnable(){

        instance = this;

        new EventsManager().registers(this);

        mysql.connect("databaseurl", "database", 3306, "user", "password");

    }

    public void onDisable(){

        mysql.disconnect();

    }

    public static main getInstance() {
        return instance;
    }

}

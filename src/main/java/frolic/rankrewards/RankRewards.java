package frolic.rankrewards;

import frolic.rankrewards.events.GuiEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import net.milkbowl.vault.economy.Economy;

public final class RankRewards extends JavaPlugin {

    private static RankRewards plugin;
    private static Economy econ = null;


    @Override
    public void onEnable() {
        plugin = this;
        if (!setupEconomy() ) {
            System.out.println("No Economy Plugin Found");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        getCommand("rankredeem").setExecutor(new Gui());
        getServer().getPluginManager().registerEvents(new GuiEvent(), this);
        System.out.println(ChatColor.GREEN + "Reward Plugin by Frolic_gamers Enabled !!!");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
    public static RankRewards getPlugin() {
        return plugin;
    }
    public static Economy getEconomy() {
        return econ;
    }

}

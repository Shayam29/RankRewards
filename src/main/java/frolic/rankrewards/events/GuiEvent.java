package frolic.rankrewards.events;

import frolic.rankrewards.RankRewards;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;


public class GuiEvent implements Listener {
    Economy economy = RankRewards.getEconomy();

    @EventHandler
    public void onClickEvent(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        PersistentDataContainer data = player.getPersistentDataContainer();
        if(event.getView().getTitle().equalsIgnoreCase("Rank Rewards")){
            event.setCancelled(true);

            if(event.getCurrentItem()== null){
                return;
            }else if(event.getCurrentItem().getType().equals(Material.CYAN_STAINED_GLASS)){
                if(player.hasPermission("rankrewards.knight")) {
                    if(data.has(new NamespacedKey(RankRewards.getPlugin(), "knight"), PersistentDataType.STRING)) {
                        player.sendMessage(ChatColor.RED +"You can't use it anymore!");

                    }else{


                        player.sendMessage(ChatColor.RED + "You have already used this once");
                        EconomyResponse response = economy.depositPlayer(player, 100000);
                        player.giveExp(160);
                        String cmd = "crates givekey %player% knight 2";
                        cmd = cmd.replace("%player%", player.getName());
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd);
                        player.sendMessage(ChatColor.BLUE + "One time reward received!");
                        data.set(new NamespacedKey(RankRewards.getPlugin(), "knight"), PersistentDataType.STRING, "knight");
                        player.closeInventory();
                    }



                }else{
                    player.sendMessage(ChatColor.RED + "You do not have the required permission");
                }

            }else if(event.getCurrentItem().getType().equals(Material.LIME_STAINED_GLASS)){
                if(player.hasPermission("rankrewards.noblemen")){
                    if(data.has(new NamespacedKey(RankRewards.getPlugin(), "noblemen"), PersistentDataType.STRING)) {
                        player.sendMessage(ChatColor.RED +"You can't use it anymore!");

                    }else {
                        EconomyResponse response = economy.depositPlayer(player, 250000);
                        player.giveExp(315);
                        String cmd = "crates givekey %player% knight 3";
                        cmd = cmd.replace("%player%", player.getName());
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd);
                        player.sendMessage(ChatColor.BLUE + "One time reward received!");
                        data.set(new NamespacedKey(RankRewards.getPlugin(), "noblemen"), PersistentDataType.STRING, "noblemen");
                        player.closeInventory();
                    }


                }else{
                    player.sendMessage(ChatColor.RED + "You do not have the required permission");
                }
            }else if(event.getCurrentItem().getType().equals(Material.PINK_STAINED_GLASS)){
                if(player.hasPermission("rankrewards.princess")){
                    if(data.has(new NamespacedKey(RankRewards.getPlugin(), "princess"), PersistentDataType.STRING)) {
                        player.sendMessage(ChatColor.RED +"You can't use it anymore!");
                    }else {
                        EconomyResponse response = economy.depositPlayer(player, 750000);
                        player.giveExp(910);
                        String cmd = "crates givekey %player% knight 3";
                        String cmdd = "crates givekey %player% kingdom 1";
                        cmd = cmd.replace("%player%", player.getName());
                        cmdd = cmdd.replace("%player%", player.getName());
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd);
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmdd);
                        player.sendMessage(ChatColor.BLUE + "One time reward received!");
                        data.set(new NamespacedKey(RankRewards.getPlugin(), "princess"), PersistentDataType.STRING, "princess");
                        player.closeInventory();
                    }


                }else{
                    player.sendMessage(ChatColor.RED + "You do not have the required permission");
                }
            }else if(event.getCurrentItem().getType().equals(Material.YELLOW_STAINED_GLASS)){
                if(player.hasPermission("rankrewards.prince")){
                    if(data.has(new NamespacedKey(RankRewards.getPlugin(), "prince"), PersistentDataType.STRING)) {
                        player.sendMessage(ChatColor.RED +"You can't use it anymore!");
                    }else {
                        EconomyResponse response = economy.depositPlayer(player, 2000000);
                        player.giveExp(1395);
                        String cmd = "crates givekey %player% knight 3";
                        String cmdd = "crates givekey %player% kingdom 2";
                        cmd = cmd.replace("%player%", player.getName());
                        cmdd = cmdd.replace("%player%", player.getName());
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd);
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmdd);
                        player.sendMessage(ChatColor.BLUE + "One time reward received!");
                        data.set(new NamespacedKey(RankRewards.getPlugin(), "prince"), PersistentDataType.STRING, "prince");
                        player.closeInventory();
                    }


                }else{
                    player.sendMessage(ChatColor.RED + "You do not have the required permission");
                }
            }else if(event.getCurrentItem().getType().equals(Material.ORANGE_STAINED_GLASS)){
                if(player.hasPermission("rankrewards.king")){
                    if(data.has(new NamespacedKey(RankRewards.getPlugin(), "king"), PersistentDataType.STRING)) {
                        player.sendMessage(ChatColor.RED +"You can't use it anymore!");
                    }else {
                        EconomyResponse response = economy.depositPlayer(player, 5000000);
                        player.giveExp(5350);
                        String cmd = "crates givekey %player% knight 3";
                        String cmdd = "crates givekey %player% kingdom 1";
                        String cmddd = "crates givekey %player% prince 2";
                        cmd = cmd.replace("%player%", player.getName());
                        cmdd = cmdd.replace("%player%", player.getName());
                        cmddd = cmddd.replace("%player%", player.getName());
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd);
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmdd);
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmddd);
                        player.sendMessage(ChatColor.BLUE + "One time reward received!");
                        data.set(new NamespacedKey(RankRewards.getPlugin(), "king"), PersistentDataType.STRING, "king");
                        player.closeInventory();
                    }


                }else{
                    player.sendMessage(ChatColor.RED + "You do not have the required permission");
                }
            }else if(event.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS)){
                if(player.hasPermission("rankrewards.overlord")){
                    if(data.has(new NamespacedKey(RankRewards.getPlugin(), "overlord"), PersistentDataType.STRING)) {
                        player.sendMessage(ChatColor.RED +"You can't use it anymore!");
                    }else {
                        EconomyResponse response = economy.depositPlayer(player, 10000000);
                        player.giveExp(15350);
                        String cmd = "crates givekey %player% knight 3";
                        String cmdd = "crates givekey %player% kingdom 2";
                        String cmddd = "crates givekey %player% prince 3";
                        cmd = cmd.replace("%player%", player.getName());
                        cmdd = cmdd.replace("%player%", player.getName());
                        cmddd = cmddd.replace("%player%", player.getName());
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd);
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmdd);
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), cmddd);
                        player.sendMessage(ChatColor.BLUE + "One time reward received!");
                        data.set(new NamespacedKey(RankRewards.getPlugin(), "overlord"), PersistentDataType.STRING, "overlord");
                        player.closeInventory();
                    }


                }else{
                    player.sendMessage(ChatColor.RED + "You do not have the required permission");
                }
            }



        }


    }



}

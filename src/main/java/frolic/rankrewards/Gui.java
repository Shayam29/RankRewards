package frolic.rankrewards;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Gui implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (command.getName().equalsIgnoreCase("rankredeem")) {

                Inventory gui = Bukkit.createInventory(player, 27, "Rank Rewards");
                ItemStack Knight  = new ItemStack(Material.CYAN_STAINED_GLASS);

                ItemMeta Knight_meta = Knight.getItemMeta();
                Knight_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&LKNIGHT &7Rank one-time rewards {&9Right-click&7}"));
                ArrayList<String> Knight_lore = new ArrayList<>();
                Knight_lore.add(ChatColor.translateAlternateColorCodes('&', "&9&L| &7$100,000"));
                Knight_lore.add(ChatColor.translateAlternateColorCodes('&', "&9&L| &710 EXP levels"));
                Knight_lore.add(ChatColor.translateAlternateColorCodes('&', "&9&L| &72 Knight keys"));
                Knight_meta.setLore(Knight_lore);
                Knight.setItemMeta(Knight_meta);

                ItemStack NOBLEMEN   = new ItemStack(Material.LIME_STAINED_GLASS);

                ItemMeta NOBLEMEN_meta = NOBLEMEN .getItemMeta();
                NOBLEMEN_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lNOBLEMEN &7Rank  one-time rewards {&aRight-click&7}"));
                ArrayList<String> NOBLEMEN_lore = new ArrayList<>();
                NOBLEMEN_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&L| &7$250,000"));
                NOBLEMEN_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&L| &715 EXP levels "));
                NOBLEMEN_lore.add(ChatColor.translateAlternateColorCodes('&', "&a&L| &73 Knight keys"));
                NOBLEMEN_meta.setLore(NOBLEMEN_lore);
                NOBLEMEN.setItemMeta(NOBLEMEN_meta);

                ItemStack PRINCESS  = new ItemStack(Material.PINK_STAINED_GLASS);

                ItemMeta PRINCESS_meta = PRINCESS.getItemMeta();
                PRINCESS_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lPRINCESS &7Rank one-time rewards {&dRight-click&7}"));
                ArrayList<String> PRINCESS_lore = new ArrayList<>();
                PRINCESS_lore.add(ChatColor.translateAlternateColorCodes('&', "&d&L| &7$750,000"));
                PRINCESS_lore.add(ChatColor.translateAlternateColorCodes('&', "&d&L| &725 EXP levels "));
                PRINCESS_lore.add(ChatColor.translateAlternateColorCodes('&', "&d&L| &73 knight keys"));
                PRINCESS_lore.add(ChatColor.translateAlternateColorCodes('&', "&d&L| &71 kingdom key"));
                PRINCESS_meta.setLore(PRINCESS_lore);
                PRINCESS.setItemMeta(PRINCESS_meta);

                ItemStack PRINCE  = new ItemStack(Material.YELLOW_STAINED_GLASS);

                ItemMeta PRINCE_meta = PRINCE.getItemMeta();
                PRINCE_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&LPRINCE &7Rank one-time rewards {&eRight-click&7}"));
                ArrayList<String> PRINCE_lore = new ArrayList<>();
                PRINCE_lore.add(ChatColor.translateAlternateColorCodes('&', "&e&L| &7$2,000,000"));
                PRINCE_lore.add(ChatColor.translateAlternateColorCodes('&', "&e&L| &730 EXP levels"));
                PRINCE_lore.add(ChatColor.translateAlternateColorCodes('&', "&e&L| &73 knight keys"));
                PRINCE_lore.add(ChatColor.translateAlternateColorCodes('&', "&e&L| &72 kingdom keys"));
                PRINCE_meta.setLore(PRINCE_lore);
                PRINCE.setItemMeta(PRINCE_meta);

                ItemStack KING  = new ItemStack(Material.ORANGE_STAINED_GLASS);

                ItemMeta KING_meta = KING.getItemMeta();
                KING_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&LKING &7Rank one-time rewards {&6Right-click&7}"));
                ArrayList<String> KING_lore = new ArrayList<>();
                KING_lore.add(ChatColor.translateAlternateColorCodes('&', "&6&L| &7$5,000,000"));
                KING_lore.add(ChatColor.translateAlternateColorCodes('&', "&6&L| &750 EXP levels "));
                KING_lore.add(ChatColor.translateAlternateColorCodes('&', "&6&L| &73 knight keys"));
                KING_lore.add(ChatColor.translateAlternateColorCodes('&', "&6&L| &72 prince keys"));
                KING_lore.add(ChatColor.translateAlternateColorCodes('&', "&6&L| &71 kingdom key"));
                KING_meta.setLore(KING_lore);
                KING.setItemMeta(KING_meta);

                ItemStack OVERLORD  = new ItemStack(Material.RED_STAINED_GLASS);

                ItemMeta OVERLORD_meta = OVERLORD.getItemMeta();
                OVERLORD_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&LOVERLORD &7Rank one-time rewards {&cRight-click&7}"));
                ArrayList<String> OVERLORD_lore = new ArrayList<>();
                OVERLORD_lore.add(ChatColor.translateAlternateColorCodes('&', "&c&L| &7$10,000,000"));
                OVERLORD_lore.add(ChatColor.translateAlternateColorCodes('&', "&c&L| &775 EXP levels  "));
                OVERLORD_lore.add(ChatColor.translateAlternateColorCodes('&', "&c&L| &73 knight keys"));
                OVERLORD_lore.add(ChatColor.translateAlternateColorCodes('&', "&c&L| &73 prince keys "));
                OVERLORD_lore.add(ChatColor.translateAlternateColorCodes('&', "&c&L| &72 kingdom keys"));
                OVERLORD_meta.setLore(OVERLORD_lore);
                OVERLORD.setItemMeta(OVERLORD_meta);

                ItemStack[] menu_items = {Knight, NOBLEMEN, PRINCESS, PRINCE, KING, OVERLORD};
                gui.setItem(1, Knight);
                gui.setItem(4, NOBLEMEN);
                gui.setItem(7, PRINCESS);
                gui.setItem(19, PRINCE);
                gui.setItem(22, KING);
                gui.setItem(25, OVERLORD);





                player.openInventory(gui);


            }

        }

        return true;
    }

}
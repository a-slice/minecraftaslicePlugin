package io.github.aslicePlugin.commands;

import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class kitslice implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender != null) {
            Player player = (Player) sender;
            // Here we need to give items to our player
            // Create a new ItemStack (type: diamond)
            ItemStack diamond = new ItemStack(Material.DIAMOND, 1);

            // Create a new ItemStack (type: brick)
            ItemStack spawneggs = new ItemStack(Material.PIG_SPAWN_EGG, 2);

            // Give the player our items (comma-seperated list of all ItemStack)
            player.getInventory().addItem(spawneggs, diamond);
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}

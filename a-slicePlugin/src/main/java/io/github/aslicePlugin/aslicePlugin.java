package io.github.aslicePlugin;

import io.github.aslicePlugin.commands.kitslice;
import org.bukkit.plugin.java.JavaPlugin;

public class aslicePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("aslicePlugin enabled successfully");
        //Register our command "kit" (set an instance of your command class as executor)
        this.getCommand("kitslice").setExecutor(new kitslice());
    }
    @Override
    public void onDisable() {
        getLogger().info("aslicePlugin disabled :(");
    }
}

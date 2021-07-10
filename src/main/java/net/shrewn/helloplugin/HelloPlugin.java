package net.shrewn.helloplugin;

import net.shrewn.helloplugin.listeners.BlockPlaceListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new BlockPlaceListener(), this);
    }
}

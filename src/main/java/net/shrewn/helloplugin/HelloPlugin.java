package net.shrewn.helloplugin;

import net.shrewn.helloplugin.listeners.BlockPlaceListener;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloPlugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        System.out.print("[HelloPlugin] Plugin enabled (Version: ");
        System.out.println(this.getDescription().getVersion() + ")");
        registerListeners();
    }

    private void registerListeners()
    {
        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new BlockPlaceListener(), this);
        pluginManager.registerEvents(new BlockPlaceListener(), this);
    }

    @Override
    public void onDisable()
    {
        final CommandSender console = this.getServer().getConsoleSender();

        console.sendMessage("[HelloPlugin] Plugin disabled");
    }
}

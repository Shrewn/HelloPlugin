package net.shrewn.helloplugin.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener
{
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event)
    {
        Block block = event.getBlock();
        Material blockMaterial = block.getType();
        World world = block.getWorld();
        Location location = block.getLocation();
        if (blockMaterial == Material.COBBLESTONE)
            {
                world.playSound(location, Sound.SKELETON_DEATH, 1F, 1F);
            }
    }
}

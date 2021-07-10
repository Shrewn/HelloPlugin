package net.shrewn.helloplugin.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceListener implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        Material blockMaterial = block.getType();
        World world = block.getWorld();
        Location location = block.getLocation();
        if (blockMaterial == Material.COBBLESTONE) {
            world.playSound(location, Sound.SKELETON_IDLE, 1F, 1F);
        }
    }
}

package com.minecraft.plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class MyPluginListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        // Your code here...
        event.setJoinMessage("§a欢迎来到sed服务器！");
    }
}
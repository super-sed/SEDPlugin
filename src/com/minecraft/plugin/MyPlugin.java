package com.minecraft.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin{

    //启动插件
    @Override
    public void onEnable() {
        getLogger().info("!!! supersed插件被调用");
    }

    //停用插件
    @Override
    public void onDisable() {
        getLogger().info("!!! supersed插件被停用");
    }
}

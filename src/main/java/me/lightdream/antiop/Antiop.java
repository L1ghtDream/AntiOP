package me.lightdream.antiop;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class Antiop extends JavaPlugin {

    public static Antiop plugin;

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        plugin = this;
    }

    @Override
    public void onDisable() {
    }


}

package me.lightdream.antiop;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class JoinEvent implements Listener {



    @EventHandler
    public void OnPlayerJoin(PlayerJoinEvent event)
    {
        new BukkitRunnable() {
            int counter = 15;
            @Override
            public void run() {
                if(event.getPlayer().isOp())
                {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "banip " + event.getPlayer().getName() + " -s");
                    cancel();
                }
                counter--;
                System.out.println("[" + event.getPlayer().getName() + "] -> " + counter);
                if(counter == 0)
                    cancel();
            }

        }.runTaskTimer(Antiop.plugin, 0L, 40L);
    }
}

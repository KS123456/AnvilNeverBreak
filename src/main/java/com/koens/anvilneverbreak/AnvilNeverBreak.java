package com.koens.anvilneverbreak;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AnvilNeverBreak extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this,  this);
		getLogger().info("AnvilNeverBreak v" + getDescription().getVersion() + " has been enabled!");
	}
	@Override
	public void onDisable() {
		getLogger().info("AnvilNeverBreak v" + getDescription().getVersion() + " has been disabled!");
	}
	
	@EventHandler
	public void anvilDamage(EntityDamageEvent e) {
		if (e.getEntity().equals(Material.ANVIL)) {
			e.setCancelled(true);
		}
	}
}

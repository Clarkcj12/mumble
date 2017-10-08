package us.mcthemeparks.voiceplus;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

@SuppressWarnings({"unused", "deprecated", "expression"})
public class VoicePlus extends JavaPlugin {
    public static VoicePlus instance;

    @Override
    public void onEnable() {
        instance = this;
        enableMessage();
        if (VoicePlusConfig.enableMetrics) startMetrics();
        new VoicePlusConfig();
        BukkitCommandManager manager = new BukkitCommandManager(this);
        manager.registerCommand(new VoicePlusCommands());
    }

    private void enableMessage() {
        getLogger().info("|======================================|");
        getLogger().info("| Plugin: VoicePlus                    |");
        getLogger().info("| Created By: Clarkcj                  |");
        getLogger().info("| Contributions By: willies952002      |");
        getLogger().info("| Version: 2.7.3                       |");
        getLogger().info("|======================================|");
    }

    private void startMetrics() {
        try {
            getLogger().info("Starting Metrics");
            new org.mcstats.Metrics(this).start();
            new org.bstats.Metrics(this);
        } catch (IOException e) {
            getLogger().severe("Failed to Submit Metrics Data to MCStats");
        }
    }

    @Override
    public void onDisable() {
    }
}
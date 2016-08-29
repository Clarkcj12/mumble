package us.mcthemeparks;

import com.domnian.util.TaskChain;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.Metrics;
import us.mcthemeparks.commands.*;

import java.io.IOException;

/**
 * ==================================================================
 * Copyright McThemeParks Dev. (c) 2015. All Rights Reserved
 * Any Code contained within this document, and any associated APIs
 * with similar branding are the sole property of McThemeParks.
 * Distribution, reproduction, taking snippets, or claiming any
 * contents as your own will break the terms of the license, and
 * void any agreements with you, the third party. Thanks
 * ==================================================================
 */
@SuppressWarnings({"unused", "deprecated"})
public class VoicePlus extends JavaPlugin {
    public static VoicePlus instance;

    @Override
    public void onEnable() {
        instance = this;
        enableMessage();
        saveDefaultConfig();
        registerEvents();
        startMetrics();
        TaskChain.initialize(this);
        registerCommands();
    }

    private void enableMessage() {
        getLogger().info("|======================================|");
        getLogger().info("| Plugin: VoicePlus                    |");
        getLogger().info("| Created By: Clarkcj                  |");
        getLogger().info("| Contributions By: willies952002      |");
        getLogger().info("| Version: 1.7.2-dev                     |");
        getLogger().info("|======================================|");
    }

    public void registerCommands() {
        getLogger().info("Registering Commands");
        getCommand("VoicePlus").setExecutor(new VoicePlusExe());
        getCommand("MumbleInfo").setExecutor(new MumbleInfo());
        getCommand("TeamSpeak").setExecutor(new TeamSpeakExe());
        getCommand("TeamSpeakInfo").setExecutor(new TeamSpeakInfo());
        getCommand("Discord").setExecutor(new DiscordExe());
    }

    private void registerEvents() {

    }

    private void startMetrics() {
        try {
            getLogger().info("Starting Metrics");
            Metrics metrics = new Metrics(this);
            metrics.start();
        } catch (IOException e) {
            getLogger().severe("Failed to Submit Metrics Data to MCStats");
        }
    }

    @Override
    public void onDisable() {

    }
}

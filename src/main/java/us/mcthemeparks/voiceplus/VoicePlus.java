package us.mcthemeparks.voiceplus;

import co.aikar.commands.ACF;
import org.bukkit.plugin.java.JavaPlugin;

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
        if (VoicePlusConfig.enableMetrics) startMetrics();
        new VoicePlusConfig();
        ACF.createManager(this).registerCommand(new VoicePlusCommands());
    }

    private void enableMessage() {
        getLogger().info("|======================================|");
        getLogger().info("| Plugin: VoicePlus                    |");
        getLogger().info("| Created By: Clarkcj                  |");
        getLogger().info("| Contributions By: willies952002      |");
        getLogger().info("| Version: 2.7.1                       |");
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
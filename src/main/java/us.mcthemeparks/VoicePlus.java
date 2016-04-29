package us.mcthemeparks;

import org.bukkit.plugin.java.JavaPlugin;
import us.mcthemeparks.commands.MumbleInfo;
import us.mcthemeparks.commands.TeamSpeakExe;
import us.mcthemeparks.commands.TeamSpeakInfo;
import us.mcthemeparks.commands.VoicePlusExe;

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
        registerCommands();
        this.saveDefaultConfig();
    }

    public void registerCommands() {
        getCommand("VoicePlus").setExecutor(new VoicePlusExe());
        getCommand("MumbleInfo").setExecutor(new MumbleInfo());
        getCommand("TeamSpeak").setExecutor(new TeamSpeakExe());
        getCommand("TeamSpeakInfo").setExecutor(new TeamSpeakInfo());
    }

    @Override
    public void onDisable() {

    }
}

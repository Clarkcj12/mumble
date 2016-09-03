package us.mcthemeparks.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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
public class IRCExe implements CommandExecutor {
    /*
    Not in use currently
    @int IRCPort;
     */
    int IRCServer;
    int IRCChan;

    public boolean onCommand(CommandSender s, Command c, String commandLabel, String[] a){
        if (s instanceof Player){
            Player p = ((Player) s);
            if (a.length > 0){
                s.sendMessage(ChatColor.GOLD + "IRC Server Address:" + IRCServer);
                /*
                 Can Be re-added if needed.
                    s.sendMessage(ChatColor.GOLD + "IRC Port: " + IRCPort);
                */
                s.sendMessage(ChatColor.GOLD + "IRC Channel: " + IRCChan);
            }
        }
        return true;
    }
}
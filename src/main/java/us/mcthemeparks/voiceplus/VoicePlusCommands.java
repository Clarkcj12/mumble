package us.mcthemeparks.voiceplus;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import com.domnian.mcutils.Util;
import org.bukkit.entity.Player;

public class VoicePlusCommands extends BaseCommand {

    @CommandAlias("discord")
    public void onDiscord(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendMsg(player, "&6Learn More About Discord at &b&nhttps://discordapp.com");
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("discord invite")
    public void onDiscordInvite(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6Discord Invite Link: &b&n%s", VoicePlusConfig.discordInvite);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("donate")
    public void onDonate(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6Donation Page: &b&n%s", VoicePlusConfig.donate);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("facebook")
    public void onFacebook(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6FaceBook Page: &b&n%s", VoicePlusConfig.facebook);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("irc")
    public void onIRC(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6IRC Server Address:&b %s", VoicePlusConfig.ircServer);
        Util.sendFMsg(player, "&6IRC Channel:&b %s", VoicePlusConfig.ircChannel);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("mumble")
    public void onMumble(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6Mumble Server Address:&b %s (Port %d)", VoicePlusConfig.mumbleServer, VoicePlusConfig.mumblePort);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("mumble get")
    public void onMumbleGet(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendMsg(player, "&6Download Mumble at: &b&nhttps://mumble.sourceforge.net");
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("skype")
    public void onSkype(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6Server's Skype Group: &b&n%s", VoicePlusConfig.skype);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("teamspeak get|ts3 get")
    public void onTS3(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendMsg(player, "&6Download TeamSpeak 3 at &b&nhttps://www.teamspeak.com/downloads");
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("teamspeak|ts3")
    public void onTS3Join(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6TeamSpeak 3 Server Address:&b %s (Port %d)", VoicePlusConfig.ts3Server, VoicePlusConfig.ts3Port);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("website")
    public void onWebsite(Player player) {
        Util.sendMsg(player, "&r");
        Util.sendFMsg(player, "&6Visit our website at: &b&n%s", VoicePlusConfig.website);
        Util.sendMsg(player, "&r");
    }

    @CommandAlias("vphelp|vp|voiceplus")
    public void onHelp(Player player) {
        Util.sendMsg(player, "&6Voice Plus v&e" + VoicePlus.instance.getDescription().getVersion() + " &6Commands:");
        Util.sendMsg(player, "&b-» &a/discord [invite] &6- &8 Display Discord Invite Link");
        Util.sendMsg(player, "&b-» &a/donate &6- &8Display Link to Donation Store");
        Util.sendMsg(player, "&b-» &a/facebook &6- &8Display Link to Facebook Page");
        Util.sendMsg(player, "&b-» &a/irc &6- &8Display IRC Server & Channel Information");
        Util.sendMsg(player, "&b-» &a/mumble [get] &6- &8Display Mumble Server Information");
        Util.sendMsg(player, "&b-» &a/skype &6- &8Display Skype Group Invite Link");
        Util.sendMsg(player, "&b-» &a/teamspeak [get] &6- &8Display TeamSpeak Server Information");
        Util.sendMsg(player, "&b-» &a/ts3 [get] &6- &8Alias of /teamspeak");
        Util.sendMsg(player, "&b-» &a/website &6- &8Display Server Website");
    }
}
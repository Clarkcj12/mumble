package us.mcthemeparks.voiceplus;

import com.domnian.mcutils.config.ConfigNode;
import com.domnian.mcutils.config.MagicConfig;

public class VoicePlusConfig extends MagicConfig {

    public VoicePlusConfig() {
        super(VoicePlus.instance, "config", VoicePlusConfig.class, 1);
    }

    @ConfigNode("Discord")
    public static String discordInvite = "<Discord Invite Link>";

    @ConfigNode("Donate")
    public static String donate = "<Donation Store>";

    @ConfigNode("Fb")
    public static String facebook = "<Facebook Page>";

    @ConfigNode("IRCServer")
    public static String ircServer = "<IRC Server Address & Port>";

    @ConfigNode("IRCChan")
    public static String ircChannel = "<IRC Channel>";

    @ConfigNode("MServer")
    public static String mumbleServer = "<Mumble Server Address>";

    @ConfigNode("MPort")
    public static int mumblePort = 64738;

    @ConfigNode("Skype")
    public static String skype = "<Skype Group Invite Link>";

    @ConfigNode("TServer")
    public static String ts3Server = "<Team Speak Server Address>";

    @ConfigNode("TPort")
    public static int ts3Port = 9987;

    @ConfigNode("Website")
    public static String website = "<Website Link>";

}

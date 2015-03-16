package me.Clarkcj.mumble;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Mumble extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
    public static Mumble plugin;
    
    @Override
    public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
    
    }
    @Override
    public void onEnable(){
    	PluginDescriptionFile pdfFile = this.getDescription();
    	this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + "Has Been Enabled!");
    	getConfig().options().copyDefaults(true);
    	saveConfig();
    }
    
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("mumble")){
			player.sendMessage(ChatColor.GOLD + "Download Mumble: http://mumble.sourceforge.net/"); //send command
		}else if (cmd.getName().equalsIgnoreCase("mumbleinfo")){
			player.sendMessage(ChatColor.GOLD + "Mumble Server Address: " + getConfig().getString("Server"));
			player.sendMessage(ChatColor.GOLD + "The Port: " + getConfig().getString("Port"));
			player.sendMessage(ChatColor.GOLD + "Server Password: " + getConfig().getString("Password"));
	        }
		return false;
	}
}

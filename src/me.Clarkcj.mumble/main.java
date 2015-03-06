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
		if (commandLabel.equalsIgnoreCase("mumble")){
			player.sendMessage(ChatColor.GOLD + "You can get mumble at http://mumble.sourceforge.net/!"); //send command
		}else if (commandLabel.equalsIgnoreCase("mumbleinfo")){
			player.sendMessage(ChatColor.GOLD + "The mumble's info is " + getConfig().getString("Server"));
			player.sendMessage(ChatColor.GOLD + "The Port: " + getConfig().getString("Port"));
	        }
		return false;
	}
}

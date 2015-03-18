package me.Clarkcj.mumble;

import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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
    	this.saveDefaultConfig();
    	PluginDescriptionFile pdfFile = this.getDescription();
    	this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + "Has Been Enabled!");
    {try {
            Metrics metrics = new Metrics(this);
            metrics.start();
        } catch (IOException e) {
            // Failed to submit the stats :-(
        }
    }
    }
    
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if (cmd.getName().equalsIgnoreCase("mumble")){
			sender.sendMessage(ChatColor.GOLD + "Download Mumble: http://mumble.sourceforge.net/"); //Send Player Download Link
		}else if (cmd.getName().equalsIgnoreCase("mumbleinfo")){ //If Run Give Server Info
			sender.sendMessage(ChatColor.GOLD + "Mumble Server Address: " + getConfig().getString("Server"));
			sender.sendMessage(ChatColor.GOLD + "The Port: " + getConfig().getString("Port"));
			sender.sendMessage(ChatColor.GOLD + "Server Password: " + getConfig().getString("Password"));
	        }
		return false;
	}
}

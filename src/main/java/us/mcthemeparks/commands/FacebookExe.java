package us.mcthemeparks.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by clark on 8/29/2016.
 */
public class FacebookExe implements CommandExecutor{
    int fb;

    public boolean onCommand(CommandSender s, Command c, String commandLabel, String[] a){
        if (s instanceof Player){
            Player p = ((Player) s);
            if (a.length > 0){
                s.sendMessage(ChatColor.GOLD + "FacebookExe Page:" + fb);
            }
        }
        return true;
    }
}

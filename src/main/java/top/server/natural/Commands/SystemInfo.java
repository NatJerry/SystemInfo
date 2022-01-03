package top.server.natural.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class SystemInfo implements CommandExecutor {
//todo Make it can show server TPS and the RAM
    private final MemoryMXBean MemMX = ManagementFactory.getMemoryMXBean();
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender.isOp()){
            sender.sendMessage("##################################################");
            sender.sendMessage("Memory used : "+MemMX.getHeapMemoryUsage().getUsed());
            sender.sendMessage("Memory committed : "+MemMX.getHeapMemoryUsage().getCommitted());
            sender.sendMessage("Memory heap : "+MemMX.getHeapMemoryUsage().getMax());
            sender.sendMessage("Memory init : "+MemMX.getHeapMemoryUsage().getInit());
            sender.sendMessage("System load average : "+ManagementFactory.getOperatingSystemMXBean().getSystemLoadAverage());
            sender.sendMessage("Server version : "+ Bukkit.getServer().getVersion());
            sender.sendMessage("View distance : "+Bukkit.getServer().getViewDistance());
//            sender.sendMessage("Server RAM : " );
//            sender.sendMessage("Server TPS : " );
            sender.sendMessage("##################################################");

        }else{
            sender.sendMessage(ChatColor.RED+"您没有权限执行该命令");
        }
        return true;
}
}

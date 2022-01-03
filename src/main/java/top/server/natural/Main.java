package top.server.natural;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import top.server.natural.Commands.SystemInfo;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.GREEN + "Welcome!");
        Objects.requireNonNull(Bukkit.getPluginCommand("systeminfo")).setExecutor(new SystemInfo());

    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED + "Good Bye");
    }
}

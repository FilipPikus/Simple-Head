package filip.hardcorecode.simpleHead;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static filip.hardcorecode.simpleHead.utils.headutil.createHead;

public class HeadCommand implements CommandExecutor {
    public static String noplayer = "This Command work only on player";
    public static String HeadMessage = "You have now received the head.";
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(noplayer);
            return false;
        }
        Player player = (Player) sender;
        if (args.length == 0){
            player.sendMessage(HeadMessage);
            player.getInventory().addItem(createHead(player.getPlayerProfile().getUniqueId(), ""));
            return false;
        }else if (args.length == 1){
            OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(args[0]);
            player.sendMessage(HeadMessage);
            player.getInventory().addItem(createHead(offlinePlayer.getPlayerProfile().getUniqueId(), ""));
            return false;
        }

        return false;
    }
}

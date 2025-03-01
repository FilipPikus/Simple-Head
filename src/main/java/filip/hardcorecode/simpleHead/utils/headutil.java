package filip.hardcorecode.simpleHead.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;
import java.util.UUID;

public class headutil {
    public static ItemStack createHead(UUID owner, String name, String... lore) {
        ItemStack itemStack = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta itemMeta = (SkullMeta) itemStack.getItemMeta();

        itemMeta.setDisplayName(name);
        itemMeta.setOwningPlayer(Bukkit.getOfflinePlayer(owner));
        itemMeta.setLore(Arrays.asList(lore));

        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}

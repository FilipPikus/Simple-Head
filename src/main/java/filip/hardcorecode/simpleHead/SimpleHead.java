package filip.hardcorecode.simpleHead;

import filip.hardcorecode.simpleHead.utils.Config;
import filip.hardcorecode.simpleHead.utils.ConfigUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleHead extends JavaPlugin {

    public static SimpleHead head;
    @Override
    public void onEnable() {
        head = this;
        getCommand("head").setExecutor(new HeadCommand());
        Config config = ConfigUtil.getConfig("config");
        config.setDefault("message1",HeadCommand.HeadMessage);
        HeadCommand.HeadMessage = config.getString("message1");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

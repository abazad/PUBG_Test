package test.test;

import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
    
    public World world;
    
    @Override
    public void onEnable() {

        getLogger().info("測試插件開始");

        getCommand ( "pubg" ).setExecutor ( new PUBG(this ) );
        
        
    }

    @Override
    public void onDisable() {

        getLogger().info("測試插件結束");

    }
}
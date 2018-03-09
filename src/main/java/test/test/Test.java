package test.test;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
    
    public World world;
    
    @Override
    public void onEnable() {

        getLogger().info("測試插件開始");

        getCommand ( "pubg" ).setExecutor ( new PUBG(this ) );
    
        Bukkit.getPluginManager ( ).registerEvents ( new ToxinArea(),this );
        
        
    }

    @Override
    public void onDisable() {

        getLogger().info("測試插件結束");

    }
}
package test.test;

import org.bukkit.Bukkit;
import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Random;

public class ToxinArea implements Listener {
    
    private WorldBorder ToxinBorder;

    public void setToxinBorder ( WorldBorder toxinBorder){
        
        double x ;
        
        double y ;
    
        Random random = new Random (  );
        
        x = random.nextDouble ();
        
        y = random.nextDouble ();
        
        toxinBorder.setCenter ( x,y );
        
        toxinBorder.setSize ( random.nextDouble () %1000 ,100 );
        
        toxinBorder.setDamageAmount ( 0.5 );
        
        toxinBorder.setDamageBuffer ( 3 );
        
        ToxinBorder = toxinBorder;
        
        
        
    }

    @EventHandler
    public void inToxinArea( WorldBorderEvent worldBorderEvent ){
    
        Player player = worldBorderEvent.getPlayer ();
        
        ToxinBorder = worldBorderEvent.getWorldBorder ();
        
        if ( player.getLocation () == ToxinBorder.getCenter () ){
            
            player.setHealth ( -( ToxinBorder.getDamageAmount () ) );
        
        }
        
    }
    
    
}
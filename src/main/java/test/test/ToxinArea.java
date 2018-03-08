package test.test;

import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Random;

public class ToxinArea implements Listener {
    
    private WorldBorder ToxinBorder;

    public void setToxinBorder ( WorldBorder toxinBorder ) {
        
        double x ;
        
        double y ;
    
        Random random = new Random (  );
        
        x = random.nextDouble ();
        
        y = random.nextDouble ();
        
        toxinBorder.setCenter ( x,y );
        
        ToxinBorder = toxinBorder;
        
    }

@EventHandler
    public void inToxinArea( WorldBorderEvent worldBorderEvent ){
    
        Player player = worldBorderEvent.getPlayer ();
        
        ToxinBorder = worldBorderEvent.getWorldBorder ();
        
        
    
    }
    
    
}
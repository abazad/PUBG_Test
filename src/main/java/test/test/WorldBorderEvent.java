package test.test;


import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class WorldBorderEvent extends Event {
    
    private WorldBorder worldBorder;

    private Player player;

    private static HandlerList handlerList = new HandlerList ();
    
    public WorldBorderEvent(WorldBorder worldborder,Player player){
        
        this.worldBorder = worldborder;
        
        this.player = player;
        
    }


    public WorldBorder getWorldBorder ( ) {
    
        return worldBorder;

    }


    @Override
    public HandlerList getHandlers ( ) {
    
        return handlerList;
    
    }
    
    public static HandlerList getHandleList(){
        
        return handlerList;
        
    }
    
    public Player getPlayer(){
        
        return player;
    }
    
    public String getName(){
        
        return player.getName ();
        
    }
    
    
}


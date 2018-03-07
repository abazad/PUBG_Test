package test.test;


import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WorldBorderEvent extends Event {
    
    private WorldBorder worldBorder;
    
    public Player player;
    
    private static HandlerList handlerList = new HandlerList ();
    
    public WorldBorderEvent(WorldBorder worldborder){
        
        this.worldBorder = worldborder;
        
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
    
}


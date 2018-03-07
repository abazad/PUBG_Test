package test.test;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WorldBorderEvent extends Event {
    
    private HandlerList handlerList = new HandlerList ();
    
    @Override
    public HandlerList getHandlers ( ) {
    
        return handlerList;
    
    }
    
    public static void getHandleList(){}
    
}


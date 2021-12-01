/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MIHAN
 */
public class Youtube implements Channel{

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public Youtube() {
        this.observers = new ArrayList<Observer>();
    }
    
    
    @Override
    public void subscriber(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("No Subscriber yet");  
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
            
        }
    }

    @Override
    public void unSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        if (!changed) {
            return;
            
        }
        else{
            this.changed = false;
            for(Observer observer:this.observers)
            {
                observer.update();
            }
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
    
    public void postMessage(String message){
        System.out.println("Message Posted: "+message);
        this.message = message;
        this.changed = true;
        notifySubscriber();
    }
    
}

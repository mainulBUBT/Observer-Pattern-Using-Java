/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author MIHAN
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Youtube subscribe = new Youtube();
        
        Observer observer = new ChannelSubscriber("Mihan");
        
        subscribe.subscriber(observer);
        observer.subscribe(subscribe);
        
        observer.update();
        
        subscribe.postMessage("New Album 2021");
    }
    
}

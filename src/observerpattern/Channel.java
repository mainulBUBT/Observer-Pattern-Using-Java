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
public interface Channel {
    public void subscriber(Observer observer);
    public void unSubscriber(Observer observer);
    public void notifySubscriber();
    public Object getUpdate(Observer observer);
}

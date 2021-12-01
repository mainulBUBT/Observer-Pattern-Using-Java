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
public class ChannelSubscriber implements Observer{
    private String name;
    private Channel channel;

    public ChannelSubscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void update() {
        String message = (String) channel.getUpdate(this);
        if (message == null) {
            System.out.println(name+ ": No new updates.");
        }
        else{
            System.out.println(name+ ": New video uploaded check->. "+message);
        }
    }

    @Override
    public void subscribe(Channel channel) {
        this.channel = channel;
    }
    
}

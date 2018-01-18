/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vikram
 */
public class AutoScroller implements Runnable{
    
    private PlayScreen ps;
    private int delay;
    private int times;
    public AutoScroller(PlayScreen ps,int seconds,int times)
    {
        this.delay = seconds*1000;
        this.ps = ps;
        this.times=times;
    }
    
    @Override
    public void run()
    {
        System.out.println("Thread Started running.");
        for (int i = 0; i < times; i++) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(AutoScroller.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps.nextLine();
            System.out.println("Triggered!!!!!");
        }
    }
}

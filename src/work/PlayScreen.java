/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @version 1.0v
 * @author SHAUGAN
 */
public class PlayScreen extends JPanel {
    
    
    //LyricsManager reference which will be passed by the ListManager to Playscreen.
    LyricsManager lm;
    
    
    /**
     * Play screen will show the lyrics line on screen
     */
    public PlayScreen()
    {
        this.lm = lm;
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.drawString("This is a sample lyrics....here lyrics line will be shown", 300, 400);
    }
    public boolean nextLine()
    {
        //Here goes the code to remove the first line and add the last line.
        this.repaint();
        return false;
    }
}

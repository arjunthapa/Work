/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * @version 1.0v
 * @author SHAUGAN
 */
public class PlayScreen extends JPanel {
    
    
    //LyricsManager reference which will be passed by the ListManager to Playscreen.
    LyricsManager lm;
    LyricsLine cl;
    
    /**
     * Play screen will show the lyrics line on screen
     */
    public PlayScreen(LyricsManager lm)
    {
        this.lm = lm;
        
    }
    @Override
    public void paint(Graphics g)
    {
        cl = lm.getLyrics().get(0);
        ArrayList<LyricsWords> lw = cl.getLyricsWords();
        g.setColor(Color.red);
        for (LyricsWords lyricsWords : lw) {
            
        }
        
        
        g.drawString("", 300, 400);
    }
    public boolean nextLine()
    {
        //Here goes the code to remove the first line and add the last line.
        this.repaint();
        return false;
    }
    
}

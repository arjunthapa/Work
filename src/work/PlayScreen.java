/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     *
     * @param lm
     */
    public PlayScreen(final LyricsManager lm) {
        
        this.lm = lm;
        System.out.println("No of lines found in Playscreen: " + lm.getLyrics().size());
        if (lm.getLyrics().size() > 0) {
            cl = lm.getLyrics().get(0);
            System.out.println(cl.getLine());
        }
        new Thread(new AutoScroller(this,2,lm.getLyrics().size())).start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 2000, 2000);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
      
        ArrayList<LyricsWords> lw = cl.getLyricsWords();
        int x=200;
        for (LyricsWords lyricsWords : lw) {
            
            g.setColor(lyricsWords.getColor());
            g.drawString(lyricsWords.getChord(), x, 350);
            g.drawString(lyricsWords.getWords(), x, 400);
            x=x+(g.getFontMetrics().stringWidth(lyricsWords.getWords())+10);
        }
        
      
    }
int i=0;
    public boolean nextLine() {
        //Here goes the code to remove the first line and add the last line.
       
            cl = lm.getLyrics().get(i);
            i++;
            this.repaint();
        
                
        return false;
    }

}

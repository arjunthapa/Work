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
        Thread th = new Thread(){
            
            @Override
            public void run()
                {
                    for(int i=0;i<lm.getLyrics().size();i++)
                    {
                        try {
                            Thread.sleep(2000);
                            nextLine();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(PlayScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            
            
        };
        th.start();
    }

    @Override
    public void paint(Graphics g) {
     
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 2000, 2000);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
      
         ArrayList<LyricsWords> lw = cl.getLyricsWords();
//         g.setColor(Color.RED);
////        g.drawString(TOOL_TIP_TEXT_KEY, WIDTH, WIDTH);
            int x=100;
        for (LyricsWords lyricsWords : lw) {
            
            g.setColor(lyricsWords.getColor());
            
            g.drawString(lyricsWords.getChord(), x, 350);
            g.drawString(lyricsWords.getWords(), x, 400);
            x=x+(lyricsWords.getWords().length()*28);
        }
        nextLine();
      
    }
int i=0;
    public boolean nextLine() {
        //Here goes the code to remove the first line and add the last line.
        if(i<lm.getLyrics().size()) {
            
            cl = lm.getLyrics().get(i);
            
            this.repaint();
        }
                
        return false;
    }

}

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
    public PlayScreen(LyricsManager lm) {
        super.setBackground(Color.red);
        this.lm = lm;
        System.out.println("No of lines found in Playscreen: " + lm.getLyrics().size());
        if (lm.getLyrics().size() > 0) {
            cl = lm.getLyrics().get(0);
            System.out.println(cl.getLine());
        }
    }

    @Override
    public void paint(Graphics g) {
          g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
      
         ArrayList<LyricsWords> lw = cl.getLyricsWords();
//         g.setColor(Color.RED);
////        g.drawString(TOOL_TIP_TEXT_KEY, WIDTH, WIDTH);
            int x=100;
        for (LyricsWords lyricsWords : lw) {
            g.setColor(lyricsWords.getColor());
            x=x+(lyricsWords.getWords().length()*30);
            g.drawString(lyricsWords.getChord(), x, 350);
            g.drawString(lyricsWords.getWords(), x, 400);
        }
        
      
    }

    public boolean nextLine() {
        //Here goes the code to remove the first line and add the last line.
        this.repaint();
        return false;
    }

}

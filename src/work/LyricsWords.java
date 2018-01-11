/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author badbo
 */

    public class LyricsWords
    {
        String chord;
        String wrds;
        String wrd;
        Color color=Color.WHITE;
       
        public LyricsWords(String wrds)
        {
            
            try {
                this.wrds=wrds;
                breakDownChord();
                System.out.println("Chord : "+chord);
                System.out.println("Word : "+wrd);
            } catch (Exception ex) {
                Logger.getLogger(LyricsLine.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public String getChord() {
            return chord;
        }

        public String getWords() {
            return wrd;
        }

        public Color getColor() {
            return color;
        }
        
        public void setColor(Color color)
        {
            this.color = color;
        }
        private void breakDownChord() throws Exception
        {
            String[] crd = wrds.split(":");
            //System.out.println("Second Word: "+crd[1]);
            if(crd.length==2)
            {
                chord = crd[0];
                wrd = crd[1];
            }
            else
                    throw new Exception("Corresponding Lyrics or Chords missing.");
            
        }
    }
    
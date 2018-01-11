/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author badbo
 */
public class LyricsLine {
    
    
    ArrayList<LyricsWords> words;
    
    String line;
    public LyricsLine(String line)
    {
        System.out.println(line);
        words = new ArrayList();
        this.line=line;
        breakDownWords(line);
    }
    public String getLine()
    {
        return line;
    }
    public ArrayList<LyricsWords> getLyricsWords()
    {
        return words;
    }
    
    private void breakDownWords(String lLine)
    {
        //Here code must be written for breaking down line into words
        String[] list = lLine.split("\\|");
        System.out.println("List length: "+list.length);
        Color colorList[] = {Color.YELLOW,Color.lightGray,Color.WHITE,Color.orange,Color.YELLOW,Color.lightGray,Color.WHITE,Color.orange};
        int i=0;
        for (String string : list) {
            //System.out.println(string);
            LyricsWords lw = new LyricsWords(string);
            lw.setColor(colorList[i]);
            words.add(lw);
            i++;
        }
    }
            
}

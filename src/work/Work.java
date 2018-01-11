/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template winile, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.parser.ParseException;

/**
 *
 * @author badbo
 */
public class Work {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        // TODO code application logic here
//        JFrame win = new JFrame("Guitar Chords and Lyrics");
//        win.add(new Screen());
//        win.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        win.setUndecorated(true);
//        win.setVisible(true);
        LyricsManager lm = new LyricsManager();
        //TODO: Path has to be taken automatically
         String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);
        
        lm.readLyrics(currentDir+"\\src\\work\\lyrics\\Sambodhan.lyr");
        ArrayList<LyricsLine> lyrics = lm.getLyrics();
        
        for (Iterator<LyricsLine> iterator = lyrics.iterator(); iterator.hasNext();) {
            LyricsLine next = iterator.next();
            ArrayList<LyricsWords> wordList = next.getLyricsWords();
            //System.out.println("WordList Length: "+wordList.size());
            
            for (Iterator<LyricsWords> iterator1 = wordList.iterator(); iterator1.hasNext();) {
                LyricsWords words = iterator1.next();
                System.out.printf(" %s [%s](%s) ",words.getColor().toString(),words.getChord(),words.getWords());
            }
            System.out.println();
        }
    }

}

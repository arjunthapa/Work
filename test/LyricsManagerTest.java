/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import work.LyricsLine;
import work.LyricsManager;
import work.LyricsWords;

/**
 *
 * @author vikram
 */
public class LyricsManagerTest {
    
    public LyricsManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    
         LyricsManager lm = new LyricsManager();
        //TODO: Path has to be taken automatically
         String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);
        
        lm.readLyrics(currentDir+"/src/work/lyrics/Sambodhan.lyr");
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

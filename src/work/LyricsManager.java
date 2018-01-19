/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LyricsManager {

    ArrayList<LyricsLine> lyrics;

    public LyricsManager() {
        lyrics = new ArrayList();
    }

    public boolean readLyrics(String lyricsName) {

        System.out.println("Lyrics passed by List Manager is: "+lyricsName);
        this.lyrics.clear();
        FileReader fr = null;
        BufferedReader br = null;

//         String fullPath = getClass().getResourceAsStream("/work/lyrics/"+lyricsName);
        System.out.println();
        try {
            fr = new FileReader(lyricsName);

            br = new BufferedReader(fr);
            String line = "";
            int i = 1;

            while ((line = br.readLine()) != null) {
                //System.out.println(i + ">>  " + line);
                this.lyrics.add(new LyricsLine(line));
            }
            System.out.println("No of Lines inserted: "+this.lyrics.size());
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LyricsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LyricsManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return false;
        }
    }

    public ArrayList<LyricsLine> getLyrics() {
        return this.lyrics;
    }

}

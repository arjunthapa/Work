/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template winile, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Arjun
 */
public class Work {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // TODO code application logic here
        JFrame win = new JFrame("Guitar Chords and Lyrics");
        win.add(new Screen());
        win.setExtendedState(JFrame.MAXIMIZED_BOTH);
        win.setUndecorated(true);
        win.setVisible(true);
    }

}

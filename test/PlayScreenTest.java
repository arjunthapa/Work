/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import work.PlayScreen;
import work.Screen;

/**
 *
 * @author SHAUGAN
 */
public class PlayScreenTest {
    
    public PlayScreenTest() {
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
    public void ScreenTest() {
     JFrame win = new JFrame("Guitar Chords and Lyrics");
        win.add(new PlayScreen());
        
        win.setExtendedState(JFrame.MAXIMIZED_BOTH);
        win.setUndecorated(true);
        win.setVisible(true);
    }
}

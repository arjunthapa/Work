/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import work.LyricsWords;

/**
 *
 * @author badbo
 */
public class LyricsWordTest {
    
    public LyricsWordTest() {
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
    // @Test
    // public void hello() {}
    @Test
    public void test()
    {
        LyricsWords lw = new LyricsWords("E:Sambodhan Timilae");
        Assert.assertEquals("E", lw.getChord());
        Assert.assertEquals("Sambodhan Timilae", lw.getWords());
        
    
    }
}

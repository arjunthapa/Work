/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.io.File;
import java.io.FilenameFilter;
import javax.swing.DefaultListModel;

/**
 *
 * @author badbo
 */
public class ListManager {
    
    String path;
    public ListManager(String path)
    {
        this.path = path;
    }
    public DefaultListModel getAllFiles()
    {
        DefaultListModel dt = new DefaultListModel();
        File directory = new File(path);
        if(directory.isDirectory())
        {
            //FileNameExtensionFilter filter = new FileNameExtensionFilter("Lyrics File","lyr");
            File list[] = directory.listFiles(new FilenameFilter(){
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".lyr");
                }
                
            });
            for (File file : list) {
                dt.addElement(file.getName());
            }
            return dt;
        }
        return null;
    }
    String currentLyrics;
    public void setSelectedLyrics(String currentLyrics)
    {
        this.currentLyrics=currentLyrics;
    }
    public String getSelectedLyrics()
    {
        //TODO : must return the selected list item string. 
        return currentLyrics;
    }
    public LyricsManager getLyricsManager()
    {
        //TODO : must create a lyricsManager object.
        LyricsManager ly =new LyricsManager();
        ly.readLyrics(path+currentLyrics);
        return new LyricsManager();
    }
    
}

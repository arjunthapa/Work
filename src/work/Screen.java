/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author badbo
 */
public class Screen extends JPanel {

    JPanel side = new JPanel();
    JPanel workSpace = new JPanel();
    SideBar sb;
    WorkSpace ws;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    ListManager lm;
    public Screen() throws IOException {
         String currentDir = System.getProperty("user.dir");
         currentDir = currentDir+"/src/work/lyrics/";
         System.out.println("Current Directory for lyrics: "+currentDir);
        lm = new ListManager(currentDir);
        int x = (int) (screenSize.getWidth() * 0.3f);
        side.setBackground(Color.red);
        side.setPreferredSize(new Dimension(x, (int) screenSize.getHeight()));
        this.setLayout(new BorderLayout());

        this.add(side, BorderLayout.LINE_START);

        workSpace.setBackground(Color.yellow);
        workSpace.setPreferredSize(new Dimension((int) (screenSize.getWidth() - x), (int) screenSize.getHeight()));
        this.add(workSpace);

        
        sb = new SideBar(new Dimension(x, (int) screenSize.getHeight()),lm);
        side.add(sb);
        workSpace.setLayout(new BorderLayout());
        //Comment added here.
        
        ws = new WorkSpace(new Dimension((int) (screenSize.getWidth() - x), (int) screenSize.getHeight()),lm);
        workSpace.add(ws);
        
        
        
}
}

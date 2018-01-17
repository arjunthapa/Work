package work;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author badbo
 */
public class WorkSpace extends JPanel {
    
    private Dimension dim;
    private JPanel WorkSpacePane;
    private JButton btn;
    
    
    public WorkSpace(Dimension dim)
    {
        this.dim=dim;
        this.setPreferredSize(dim);
        WorkSpacePane = new JPanel();
        btn = new JButton("Play");
        
        addWorkSpacePane();
    }
    
    public void addWorkSpacePane()
    {
        WorkSpacePane.setPreferredSize(dim);
        WorkSpacePane.setBackground(Color.LIGHT_GRAY);
        this.add(WorkSpacePane);
        btn.setBounds(100, 100, 100, 50);
        WorkSpacePane.add(btn);
         btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayScreen ps;
                ps = new PlayScreen();
                ps.newFrame();
            }
        });
    }
    
}
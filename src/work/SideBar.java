/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author badbo
 */
public class SideBar extends JPanel{
    
    private JPanel searchPanel;
    private JPanel listPanel;
    private JButton btn;
    private JTextField tf;

    private Dimension dimension;
    JList<String> list = new JList();
    JScrollPane sp = new JScrollPane(list);
    ListManager lm;
    
    public SideBar(Dimension dimension,ListManager lm)
    {
        this.dimension = dimension;
        this.lm = lm;
        this.setPreferredSize(dimension);
        searchPanel = new JPanel();
        listPanel =  new JPanel();
        btn = new JButton("Search");
        tf = new JTextField("Search here.........");
        sp.setPreferredSize(dimension);
        
        addSearchPanel();
        addlistPanel();
        readList();
    }
    private void readList()
    {
        list.setModel(lm.getAllFiles());
    }
    public void addSearchPanel()
    {
        searchPanel.setPreferredSize(new Dimension((int)this.dimension.getWidth(),100));
        searchPanel.setBackground(Color.orange);
        this.add(searchPanel);
        searchPanel.add(tf);
        searchPanel.add(btn);
    }
    
    public void addlistPanel(){
        listPanel.setPreferredSize(new Dimension((int) this.dimension.getWidth(),(int) this.dimension.getHeight()-100));
        listPanel.setBackground(Color.BLUE);
        
        listPanel.add(sp);
        this.add(listPanel);
        list.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList source = (JList)e.getSource();
                System.out.println(source.getSelectedValue());
            }
            
        });
        
        
        
    }
}

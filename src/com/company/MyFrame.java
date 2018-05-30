package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        MyPanel panel = new MyPanel();
        Container container = getContentPane();
        container.add(panel);
        setBounds(10,10,450,450);
        setVisible(true);
    }
}

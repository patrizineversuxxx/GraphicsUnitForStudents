package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel {
    private Image image;
    private int x=0, y=0;
    public static char direction;

    private final String path = "C:/IO/earth.gif";

    public MyPanel(){

        addKeyListener(new KeyInput());
        setFocusable(true);

        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (direction){
                    case 'u':{
                        y--;
                        break;
                    }
                    case 'd':{
                        y++;
                        break;
                    }
                    case 'l':{
                        x--;
                        break;
                    }
                    case 'r':{
                        x++;
                        break;
                    }
                    default:
                        break;
                }
                repaint();
            }
        });
        timer.start();
        try{
           image = ImageIO.read(new File(path));
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
//    public void paintComponent(Graphics graphics){
//        /*super.paintComponent(graphics);
//        graphics.setColor(Color.YELLOW);
//        graphics.fillRect(20,20,200,200);
//        graphics.drawRect(10,10,300,300);
//        graphics.setColor(Color.GREEN);
//        graphics.fillOval(300,300,100,100);
//        graphics.drawLine(0,0,400,400);
//        graphics.setColor(Color.GREEN);
//        graphics.drawString("SomebodyOnceToldME",10,10);
//
//        for (int i=0; i<15;i++){
//            graphics.fillOval(10*i,10*i,5*i,5*i);
//        }*/
//    }


    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.clearRect(x-1,y-1, image.getWidth(null)+1,image.getHeight(null)+1);
        graphics.drawImage(image,x,y,null);
    }
}

package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case 37:{
                MyPanel.direction='l';
                break;
            }
            case 39:{
                MyPanel.direction='r';
                break;
            }
            case 38:{
                MyPanel.direction='u';
                break;
            }
            case 40:{
                MyPanel.direction='d';
                break;
            }
            default:{
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        MyPanel.direction = 'k';
    }
}

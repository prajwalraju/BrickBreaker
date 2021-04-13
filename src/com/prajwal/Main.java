package com.prajwal;

import javax.swing.*;

public class Main {

    // Main method
    public static void main(String[] args) {

        // New instance of Jframe and Gameplay
        JFrame obj=new JFrame();
        Gameplay gamePlay = new Gameplay();

        // define the size of the Jframe
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add gameplay to Jframe
        obj.add(gamePlay);
        obj.setVisible(true);

    }

}

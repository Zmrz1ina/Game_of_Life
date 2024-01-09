package org.example;
import javax.swing.*;

// Создание окна вывода
public class Window implements Runnable{

    JFrame frame;

    @Override
    public void run() {

        initFrame();
    }

    void initFrame(){

        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game of Life");
    }

}

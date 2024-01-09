package org.example;

import javax.swing.*;

// Создание окна вывода
public class Window implements Runnable {

    JFrame frame;
    Box[][] boxes;


    @Override
    public void run() {

        initFrame();
        initBoxes();
    }

    void initFrame() {

        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(Config.SIZE * Config.WIDTH, Config.SIZE * Config.HEIGHT); // + размер
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Game of Life");
    }

    private void initBoxes() { // рисует все клетки

        boxes = new Box[Config.WIDTH][Config.HEIGHT];

        for (int x = 0; x < Config.WIDTH; x++) {
            for (int y = 0; y < Config.HEIGHT; y++) {

                boxes[x][y] = new Box(x, y);
                frame.add(boxes[x][y]);
            }
        }
    }

}

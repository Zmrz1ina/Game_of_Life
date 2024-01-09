package org.example;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Box extends JPanel {

    public Box(int x, int y) {

        super();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.black);

        setBorder(BorderFactory.createLineBorder(Color.white, 1)); // установка границы ячейки

    }
}

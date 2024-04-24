package org.game.gui;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.initBasics();
    }

    private void initBasics() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

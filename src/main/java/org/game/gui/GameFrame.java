package org.game.gui;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.initBasics();
    }

    private void initBasics() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setContentPane(ContentPanel.getPanel());
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

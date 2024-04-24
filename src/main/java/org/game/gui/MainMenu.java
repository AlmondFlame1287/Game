package org.game.gui;

import org.game.utils.Constants;

import javax.swing.*;

public class MainMenu extends JPanel {
    public MainMenu() {
        this.setupMainMenu();
    }

    private void setupMainMenu() {
        final JButton startGame = new JButton("Start");
        final JButton settings = new JButton("Settings");
        final JButton quit = new JButton("Quit");

        this.add(startGame);
        this.add(settings);
        this.add(quit);

        startGame.addActionListener(_ -> ContentPanel.getPanel().changePanel(Constants.GAME));
        settings.addActionListener(_ -> ContentPanel.getPanel().changePanel(Constants.SETTINGS));
        quit.addActionListener(_ -> System.exit(0));
    }
}

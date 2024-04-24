package org.game.gui;

import javax.swing.*;
import java.awt.*;

import org.game.utils.Constants;

public class ContentPanel extends JPanel {
    private static ContentPanel instance;
    private final CardLayout layout;


    private ContentPanel() {
        layout = new CardLayout();
        this.setLayout(layout);
        this.setupPanels();
        this.changePanel(Constants.MAINMENU);
    }

    public static ContentPanel getPanel() {
        if(instance == null)
            instance = new ContentPanel();
        return instance;
    }

    private void setupPanels() {
        this.add(new MainMenu(), Constants.MAINMENU);
        this.add(new SettingsPanel(), Constants.SETTINGS);
        this.add(new GamePanel(), Constants.GAME);
        this.add(new AudioSettingsPanel(), Constants.AUDIOSETTINGS);
        this.add(new GameplayPanel(), Constants.GAMEPLAYSETTINGS);
    }

    public void changePanel(String newPanel) {
        layout.show(this, newPanel);
    }
}

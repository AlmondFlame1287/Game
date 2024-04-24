package org.game.gui;

import org.game.utils.Constants;

import javax.swing.*;

public class SettingsPanel extends JPanel {
    public SettingsPanel() {
        this.setupButtons();
    }

    private void setupButtons() {
        final JButton audio = new JButton("Audio");
        final JButton gameplay = new JButton("Gameplay");

        this.add(audio);
        this.add(gameplay);

        audio.addActionListener(_ -> ContentPanel.getPanel().changePanel(Constants.AUDIOSETTINGS));
        gameplay.addActionListener(_ -> ContentPanel.getPanel().changePanel(Constants.GAMEPLAYSETTINGS));
    }
}

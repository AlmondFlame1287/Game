package org.game.gui;

import javax.swing.*;

public class AudioSettingsPanel extends JPanel {
    private JSlider audioSlider;

    public AudioSettingsPanel() {
        this.setupButtons();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private void setupButtons() {
        final JButton musicOn = new JButton("Music on");
        final JButton musicOff = new JButton("Music off");

        this.add(musicOn);
        this.add(musicOff);

        musicOn.addActionListener(_ -> System.out.println("TODO"));
        musicOff.addActionListener(_ -> System.out.println("TODO"));
    }

    public void startMusic() {
        //TODO: complete implementation
    }

    public void stopMusic() {
        //TODO: complete implementation
    }

    public void setAudioVolume() {
        //TODO: complete implementation
    }
}

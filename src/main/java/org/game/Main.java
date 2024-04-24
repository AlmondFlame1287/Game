package org.game;

import javax.swing.*;
import org.game.gui.GameFrame;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameFrame::new);
    }
}
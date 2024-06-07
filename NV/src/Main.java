
package src;

import javax.swing.*;
import src.presentation.MainMenuScreen;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainMenuScreen();
        });
    }
}

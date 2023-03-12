package name.klamm.chess.helper.app.swing;

import name.klamm.chess.helper.lib.Hello;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final String appName = new Hello().hello();
    public MainFrame() {
        super(appName);
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel(appName));

        setLocationRelativeTo(null);
    }
}

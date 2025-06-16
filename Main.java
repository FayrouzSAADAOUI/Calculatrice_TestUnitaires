import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    private int count = 0;

    public Main() {

        JFrame frame = new JFrame("Compteur de Clics");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Clics : 0", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(label, BorderLayout.CENTER);

        JButton clickButton = new JButton("Clique clique clique");
        clickButton.addActionListener(e -> {
            count++;
            label.setText("Clics : " + count);
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            count = 0;
            label.setText("Clics : 0");
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clickButton);
        buttonPanel.add(resetButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}

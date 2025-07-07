import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    private Compteur compteur = new Compteur();

    public Main() {

        JFrame frame = new JFrame("Compteur de Clics");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Clics : 0", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(label, BorderLayout.CENTER);

        JButton clickButton = new JButton("Clique");
        clickButton.addActionListener(e -> {
            compteur.increment();
            label.setText("Clics : " + compteur.getCount());
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            compteur.reset();
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

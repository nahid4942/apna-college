import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    
    public MainWindow() {
        setTitle("PDF Reader");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initializeUI();
    }

    private void initializeUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton openButton = new JButton("Open PDF");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to open a PDF file
            }
        });

        panel.add(openButton, BorderLayout.NORTH);
        
        // Additional UI components can be added here

        add(panel);
    }

    public void showWindow() {
        setVisible(true);
    }
}
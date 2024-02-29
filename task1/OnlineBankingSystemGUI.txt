import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OnlineBankingSystemGUI extends JFrame {
    private JLabel welcomeLabel;
    private JButton loginButton;
    private JButton createAccountButton;
    private JButton exitButton;

    public OnlineBankingSystemGUI() {
        super("Online Banking System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        welcomeLabel = new JLabel("Welcome to Online Banking System");
        loginButton = new JButton("Login");
        createAccountButton = new JButton("Create Account");
        exitButton = new JButton("Exit");

        add(welcomeLabel);
        add(loginButton);
        add(createAccountButton);
        add(exitButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open login dialog
                JOptionPane.showMessageDialog(null, "Login dialog opened.");
            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open create account dialog
                JOptionPane.showMessageDialog(null, "Create account dialog opened.");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Exit the application
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                OnlineBankingSystemGUI app = new OnlineBankingSystemGUI();
                app.setVisible(true);
            }
        });
    }
}


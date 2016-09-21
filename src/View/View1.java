package View;

import Controller.MainController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View1 extends JFrame{
    private JPanel MainPanel;
    private JButton vorwärtsButton;
    private JButton angriffButton;
    private JButton linksButton;
    private JButton rechtsButton;
    private JButton zurückButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton interagierenButton;
    private MainController controller;

    public View1(MainController controller){
        super("The Legend of the heilige Seegurke");
        this.controller = controller;
        setContentPane(MainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        vorwärtsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        rechtsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        linksButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        zurückButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        interagierenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        angriffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void changeTextArea1(String text){
        textArea1.setText(text);
    }

    public void changeTextArea2(String text){
        textArea2.setText(text);
    }
}

package View_1;

import javax.swing.*;
import Controller.MainController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainView extends JFrame {
    private JPanel RootPanel;
    private JButton linksButton;
    private JButton rechtsButton;
    private JButton aktionstasteButton;
    private JButton vorwaertsButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private MainController controller;


    public MainView(MainController controller) {
        super("Text Adventure");
        this.controller = controller;
        setContentPane(RootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        linksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        vorwaertsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        aktionstasteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        rechtsButton.addActionListener(new ActionListener() {
            @Override
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






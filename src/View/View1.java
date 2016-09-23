package View;

import Controller.MainController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View1 extends JFrame implements View{
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



        rechtsButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                controller.changeRoomRight();
            }
        });

        linksButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                controller.changeRoomLeft();
            }
        });

        zurückButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                controller.changeRoomFrontOrBack();
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
        vorwärtsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.changeRoomFrontOrBack();
                updateTheGUI();
            }
        });
    }

    private void changeTextArea1(String text){
        textArea1.setText(text);
    }

    private void changeTextArea2(String text){
        textArea2.setText(text);
    }

    public void printText(String text){
        changeTextArea1(text);
    }

    private void updateTheGUI(){
        changeTextArea1(controller.doTheTextthing());
    }
}

package View;

import Controller.MainController;

public class View2 implements View{

    private MainController controller;

    public View2(MainController controller){
        this.controller = controller;
    }

    public void printText(String text){
        System.out.println(text);
    }
}

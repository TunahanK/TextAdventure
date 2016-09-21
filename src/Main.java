import java.util.*;
import Controller.MainController;
import View.*;

public class Main {
    public static void main(String[] args) {
        int viewZahl;

        Scanner scan = new Scanner(System.in);

        System.out.println("Wähle, wie du Spielen willst: 1 = GUI, 2 = Konsole");
        viewZahl = scan.nextInt();

        MainController controller = new MainController();
        if(viewZahl == 1){
            View1 view1 = new View1(controller);
        }else if(viewZahl == 2){
            View2 view2 = new View2(controller);
        }else if(viewZahl != 1 || viewZahl != 2){
            System.out.println("UNGÜLTIG! Starte das Spiel neu und wähle 1 oder 2!");
        }
    }
}

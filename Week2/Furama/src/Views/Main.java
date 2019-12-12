package Views;

import Controllers.MainController;
import Controllers.Validator;
import Models.Services;
import Models.Villa;

import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController ();
        mainController.displayMainMenu ();

    }
}

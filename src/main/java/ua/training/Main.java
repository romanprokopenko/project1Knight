package ua.training;

import ua.training.control.Control;
import ua.training.model.Model;
import ua.training.view.View;

/**
 * Class represents main class where the program starts
 *
 * @author Roman Prokopenko
 */
public class Main {
    public static void main(String[] args) {

        //initialization of components
        View view = new View();
        Model model = new Model();
        Control control = new Control(model, view);

        //run
        control.processUser();
    }
}

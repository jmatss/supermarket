package se.kth.ict.nextgenpos.startup;

import se.kth.ict.nextgenpos.controller.Controller;
import se.kth.ict.nextgenpos.view.View;
import se.kth.ict.nextgenpos.util.LogHandler;

/**
 * Starts the application.
 */
public class Main {
    public static void main(String[] args) {
	Controller cont = new Controller();
	View view = new View(cont);
	view.test();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.Controller.addWorker;
import static controller.Controller.decrease;
import static controller.Controller.displayAdjustedList;
import static controller.Controller.increase;
import model.WorkerList;

/**
 *
 * @author OS
 */
public class App {
      public static void main(String[] args) {
        WorkerList wkl = new WorkerList();
        int choice;
        while (true) {
            choice = Menu.chooseInputOption();
            switch (choice) {
                case 1:
                    addWorker(wkl);
                case 2:
                    decrease(wkl);
                case 3: {
                    increase(wkl);
                }
                case 4:
                    displayAdjustedList(wkl);
                case 5:
                    System.exit(0);
            }
        }
    }
}

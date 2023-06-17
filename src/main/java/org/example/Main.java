package org.example;

import org.example.main_exercise.toy_shop.Toy;
import org.example.main_exercise.toy_shop.ToyStore;
import org.example.main_exercise.toy_shop.controller.Controller;
import org.example.main_exercise.toy_shop.model.Model;
import org.example.main_exercise.toy_shop.view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);

        Toy toy1  = new Toy(1,"car",2,3);
        Toy toy2 = new Toy(2,"bear",3,5);
        Toy toy3 = new Toy(3,"plane",5,2);
        Toy toy4  = new Toy(4,"tank",2,4);
        Toy toy5 = new Toy(5,"ship",3,1);
        Toy toy6 = new Toy(6,"bird",4,6);
        model.addToyToStore(toy1);
        model.addToyToStore(toy2);
        model.addToyToStore(toy3);
        model.addToyToStore(toy4);
        model.addToyToStore(toy5);
        model.addToyToStore(toy6);
        model.addToysToPrizes(model.getToystore());
        model.addToysToPrizes(model.getToystore());
        model.addToysToPrizes(model.getToystore());
        controller.printPrizes();
        controller.update();


    }
}
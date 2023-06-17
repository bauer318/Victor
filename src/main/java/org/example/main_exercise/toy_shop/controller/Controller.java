package org.example.main_exercise.toy_shop.controller;

import org.example.main_exercise.toy_shop.ToyStore;
import org.example.main_exercise.toy_shop.model.Model;
import org.example.main_exercise.toy_shop.view.View;

public class Controller {
    Model model = new Model();
    View view = new View();
    ToyStore toyStore = new ToyStore();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void update(){
        System.out.println(model);
    }
    public void printPrizes(){
        view.printToyStore(model.getPrizesFromStore());
    }


}

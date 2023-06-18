package org.example.main_exercise.toy_shop.view;

import org.example.main_exercise.toy_shop.Toy;
import org.example.main_exercise.toy_shop.ToyUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prizelist {
    List<Toy> prizes = new ArrayList<>();

    public List<Toy> getPrizes() {
        return prizes;
    }

    public void addPrizeToy(Toy toy) {
        //We clone the Toy's object
        Toy toyClone = ToyUtil.clone(toy);
        //Set his quantity to one
        toyClone.setQuantity(1);

        //if there is already this object in the list
        if (prizes.contains(toyClone)) {
            //Then we get it by his index
            Toy currentToy = prizes.get(prizes.indexOf(toyClone));
            //We increment its quantity
            toyClone.setQuantity(currentToy.getQuantity() + 1);
            //So we can remove it from the list
            prizes.remove(currentToy);
        }
        prizes.add(toyClone);
    }
    @Override
    public String toString() {
        return prizes + "";
    }

    public void setPrizes(List<Toy> prizes) {
        this.prizes = prizes;
    }
}

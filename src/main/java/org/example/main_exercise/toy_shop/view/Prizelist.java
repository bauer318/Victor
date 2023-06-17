package org.example.main_exercise.toy_shop.view;

import org.example.main_exercise.toy_shop.Toy;
import org.example.main_exercise.toy_shop.ToyUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prizelist {
    List<Toy>prizes = new ArrayList<>();

    public List<Toy> getPrizes() {
        return prizes;
    }
    public void addPrizeToy(Toy toy){
        Toy toyClone = ToyUtil.clone(toy);
        if(ToyUtil.isExist(prizes,toyClone)){
            toyClone.setQuantity(toyClone.getQuantity()+1);
        }
        else{
            toyClone.setQuantity(1);
        }
        prizes.add(toyClone);
        remove(prizes);
    }
    private void remove(List<Toy> toys){
        List<Toy>toysclone = new ArrayList<>();
        for(int i = 0; i < toys.size()-1;i++){
            Toy toy1 = toys.get(i);
            Toy toy2 = toys.get(i+1);
            if((toy1.getId() == toy2.getId()) && (toy1.getQuantity()<toy2.getQuantity())){
                if(!toysclone.isEmpty()){
                    toysclone.remove(0);
                }
                toysclone.add(toy2);

            }
        }
    }
    private  int getIndex(List<Toy>toys,Toy toy){
        int count = 0;
        Iterator<Toy> iterator = toys.iterator();
        while(iterator.hasNext()){
            Toy current = iterator.next();
            if(current.getId()==toy.getId()){
                return count;
            }
            count++;
        }return count;
    }

    @Override
    public String toString() {
        return prizes+"";
    }

    public void setPrizes(List<Toy> prizes) {
        this.prizes = prizes;
    }
}

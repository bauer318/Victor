package org.example.main_exercise.toy_shop.model;

import org.example.main_exercise.toy_shop.Toy;
import org.example.main_exercise.toy_shop.ToyStore;
import org.example.main_exercise.toy_shop.view.Prizelist;

import java.util.*;

public class Model {
    Prizelist prizelist = new Prizelist();
    ToyStore toyStore = new ToyStore();
    Random random = new Random();
    //    List<Toy>prizeList1 = new ArrayList<>();
    Set<Toy> set = new HashSet<>();

    public ToyStore addToyToStore(Toy toy) {
        toyStore.addToy(toy);
        return toyStore;
    }

    public void changeWeight(Toy toy) {
        System.out.println("enter new weight value: ");
        double numA = scanner.nextDouble();
        toy.setWeight(numA);
        toy.setFreqOfGetting();
    }

    Scanner scanner = new Scanner(System.in);

    public Toy getToyFromToys() {
        System.out.println("enter index of toy where you want to change weight: ");
        return toyStore.getToys().get(scanner.nextInt());
    }

    @Override
    public String toString() {
        return toyStore + "";
    }

    public ToyStore getToystore() {
        return this.toyStore;
    }

    int count = 0;

    //final int[] ints = new Random().ints(1, 50).distinct().limit(6).toArray();
    private void setOneQuantity(Prizelist prizelist){
        for(int i = 0; i<prizelist.getPrizes().size();i++){
            prizelist.getPrizes().get(i).setQuantity(1);
        }
    }
    public void addToysToPrizes(ToyStore toyStore) {
        System.out.println("enter indexes of toys what you want to give for a present: ");
        int indexreqst = scanner.nextInt();
        for (int i = 0; i < toyStore.getToys().size(); i++) {
            if (toyStore.getToys().get(i).getId() == indexreqst) {
                toyStore.getToys().get(i).setQuantity(toyStore.getToys().get(i).getQuantity() - 1);
//                Toy toy1 =  toyStore.getToys().get(i);
//                Toy toy2 = new Toy(toy1.getId(), toy1.getName(),1,toy1.getWeight());
                prizelist.addPrizeToy(toyStore.getToys().get(i));

            }
        }


    }

    public Prizelist getPrizesFromStore() {
        return prizelist;
    }

    public void issueToyToPerson() {
        System.out.println("Enter toy name that you want to remove: ");
        for (int i = 0; i < prizelist.getPrizes().size(); i++) {
            if(prizelist.getPrizes().get(i).getName().equals(scanner.next())){
                prizelist.getPrizes().remove(i);
            }
        }
    }
}
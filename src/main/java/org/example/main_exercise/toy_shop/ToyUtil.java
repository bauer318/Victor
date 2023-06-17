package org.example.main_exercise.toy_shop;

import java.util.Iterator;
import java.util.List;

public class ToyUtil {
    public static Toy clone(Toy toy) {
        return new Toy(toy.getId(), toy.getName(), toy.getQuantity(), toy.getWeight());
    }

    public static boolean isExist(List<Toy> listToys, Toy toy0) {
        Iterator<Toy> iterator = listToys.iterator(); // заместо фор , так как итератор написан множеств любых
        while (iterator.hasNext()) { // пока у списка есть следующий элемент цикл продолжается
            Toy current = iterator.next();// следующий объект Той , записивыем в пееременную каррент
            if (current.getId() == toy0.getId()) { // сравнивает есть ли ай в списке или нет
                return true;
            }
        }
        return false;
    }
}

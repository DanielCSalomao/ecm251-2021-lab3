package Salomao.Daniel.sets;

import Salomao.Daniel.models.Item;
import Salomao.Daniel.models.ItemComparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new TreeSet<>(new ItemComparator());

        //Adiciona os elementos no HashSet
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Pera", 2));
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Banana", 3));

        //Exibe os itens
        itemSet.forEach(item -> System.out.println(item));
    }
}

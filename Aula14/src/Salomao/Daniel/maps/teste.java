package Salomao.Daniel.maps;

import Salomao.Daniel.models.Item;

import java.util.HashMap;
import java.util.Map;

import Salomao.Daniel.models.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new HashMap<>();
        int i = 0;
        Scanner scanner;
        scanner = new Scanner(System.in);
        //Adiciona itens no mapa
        do {
            System.out.println("Informe o nome: ");
            String nome = scanner.next();
            System.out.println("Informe o id:");
            int id = scanner.nextInt();
            String key = String.valueOf(i);
            itemMap.put(key, new Item(nome, id));
            i++;
            System.out.println(i);
        }while(i<5);
        //Passa por todos os elementos
        itemMap.forEach((chave, valor) -> System.out.println("Chave:"+chave+"\tValor:"+valor));

        //Imprime todos os elementos do map

        //Outra forma de recuperar os itens do Mapa
        Item item = itemMap.get("Item1");
        System.out.println(item);
        item = itemMap.get("Goku");
        System.out.println(item);
        item = itemMap.getOrDefault("Vegeta", new Item("Ola", 100));
        System.out.println(item);
        item = itemMap.getOrDefault("Item2", new Item("Ola", 100));
        System.out.println(item);
    }
}

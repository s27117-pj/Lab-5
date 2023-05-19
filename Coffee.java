import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coffee {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<>();
        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");

        System.out.println("Lista kaw:");
        for (String coffee : coffeeList) {
            System.out.println(coffee);}

        System.out.println("\nUżycie Iteratora:");
        Iterator<String> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());}

        System.out.println("\nUżycie pętli foreach (duże litery):");
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());}

        System.out.println("\nWypisanie 4 pierwszych liter:");
        for (String coffee : coffeeList) {
            if (coffee.length() >= 4) {
                System.out.println(coffee.substring(0, 4));}}}}
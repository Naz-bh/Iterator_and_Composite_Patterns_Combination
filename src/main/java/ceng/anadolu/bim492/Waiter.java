package ceng.anadolu.bim492;

import java.util.ArrayList;


public class Waiter {

    MenuComponentt allMenus;

    public Waiter(MenuComponentt allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print(false);
    }

    public void printVegetarianMenu() {
        Iteratorr iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu");

        while (iterator.hasNext()) {
            MenuComponentt menuComponent = (MenuComponentt) iterator.next();
            menuComponent.print(true);
        }
    }

}
package ceng.anadolu.bim492;

import java.util.ArrayList;

//Menu is a collection of MenuItems
public class Menu implements MenuComponentt {

    private ArrayList menuComponents = new ArrayList(); //every menu has a list
    private String name; //menu name
    private String description; //menu description

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponentt component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponentt component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponentt getChild(int i) {
        return (MenuComponentt) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return false; //throw new UnsupportedOperationException();
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print(boolean vegetarian) {
        System.out.println(getName() + getDescription());
        for(Object mc: menuComponents) {
            ((MenuComponentt)mc).print(vegetarian);
        }

    }
    @Override
    public Iteratorr createIterator() {
        return new CompositeIterator(menuComponents);
    }
}
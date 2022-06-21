package ceng.anadolu.bim492;

public interface MenuComponentt {
    //treats a menu item and a menu in the same way

    //all functions needed to support a collection of MenuComponents
    void add(MenuComponentt menuComponent);
    void remove(MenuComponentt menuComponent);
    MenuComponentt getChild(int i);

    //all functions needed to support an individual MenuItem
    String getName();
    String getDescription();
    boolean isVegetarian();
    double getPrice();
    void print(boolean vegetarian);
    Iteratorr createIterator();
}
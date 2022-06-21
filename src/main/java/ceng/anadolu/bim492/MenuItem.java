package ceng.anadolu.bim492;

public class MenuItem implements MenuComponentt {
    String name;
    String description;
    boolean vegetarian ;
    double price;


    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void add(MenuComponentt MenuComponentt) {

    }

    @Override
    public void remove(MenuComponentt MenuComponentt) {

    }

    @Override
    public MenuComponentt getChild(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print(boolean vegetarian) {  String veg = "";
        if (isVegetarian()) {
            veg = " (veg)";
        }
        if((vegetarian && isVegetarian()) || !vegetarian) {
            System.out.println("name: "+getName()+"\ndescription: " +getDescription()+ veg + "\ncost: " + getPrice()+"\n");
        }
        //could print description too
    }

    @Override
    public Iteratorr createIterator() {
        return new NullIterator();
    }
}
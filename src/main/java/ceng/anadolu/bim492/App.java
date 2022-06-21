
package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {

        MenuComponentt pancakeHouseMenu = new Menu("\nPancake house menu: ", "Breakfast menu\n");
        MenuComponentt dinerMenu = new Menu("\nDiner menu: ", "Breakfast and lunch menu\n");
        MenuComponentt cafeMenu = new Menu("\nCafe menu: ", "Lunch and dinner menu\n");

        //create a new menu that prints all the breakfast items - only available from PancakeHouse and Diner
        MenuComponentt breakfastItems = new Menu("\nBreakfast: ", "from PancakeHouse and Diner\n");
        breakfastItems.add(pancakeHouseMenu);
        breakfastItems.add(dinerMenu);
        System.out.println("\n");

        //create a new menu to print only lunch items - only from diner and cafe
        MenuComponentt lunchItems = new Menu("\nLunch: ", "from diner and cafe");
        lunchItems.add(cafeMenu);
        lunchItems.add(dinerMenu);



        //print all vegetarian items from every menu
        MenuComponentt allVegetarianItems = new Menu("\n Vegetarian: ", "vegetarian items");
        allVegetarianItems.add(pancakeHouseMenu);
        allVegetarianItems.add(cafeMenu);
        allVegetarianItems.add(dinerMenu);



        pancakeHouseMenu.add(new MenuItem("Blueberry muffin", "blueberry muffin", true,
                3.79));

        dinerMenu.add(new MenuItem("pasta", "pasta with bread", true, 3.99));
        dinerMenu.add(new MenuItem("pasta meat", "pasta with meatballs", false, 3.89));


        cafeMenu.add(new MenuItem("Ham and Cheese", "ham and cheese sandwich",
                false,  1.89));
        cafeMenu.add(new MenuItem("Chef Salad", "veggie salad",
                true, 1.79));



        //breakfast items
        System.out.println("BREAKFAST: \n");
        Waiter waiter2 = new Waiter(breakfastItems);
        waiter2.print();
        //waiter2.printVegetarianMenu();
        System.out.println("\n");

        //lunch items
        System.out.println("LUNCH: \n");
        Waiter waiter3 = new Waiter(lunchItems);
        waiter3.print();
        //waiter3.printVegetarianMenu();
        System.out.println("\n");

        //print all vegetarian items
        System.out.println("VEGETARIANS: ");
        Waiter waiter = new Waiter(allVegetarianItems);
        waiter.printVegetarianMenu();

    }
}

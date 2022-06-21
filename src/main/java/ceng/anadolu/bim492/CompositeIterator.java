package ceng.anadolu.bim492;

import java.util.ArrayList;

public class CompositeIterator implements Iteratorr {

    //holds a reference to the collection we will iterate
    ArrayList menuItems;
    int position = 0;

    public CompositeIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        //may be at end of list
        if(position>= menuItems.size()){
            return false; //at end of list, no next
        }else{
            return true; //can return next item
        }
    }

    @Override
    public Object next() {
        Object menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
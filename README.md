# Statement of Work
There are two restaurants that have different menus and they are merging together.
The new restaurant uses the first restaurant’s menu for Breakfast and the other’s for the
Lunch menu. Unfortunately, the representations of the menus are in different data structures.
One uses an array to hold its menu items and the other uses an arrayList. </br></br>
In order for the waiter at the new merged restaurant to use both menus he will have to
translate each menu into something he can use, but in order to translate them different
processes have to be used for each menu (because of the different data structures).</br></br>
This means that there is a violation of encapsulation (the waiter needs to know each
menu’s details), that there are no interfaces (coding to concrete implementations) and there is
a lot of duplication. In addition to this, if a change is made, there will be a lot of necessary
changes to existing code.</br></br>
To avoid this problem we have used Composer and Iterator Design Patterns together.</b></b>
# Explanation on Utilized Design Patterns
The Iterator Pattern: There are two restaurants that have different menus and they are
merging together. The new restaurant uses the first restaurant’s menu for Breakfast and the
other’s for the Lunch menu. There is an iterator interface which means that the classes that
hold the data structures have to be able to tell the class that uses the data:</br></br>
● If they have a next item
● What that next item is (if they have one)</br></br>
The Composite Pattern: This pattern allows you to treat a tree-like structure of a group
of objects (with sub-components or a composition) in the same way. So it allows an iterator
to traverse the tree structure (it visits each node and then any children it might have before
moving on to the next node on the same level, depth first). This allows us to use different
foods on our menus.</br></br>
The Composite Design Pattern was a pattern that made sense to do alongside the Iterator
pattern, that’s because it’s the most useful when used alongside the Iterator pattern

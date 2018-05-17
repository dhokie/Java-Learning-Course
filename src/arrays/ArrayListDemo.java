package arrays;

import java.util.ArrayList;
class ArrayListDemo {
    public static void main(String[] args) {
        //Creating a generic ArrayListDemo
        ArrayList arrayList = new ArrayList();
        //Size of arrayList
        System.out.println("Size of ArrayListDemo at creation: " + arrayList.size());
        //Lets add some elements to it
        arrayList.add("J");
        arrayList.add("O");
        arrayList.add("S");
        arrayList.add("E");

        //Recheck the size after adding elements
        System.out.println("Size of ArrayListDemo after adding elements: " + arrayList.size());

        //Display all contents of ArrayListDemo
        System.out.println("List of all elements: " + arrayList);

        //Remove some elements from the list
        arrayList.remove("J");
        System.out.println("See contents after removing one element: " + arrayList);

        //Remove element by index
        arrayList.remove(2);
        System.out.println("See contents after removing element by index: " + arrayList);

        //Check size after removing elements
        System.out.println("Size of arrayList after removing elements: " + arrayList.size());
        System.out.println("List of all elements after removing elements: " + arrayList);

        //Check if the list contains "S"
        System.out.println(arrayList.contains("S"));

        if(arrayList.contains("O")){
            System.out.println("Found a letter");
        } else {
            System.out.println("No match found");
        }

    }
}
package fourth_task.stream_42;

import fourth_task.stream_42.generics.MyArrayListGen;
import fourth_task.stream_42.generics.MyLinkedListGen;
import fourth_task.stream_42.my_implementation.MyArrayList;
import fourth_task.stream_42.my_implementation.MyBubbleSorting;
import fourth_task.stream_42.my_implementation.MyLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Work with collections and map:");
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Map<Integer, String> hashMap = new HashMap<>();

        System.out.println("Work with ArrayList:");
        arrayList.add("first element");
        arrayList.add("second element");
        arrayList.add("third element");
        System.out.println(arrayList);
        arrayList.add(0, "before first element");
        System.out.println(arrayList);
        arrayList.add("last element");
        System.out.println(arrayList);
        arrayList.add(2, "element between second and third elements");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);

        System.out.println("\nWork with LinkedList:");
        linkedList.add("first element");
        linkedList.add("second element");
        linkedList.add("third element");

        System.out.println(linkedList);
        linkedList.addFirst("before first element");
        System.out.println(linkedList);
        linkedList.addLast("last element");
        System.out.println(linkedList);
        linkedList.add(2, "element between second and third elements");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println("\nWork with HashMap:");
        hashMap.put(3, "three");
        hashMap.put(0, "zero");
        hashMap.put(2, "two");

        System.out.println(hashMap);
        hashMap.put(1, "one");
        System.out.println(hashMap);
        hashMap.remove(3);
        System.out.println(hashMap);
        System.out.println(hashMap.values());

        System.out.println("--------------------");
        System.out.println("My_implementation:\n");

        System.out.println("Checking the work of MyArrayList...");
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.add("four");
        myArrayList.add("five");
        myArrayList.add("six");
        myArrayList.add("seven");
        myArrayList.add("eight");
        myArrayList.add("nine");
        myArrayList.add("ten");
        myArrayList.add("eleven");

        System.out.println("arrayList contains: " + Arrays.toString(myArrayList.getElements()));
        System.out.println("The fourth element (for example) using method get(int index): " + myArrayList.get(4));

        myArrayList.remove(4);
        System.out.println("arrayList contains: " + Arrays.toString(myArrayList.getElements()) + " without element number 4");

        MyArrayList arrayListNumbers = new MyArrayList();
        arrayListNumbers.add("12");
        arrayListNumbers.add("13");
        arrayListNumbers.add("14");
        arrayListNumbers.add("15");
        arrayListNumbers.add("16");

        myArrayList.addAll(arrayListNumbers);
        System.out.println("arrayList contains: " + Arrays.toString(myArrayList.getElements()));

        System.out.println("\nChecking the work of MyLinkedList...");

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("This");
        myLinkedList.add("is");
        myLinkedList.add("linked");
        myLinkedList.add("list");
        myLinkedList.printAll();

        System.out.println("The first element of myLinkedList: " + myLinkedList.get(0));
        System.out.println("The third element of myLinkedList: " + myLinkedList.get(2));

        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.add("Green");
        myLinkedList1.add("Yellow");
        myLinkedList1.add("Red");
        myLinkedList1.printAll();

        myLinkedList.addAll(myLinkedList1);
        System.out.println("\nThis is addAll() method:");
        myLinkedList.printAll();

        myLinkedList.remove(2);
        System.out.println("\nThis is remove() method:");
        myLinkedList.printAll();

        System.out.println("\nChecking the work of MyBubbleSorting...");
        int[] intArray = {3, 1, 4, 5, 2};
        String[] stringArray = {"banana", "apple", "cherry", "strawberry", "cranberry"};

        System.out.println("Array int[] before sort:");
        for (int number: intArray) {
            System.out.print(number + " ");
        }

        MyBubbleSorting.bubbleSort(intArray);

        System.out.println("\nArray int[] after sort:");
        for (int number: intArray) {
            System.out.print(number + " ");
        }

        System.out.println("\nArray String[] before sort:");
        for (String string : stringArray) {
            System.out.print(string + " ");
        }

        MyBubbleSorting.bubbleSort(stringArray);

        System.out.println("\nArray String[] after sort:");
        for (String string : stringArray) {
            System.out.print(string + " ");
        }

        System.out.println("\n--------------------");
        System.out.println("Generics:");
        MyArrayListGen<Double> myArrayListGen = new MyArrayListGen<>();
        myArrayListGen.add(345d);
        myArrayListGen.add(634.0);
        myArrayListGen.add(978.5);
        System.out.println("MyArrayListGen contains these elements: " + Arrays.toString(myArrayListGen.getElements()));
        System.out.println("Second element is: " + myArrayListGen.get(1));

        MyArrayListGen<Double> myArrayListGen1 = new MyArrayListGen<>();
        myArrayListGen1.add(458D);
        myArrayListGen1.add(346.3);
        myArrayListGen1.add(354.7);

        myArrayListGen.addAll(myArrayListGen1);
        System.out.println(Arrays.toString(myArrayListGen.getElements()));

        myArrayListGen.remove(0);
        System.out.println(Arrays.toString(myArrayListGen.getElements()));

        MyLinkedListGen<Integer> myLinkedListGen = new MyLinkedListGen<>();
        myLinkedListGen.add(3245);
        myLinkedListGen.add(718);
        myLinkedListGen.add(89147);

        myLinkedListGen.printAll();
        System.out.println("First element: " +myLinkedListGen.get(0));

        MyLinkedListGen<Integer> myLinkedListGen1 = new MyLinkedListGen<>();
        myLinkedListGen1.add(9846);
        myLinkedListGen1.add(7831);
        myLinkedListGen1.add(6481);
        myLinkedListGen1.add(586);
        myLinkedListGen.addAll(myLinkedListGen1);
        myLinkedListGen.printAll();
        System.out.println("\n--- After deleting three-digit items: ");

        myLinkedListGen.remove(6);
        myLinkedListGen.remove(1);

        myLinkedListGen.printAll();

        System.out.println("\n--------------------");
    }
}

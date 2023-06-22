package algorithms;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(2);
        list.add(10);
        list.add(2);
        list.add(0);
        list.add(-3);

        list.print();

        // list.removeAll(2);
        // list.print();

        // list.swap(0, 4);
        // list.print();

        // list.sort();
        // list.print();

        list.reverse();
        list.print();

        //System.out.println(list.find(2));


    }
}

package RedBlackTree;

public class Main {
    public static void main(String[] args) {

        RedBlackTree<Integer> tree = new RedBlackTree<>();

        tree.add(6);
        tree.add(2);
        tree.add(4);
        tree.add(10);
        tree.add(3);
        tree.add(8);
        tree.add(7);

        tree.print();
    }
}
public class Main {
    public static void main(String[] args) {
        LinList list = new LinList();
        list.removeFirst();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.removeFirst();
        list.addLast(110);
        list.addLast(220);
        list.addFirst(0);
        list.removeLast();

        list.print();
        System.out.println();
        if (!list.contains(110)) {
            System.out.println("No such element");
        }
    }
}

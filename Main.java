// 1) Необходимо реализовать метод разворота связного односвязного списка 

public class Main {
    public static void main(String[] args) {
        LinList list = new LinList();
        LinList reversedList = new LinList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(110);
        list.addFirst(220);
        list.addFirst(0);

        list.print();

        System.out.println();
        reversedList = list.reversal(list);
        reversedList.print();
    }
}

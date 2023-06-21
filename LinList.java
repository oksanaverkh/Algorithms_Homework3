import org.w3c.dom.Node;

public class LinList {

    private Node head;

    public void print() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }

    private class Node {
        private int value;
        private Node next;
    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("ERROR!!");
        } else {
            head = head.next;
        }
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;

        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("ERROR!!");
        } else {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;

        }
    }

    public boolean contains(int value) {
        Node node = head;
        int index = 0;
        while (node != null) {
            if (node.value == value) {
                System.out.println("Index of the element = " + index);
                return true;
            }
            node = node.next;
            index++;

        }
        return false;
    }

    public LinList reversal(LinList list) {
        LinList reverseLinList = new LinList();
        Node node = new Node();
        node = list.head;
        while (node.next != null) {
            reverseLinList.addFirst(node.value);
            list.removeFirst();
            node = list.head;
        }
        reverseLinList.addFirst(node.value);
        return reverseLinList;
    }

}

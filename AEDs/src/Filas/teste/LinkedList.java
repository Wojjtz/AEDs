
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static LinkedList merge(LinkedList listA, LinkedList listB) {
        LinkedList mergedList = new LinkedList();
        Node currentA = listA.head;
        Node currentB = listB.head;

        while (currentA != null && currentB != null) {
            if (currentA.data < currentB.data) {
                mergedList.append(currentA.data);
                currentA = currentA.next;
            } else {
                mergedList.append(currentB.data);
                currentB = currentB.next;
            }
        }

        while (currentA != null) {
            mergedList.append(currentA.data);
            currentA = currentA.next;
        }

        while (currentB != null) {
            mergedList.append(currentB.data);
            currentB = currentB.next;
        }

        return mergedList;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList listA = new LinkedList();
        listA.append(1);
        listA.append(3);
        listA.append(5);

        LinkedList listB = new LinkedList();
        listB.append(2);
        listB.append(4);
        listB.append(6);

        System.out.println("Lista A:");
        listA.print();

        System.out.println("Lista B:");
        listB.print();

        LinkedList mergedList = merge(listA, listB);

        System.out.println("Lista Mesclada:");
        mergedList.print();
    }
}

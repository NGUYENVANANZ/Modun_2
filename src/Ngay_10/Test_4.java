package Ngay_10;

public class Test_4 {
    private Node head;
    private int numNode;
    private boolean flag;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }


    public Test_4(Object data) {
        head = new Node(data);
        numNode++;
    }

    public int getNumNode() {
        return numNode;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void addLast(Object data) {
        if (head == null)
            addFirst(data);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
            numNode++;
        }
    }

    public void remove(int index) {
        Node temp = head;
        Node hoder ;
        for (int i = 0; i < index && temp.next != null; i++) {
            hoder = temp.next;
            temp.next = hoder.next;

        }



        numNode--;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);

    }

    public int size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            } else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int q = 0;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                q = i;
                break;
            } else {
                temp = temp.next;
            }
        }
        return q;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

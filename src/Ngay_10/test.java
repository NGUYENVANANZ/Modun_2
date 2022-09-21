package Ngay_10;

public class test {
    public static void main(String[] args) {
        LinkedListNew linkedListNew = new LinkedListNew();
        linkedListNew.add("Toàn");
        linkedListNew.add("Hoàng");
        linkedListNew.add("Nam");
        linkedListNew.add("Phong");
        linkedListNew.add(1, "an");

        for (int i = 0; i < linkedListNew.getSize(); i++) {
            System.out.println(linkedListNew.get(i));

        }


//        LinkedList<String> list = new LinkedList<>();
//        list.add("Toàn");
//        list.add("Nam");
//        list.add("Phong");
//        list.add(0, "an");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }
    }
}



    class Node {
        String str;
        Node next;

        public Node(String str) {
            this.str = str;
        }
    }

    class LinkedListNew {
        private Node nodeRoot;
        private int size;

        public void add(String str) {
            if (nodeRoot == null) {
                nodeRoot = new Node(str);
            } else {
                Node temp = nodeRoot;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(str);
            }
            size++;
        }

        public int getSize(){
            return size;
        }

        public String get(int index){
            Node temp = nodeRoot;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.str;
        }

        public void add(int index, String str){
            if (nodeRoot == null) {
                nodeRoot = new Node(str);
            } else {
                Node temp = nodeRoot;
                if (index ==size){
                    temp.next = new Node(str);
                    size++;
                }
                while (temp.next != null) {
                    temp = temp.next;
                }

            }


        }
    }



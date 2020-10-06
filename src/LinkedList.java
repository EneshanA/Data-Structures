public class LinkedList{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void append(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newNode;

    }
    public void addAfter(Node curr, int data){
        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;
    }
    public void addKthAfter(int k, int data){
        Node newNode = new Node(data);
        Node tmp = head;
        for(int i = 0; i < k; i++){
            tmp = tmp.next;

        }
        newNode.next = tmp.next;
        tmp.next = newNode.next;
    }
    public void printList(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
    public void deleteKth(int k){
        Node tmp = head;
        for(int i = 1; i < k-1; i++){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }
    public void deleteNode(int data){
        Node curr = head, prev = null;
        if(curr != null && curr.data == data){
            head = curr.next;
            return;
        }
        while(curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) return;
        prev.next = curr.next;

    }

    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);
        l.deleteNode(3);
        l.printList();

    }

}
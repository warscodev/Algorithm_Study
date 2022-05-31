package dataStructure.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node{
        private Object data;
        private Node next;

        public Node(Object input){
            this.data = input;
            this.next = null;
        }

    }

    public void addFirst(Object input){
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;

        if(head.next == null){
            tail = head;
        }
    }

    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input);
        }else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node node(int index){
        Node x = head;
        for(int i=0; i < index; i++){
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input){
        if(k == 0){
            addFirst(input);
        }else {
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;

            if(newNode.next == null){
                tail = newNode;
            }
        }
    }

    @Override
    public String toString(){
        if(head == null){
            return "[]";
        }

        Node temp = head;
        StringBuilder str = new StringBuilder("[");

        while (temp.next != null){
            str.append(temp.data).append(", ");
            temp = temp.next;
        }

        str.append(temp.data);

        return str+"]";
    }

    public Object removeFirst(){

        if(head != null){
            Node temp = head;
            head = head.next;

            Object returnData = temp.data;
            temp = null;
            size--;
            return returnData;
        }

        return new IndexOutOfBoundsException();
    }

    public Object remove(int k){

        if(k > size-1){
            return new IndexOutOfBoundsException();
        }

        if(k == 0){
            removeFirst();
        }

        Node temp = node(k-1);
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        Object returnData = todoDeleted.data;

        if(todoDeleted == tail){
            tail = temp;
        }

        todoDeleted = null;
        size--;

        return returnData;
    }

    public Object removeLast(){
        return remove(size-1);
    }

    public int size(){
        return size;
    }

    public Object get(int k){
        if(k > size-1){
            return new IndexOutOfBoundsException();
        }
        Node temp = node(k);
        return temp.data;
    }

    // 값이 있다면 그 값이 발견되는 첫번째 인덱스 값을 리턴하고 값이 없다면 -1을 리턴
    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while (temp.data != data){
            temp = temp.next;
            index++;
            if(temp == null){
                return -1;
            }
        }
        return index;
    }

    public ListIterator listIterator(){
        return new ListIterator();
    }

    class ListIterator{

        private Node next;
        private Node lastReturned;
        private int nextIndex;

        ListIterator(){
            next = head;
        }

        public Object next(){
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }

        public boolean hasNext(){
            return nextIndex < size();
        }

        public void add(Object input){
            Node newNode = new Node(input);

            if(lastReturned == null){
                head = newNode;
            }else {
                lastReturned.next = newNode;
            }

            newNode.next = next;
            lastReturned = newNode;
            nextIndex++;
            size++;
        }

        public void remove(){

            if(nextIndex == 0){
                throw new IllegalStateException();
            }

            LinkedList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }






}

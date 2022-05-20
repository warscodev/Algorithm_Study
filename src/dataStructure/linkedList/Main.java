package dataStructure.linkedList;

public class Main {

    public static void main(String[] args){
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.add(1,15);

        /*System.out.println(numbers.removeFirst());
        System.out.println(numbers.remove(4));*/
        System.out.println(numbers.removeLast());
        System.out.println(numbers);
    }
}

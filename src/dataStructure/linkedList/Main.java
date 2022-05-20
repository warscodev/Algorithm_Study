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
        System.out.println("removeLast() : " + numbers.removeLast());
        System.out.println("get(2) : " + numbers.get(2));
        System.out.println("indexOf(15) : "+numbers.indexOf(1));
        System.out.println("numbers : " + numbers);
    }
}

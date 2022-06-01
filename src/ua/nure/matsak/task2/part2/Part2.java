package ua.nure.matsak.task2.part2;

public class Part2 {
    static List<String> stringList = new ListImpl<>();
    static List<Integer> integerList = new ListImpl<>();
    static List<Car> objectsList = new ListImpl<>();
    static Car car1 = new Car("VW", 192);
    static Car car2 = new Car("Lamborghini", 840);
    static Car car3 = new Car("BMW", 523);
    static Car car4 = new Car("Audi", 420);

    public static void main(String[] args) {
        AddingDemo();
        Searching();
        RemovingByObj();
        GettingFirstAndLast();
        GettingFirstAndLast();
        RemovingFirstAndLast();
    }


    //adding
    private static void AddingDemo(){
        System.out.print(String.format("%60s %n", "ADDING").replace(' ', '.'));
        stringList.addLast("FirstString");
        stringList.addLast("SecondString");
        stringList.addFirst("ThirdString");
        stringList.addFirst("FourthString");
        stringList.print();

        integerList.addLast(90);
        integerList.addLast(400);
        integerList.addFirst(12);
        integerList.addFirst(1830);
        integerList.print();

        objectsList.addLast(car1);
        objectsList.addLast(car2);
        objectsList.addFirst(car3);
        objectsList.addFirst(car4);
        integerList.print();
        System.out.println("\n");
    }

    private static void Searching(){
        System.out.print(String.format("%60s %n", "Searching FIRST, THIRD AND NOT EXISTING").replace(' ', '.'));
        System.out.print("First: ");
        System.out.print(stringList.search("FourthString") + " ");
        System.out.print("Third: ");
        System.out.print(stringList.search("FirstString") + " ");
        System.out.print("Not exists: ");
        System.out.println(stringList.search("some string hehe") + " ");

        System.out.print("First: ");
        System.out.print(integerList.search(1830) + " ");
        System.out.print("Third: ");
        System.out.print(integerList.search(90) + " ");
        System.out.print("Not exists: ");
        System.out.println(integerList.search(14840) + " ");

        System.out.print("First: ");
        System.out.print(objectsList.search(car4) + " ");
        System.out.print("Third: ");
        System.out.print(objectsList.search(car1) + " ");
        System.out.print("Not exists: ");
        System.out.println(objectsList.search(new Car("Bentley", 829)) + " ");

        System.out.println("\n");
    }

    private static void RemovingByObj(){
        System.out.print(String.format("%60s %n", "Removing FIRST AND MISSING objects").replace(' ', '.'));
        stringList.print();
        System.out.print("First: ");
        System.out.print(stringList.remove("FourthString") + " ");
        System.out.print("Not exists: ");
        System.out.println(stringList.remove("some string hehe") + " ");
        stringList.print();

        integerList.print();
        System.out.print("First: ");
        System.out.print(integerList.remove(1830) + " ");
        System.out.print("Not exists: ");
        System.out.println(integerList.remove(14840) + " ");
        integerList.print();

        objectsList.print();
        System.out.print("First: ");
        System.out.print(objectsList.remove(car4) + " ");
        System.out.print("Not exists: ");
        System.out.println(objectsList.remove(new Car("Bentley", 829)) + " ");
        objectsList.print();

        System.out.println("\n");
    }

    private static void GettingFirstAndLast(){
        System.out.print(String.format("%60s %n", "Getting FIRST AND LAST").replace(' ', '.'));
        System.out.print("First: ");
        System.out.print(stringList.getFirst() + " ");
        System.out.print("Last: ");
        System.out.println(stringList.getLast() + " ");

        System.out.print("First: ");
        System.out.print(integerList.getFirst() + " ");
        System.out.print("Last: ");
        System.out.println(integerList.getLast() + " ");

        System.out.print("First: ");
        System.out.print(objectsList.getFirst() + " ");
        System.out.print("Last: ");
        System.out.println(objectsList.getLast() + " ");

        System.out.println("\n");
    }

    private static void RemovingFirstAndLast(){
        System.out.print(String.format("%60s %n", "REMOVING FIRST AND LAST").replace(' ', '.'));
        stringList.removeFirst();
        stringList.removeLast();
        stringList.print();

        integerList.removeLast();
        integerList.removeFirst();
        integerList.print();

        objectsList.removeLast();
        objectsList.removeFirst();
        integerList.print();
        System.out.println("\n");
    }
}

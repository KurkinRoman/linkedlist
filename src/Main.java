public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Person person1 = new  Person("Hanna Montana", 26);
        Person person2 = new Person("Joe Black", 56);
        Person person3 = new Person("Freddy Krugier", 78);
        Person person4 = new Person("Matt Stryker", 30);
        list.addNode(person1);
        list.addNode(person2);
        list.addNode(person3);
        list.addNode(person4);
        list.printList();
        System.out.println();

        list.removeNode(person1);
        person2.setAge(100);
        person3.setName("Tom Hanks");
        list.printList();




    }


}
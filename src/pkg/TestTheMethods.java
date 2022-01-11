package pkg;

public class TestTheMethods {

    public static void main(String[] args) {

        //define object of type Class Method that takes two values.
        Methods m = new Methods(new TheNode(111, null));

        //used add method by object to add the item.
        m.add(new TheNode(333, null));
        m.add(new TheNode(222, null));
        m.add(new TheNode(444, null));
        m.add(new TheNode(555, null));

        //used delete method by object to delete the item.
        m.delete();

        //used display methods by object to display the items.
        m.display();

        System.out.println("_______________________________________________________________");

        //used search methods by object to search the item.
        if (m.search(111, m.head)) {
            System.out.println("The patient is found");
        } else {
            System.out.println("The patient is not found");
        }

        System.out.println("_______________________________________________________________");

        //used sort methods by object to sort the items ACS.
        m.sort();

        m.display();

        System.out.println("_______________________________________________________________");

        //used exit methods by object to exit the program.
        m.exit();

        m.display();
    }
}

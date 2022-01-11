package pkg;

//Second class : In this class, we defining the methods of linkedlist for the numbers of patients.
public class Methods {

    TheNode head;

    //define constructor with values.
    public Methods(TheNode head) {
        this.head = head;
    }

    //define method (add) : This method can add an item(patient's number) to the linkedlist.
    public void add(TheNode newNode) {
        newNode.nextpatient = head;
        head = newNode;
    }

    //define method (delete) : This method can delete an item(patient's number) of the linkedlist.
    public void delete() {
        head = head.nextpatient;
    }

    //define method (display) : This method can display an item(patient's number) or more than item of the linkedlist.
    public void display() {
        TheNode n = head;
        while (n != null) {
            System.out.println(n.patientnumber);
            n = n.nextpatient;
        }

    }

    //define method (search) : This method can search an item(patient's number) of the linkedlist.
    public boolean search(int x, TheNode head) {
        TheNode se = head;
        while (se != null) {
            if (se.patientnumber == x) {
                return true;
            } else {
                se = se.nextpatient;
            }
        }
        return false;
    }

    //define method (sort) : This method can sort an items(patient's number) of the linkedlist order by (ASC).
    public void sort() {
        TheNode s = head;
        TheNode index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (s != null) {
                index = s.nextpatient;
                while (index != null) {
                    if (s.patientnumber > index.patientnumber) {
                        temp = s.patientnumber;
                        s.patientnumber = index.patientnumber;
                        index.patientnumber = temp;

                    }
                    index = index.nextpatient;
                }
                s = s.nextpatient;
            }
        }
    }

    //define method (exit) : This method can exit of program.
    public void exit() {
        System.exit(0);
    }
}

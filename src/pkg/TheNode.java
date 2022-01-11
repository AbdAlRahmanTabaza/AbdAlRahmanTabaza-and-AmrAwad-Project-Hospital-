package pkg;
//First class : In this class, we define value and next, which are the nude.
public class TheNode {

    //define the value and the next.
    int patientnumber;
    TheNode nextpatient;

    //define constructor with values.
    public TheNode(int patientnumber, TheNode nextpatient) {
        this.patientnumber = patientnumber;
        this.nextpatient = nextpatient;
    }
}

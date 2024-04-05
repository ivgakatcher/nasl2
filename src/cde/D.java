package cde;

public class D extends C {
    public int field3;
    protected int field4;

    public int makeSum() {
        // return field1+field2+field3+field4; //нет доступа к field3
        return field1 + field3 + field4;
    }

    public D() { System.out.println("кунструктор D без параметров"); }
}

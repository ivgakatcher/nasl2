package cde;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        E e = new E();
        c.field1 = 11;
        d.field1 = 15;
        e.field1 = 17;

        d.field3 = d.field1-1;
        e.field3 = e.field1-1;

        c.setField2(300);
        d.setField2(400);
    }
}

class C{
    int field1;
    private int field2;

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public C() { System.out.println("кунструктор C без параметров"); }
}

class E extends D{
    private int field5;
    public int totalSum(){
        return field5+super.makeSum();
    }

    public int difference(){
        return field5-field4;   //есть доступ к field4, потому что это protected поле родителя
    }

    public E() { System.out.println("кунструктор E без параметров"); }
}
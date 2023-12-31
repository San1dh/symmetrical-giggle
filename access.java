// example of access of variables from Parent to Child

class ParentClass{
int a = 10;
public int b = 20;
protected int c = 30;
private int d = 40;

void showData() {
System.out.println("Inside ParentClass");
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
}
}

class ChildClass extends ParentClass{

void accessData() {
System.out.println("Inside ChildClass");
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
}

}
public class AccessModifiersExample {

public static void main(String[] args) {

ChildClass obj = new ChildClass();
obj.showData();
obj.accessData();
}
}

// o/p
//
// ./Main.java:27: error: class AccessModifiersExample is public, should be declared in a file named AccessModifiersExample.java
// public class AccessModifiersExample {
//        ^
// ./Main.java:23: error: d has private access in ParentClass
// System.out.println("d = " + d);
//                             ^
// 2 errors
// exit status 1

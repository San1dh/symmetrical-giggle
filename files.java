// uses a class & array list but don't use files

import java.io.*;
import java.util.*;;
public class Files {
    public static void main(String args[]) throws IOException
    {
        ArrayList<Employee> list = new ArrayList<Employee> ();
        //File file = new File("employees.txt");
        //FileReader fr = new FileReader(file);
        
        Employee e1 = new Employee("Arun",45,"xyz","Sales",18000);
        Employee e2 = new Employee("Swetha", 30, "abc", "HR", 48000);
        
        list.add(e1);
        list.add(e2);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Employee st = (Employee) itr.next();
            System.out.println(st.name+ " " + st.age+ " " + st.addr+ " " + st.dept+ " " + st.sal+ " " );
        }
        //fr.close();
    }
}
class Employee
{
    String name,addr,dept;
    int age,sal;
    Employee(String name, int age,String addr,String dept,int sal) {
        this.name = name;
        this.age = age;
        this.addr=addr;
        this.dept=dept;
        this.sal= sal;
    }
}

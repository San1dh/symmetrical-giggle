class Employee
{
 String name;
 int age;
 long phone;
 String address; 
 float salary;
 Employee(String nam, int a, long pho, String add, float sal)
 {
  name = nam;
  age = a;
  phone = pho;
  address = add;
  salary = sal;
 }
 void print()
 {
  System.out.println("Name: " +name);
  System.out.println("Age: " +age);
  System.out.println("Phone: " +phone);
  System.out.println("Address: " +address);
 }
 void printSalary()
 {
  System.out.println("Salary: " +salary);
 }
}

class Officer extends Employee
{
 String specialization;
 Officer(String s, String nam, int a, long pho, String add, float sal)
 {
  super(nam, a, pho, add, sal);
  specialization = s;
 }
 void print()
 {
  System.out.println("Specialization: " +specialization);
  super.print();
  printSalary();
 }
}

class Manager extends Employee
{
 String department;
 Manager(String d, String nam, int a, long pho, String add, float sal)
 {
  super(nam, a, pho, add, sal);
  department = d;
 }
 void print()
 {
  System.out.println("Department: " +department);
  super.print();
  printSalary();
 }
}

class Main 
{
 public static void main(String[] args) 
 {
  Officer o = new Officer("Researcher", "Ravi Shankar", 22,
                          9191919191l, "Soofer Lane", 90000.00f);
  Manager m = new Manager("Biology", "Bharath Srinivasan", 33,                                  9090909090l, "Memorial Street", 120000.00f);

  o.print();
  System.out.println();
  m.print();
 }
}

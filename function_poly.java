class sum
{
 sum()
 {
  int s=0;
  System.out.println("Sum= "+s);
 }
 sum(int a, int b, int c)
 {
  int s= a+b+c;
  System.out.println("Sum= "+s);
 }
 sum(int a, int b)
 {
  int s= a+b;
  System.out.println("Sum= "+s);
 }
 sum(int a)
 {
  int s= a;
  System.out.println("Sum= "+s);
 }
}

class Main
{
 public static void main(String args[])
 {
  sum s1= new sum();
  sum s2= new sum(1,2,3);
  sum s3= new sum(1,2);
  sum s4= new sum(1);
 }
}    

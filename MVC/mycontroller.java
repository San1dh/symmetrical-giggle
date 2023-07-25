import java.util.*;

class mycontroller
{
     ArrayList<mymodel> li;
 
     mycontroller()
     {
         li= new ArrayList<mymodel>();
     }
     void setdata(String user,String branch)
     {
         mymodel ref;
         mymodel m=new mymodel(user,branch);
         ref=m.getvalue();
         li.add(ref);
           
           
     }
     
     void display()
     {
         for(int i=0;i<li.size();i++)
         {
             mymodel obj=li.get(i);
             System.out.println("Name="+obj.name);
             System.out.println("Name="+obj.branch);
         }  
     }
}

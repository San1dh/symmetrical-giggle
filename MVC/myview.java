import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.util.*;

class myview extends JFrame implements ActionListener  
{  
     
    JButton b1,b2;  
    JPanel newPanel;  
    JLabel userLabel, branchLabel;  
    JTextField  textField1, textField2;  
    mycontroller c;
    //calling constructor  
    myview()  
    {     
         c=new mycontroller();
        //create label for username   
        userLabel = new JLabel();  
        userLabel.setText("Name");      //set label value for textField1  
          
        //create text field to get username from the user  
        textField1 = new JTextField(15);    //set length of the text  
  
        //create label for password  
        branchLabel = new JLabel();  
        branchLabel.setText("Branch");      //set label value for textField2  
          
        //create text field to get password from the user  
        textField2 = new JTextField(15);    //set length for the password  
          
        //create submit button  
        b1 = new JButton("SUBMIT"); //set label to button  
          b2= new JButton("DISPLAY");  
        //create panel to put form elements  
        setLayout(new FlowLayout()); 
        add(userLabel);    //set username label to panel  
        add(textField1);   //set text field to panel  
        add(branchLabel);    //set password label to panel  
        add(textField2);   //set text field to panel  
        add(b1);           //set button to panel  
        add(b2); 
        //set border to panel   
          
          
        //perform action on button click   
        b1.addActionListener(this);  
        b2.addActionListener(this);   //add action listener to button  
        setTitle("LOGIN FORM"); 
       setSize(300,300);
       setVisible(true); 
    } 

     public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
           if(ae.getSource()==b1)
          {
        String userValue = textField1.getText();        //get user entered username from the textField1  
        String branchValue = textField2.getText();  
         
         
         c.setdata(userValue,branchValue);
           }
         if(ae.getSource()==b2)
         {
             c.display();
          }
         
     }
     public static void main(String args[])
     {
             myview m=new myview();
     }
}

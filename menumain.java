import javax.swing.*;
public class menumain {
    public static void main(String[] args) {
     

        int num; 
      
        JOptionPane.showMessageDialog(null,"JUAN FOOD STORE\n*********************\n(1) Burger  Php 25.00\n(2) Coke    Php 25.00\n(3) Fries   Php 50.00\n *********************\n"); 
        

        for(int i = 1; i <=10; i++){
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your choice: "));  
        Menu j1 = new Menu(num);
        JOptionPane.showMessageDialog(null, "Display the menu\n"); 
        j1.displayinput();
        j1.displaymenu();
     
                      
     }

       

    }
}

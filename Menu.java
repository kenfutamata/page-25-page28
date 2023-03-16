import javax.swing.*;

public class Menu {
    private int num; 
    private double burger = 25.00; 
    private double coke = 25.00; 
    private double fries = 15.00; 
    
    private static double total = 0.00; 
    private double none = 0.00; 

    public Menu (int num){
        this.num=num; 
    }

    public int getNum(){
        return num; 
    }

    public void displaymenu(){
        JOptionPane.showMessageDialog(null,"JUAN FOOD STORE\n*********************\n(1) Burger  Php 25.00\n(2) Coke    Php 25.00\n(3) Fries   Php 50.00\n *********************\n"); 
    }
    public void displayinput(){
        if(getNum()==1){
       total +=burger;               
        }
        else if(getNum()==2){
            total+=coke; 
        }
        else if(getNum()==3){
            total +=fries;
        }
        else if(getNum()==3){
            total +=fries; 
        }
        else if(getNum()==0){
            JOptionPane.showMessageDialog(null, "Total cost: "+ total); 
            System.exit(0);
        }
        
    }
}

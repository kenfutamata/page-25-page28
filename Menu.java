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
            System.out.printf("Total cost: %.2f", total); 
            System.exit(0);
        }
        
    }
}

import java.util.Scanner; 
public class menumain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int num; 
      
        System.out.print("JUAN FOOD STORE\n"); 
        System.out.print("*********************\n"); 
        System.out.print("(1) Burger  Php 25.00\n");
        System.out.print("(2) Coke    Php 25.00\n");
        System.out.print("(3) Fries   Php 50.00\n");
        System.out.print("*********************\n"); 

        for(int i = 1; i <=10; i++){
        
        System.out.print("Enter your choice: "); 
        num = input.nextInt(); 
        Menu j1 = new Menu(num);
        System.out.print("Display the menu\n"); 
        j1.displayinput();
     
                      
     }

       

    }
}

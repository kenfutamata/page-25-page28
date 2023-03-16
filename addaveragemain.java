import java.util.Scanner;
public class addaveragemain {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in); 
    
            int n; 
            
            System.out.print("Enter the value of n: "); 
            n = input.nextInt(); 
            addaverage j1 = new addaverage(n); 
            j1.display();
    }
}

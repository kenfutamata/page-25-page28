import java.util.Scanner; 
public class factorialmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int n; 
        
        System.out.print("Enter the value of n: "); 
        n = input.nextInt(); 
        factorial j1 = new factorial(n); 
        j1.display();
    }
}

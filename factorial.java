public class factorial {
    private int n; 
    private int i=1;
    private  int fact = 1; 


    public factorial(int n){
        this.n = n; 
    }

    public int getN(){
        return n;
    }

    public void display(){
        while(i <=getN()){
            fact*=i;  
            i++;
        }
        System.out.printf("Factorial is %d\n", fact); 
    }

}

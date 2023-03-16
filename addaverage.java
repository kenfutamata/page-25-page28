public class addaverage{

    private int n; 
    private int i=1;
    private  int sum=0;
    private int average; 
    


    public addaverage(int n){
        this.n = n; 
    }

    public int getN(){
        return n;
    }

    public void display(){
        
        do{
            sum=sum+i; 
            average = sum/n; 
            i++; 
        }while(i <=getN()); 
        System.out.printf("The sum is %d\n", sum); 
        System.out.printf("The average is %d", average); 
    }
}
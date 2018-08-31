public class Prime{
    public static void main(String args[]){
        int num=11;
        boolean prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
        if(prime=false){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
}
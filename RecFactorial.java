class Fact{
    int fact(int n){
            int result;
            if(n==1){
                return 1;
            }
            result=fact(n-1)*n;
            return result;
        }
}

class RecFactorial{
    public static void main(String args[]){
        Fact f=new Fact();
        System.out.println("Factorial of 3 is "+f.fact(3));
        System.out.println("Factorial of 4 is "+f.fact(4));
    }
}
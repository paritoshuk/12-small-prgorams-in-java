public class Power{
    public static void main(String args[]){
        int number, power, result;
        number=3;
        power=3;
        result=1;
        for(int i=1;i<=power;i++){
            result=result*number;
        }
        System.out.println(number+" power "+power+" = "+result);
    }
}
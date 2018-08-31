public class DecToBin{
    public static void main(String args[]){
        int dec_num=7;
        int dec_num1=dec_num;
        String bin_num="";
        int rem;
        while(dec_num1>0){
            rem=dec_num1%2;
            dec_num1=dec_num1/2;
            bin_num=bin_num+rem;
        }
        System.out.println("Binary of "+dec_num+" is "+bin_num);
    }
}
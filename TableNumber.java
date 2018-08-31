public class TableNumber{
    public static void main(String args[]){
        int num=4;
        int result=0;
        for(int count=1;count<=10;count++){
            result=num*count;
            System.out.println(count+" * "+num+" = "+result);
        }
    }
}
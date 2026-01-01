public class Digits{
    public static void main(String[] args) {
        int num = 123;
        for(; num!=0; num = num/10){
            int i = num%10;
            System.out.print(i + ", ");
        }
    }
}
public class Prime{
    public static void main(String[] args) {
        int num = 11, count = 0;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count==0){
            System.out.println("The Number is Prime");
        }
        else{
            System.out.println("The Number is Not Prime");
        }
    }
}
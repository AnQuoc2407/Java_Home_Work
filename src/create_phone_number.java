import java.util.Scanner;
import java.util.Arrays;
public class create_phone_number {
    public static void main(String[] args){
        String str = "";
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<10; i++){
            array[i]=input.nextInt();
        }
        for(int i=0;i<array.length;i++)
        {
            str = str + Integer.toString(array[i]);
        }
        String output = str;
        String number = output.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");


       System.out.println("Your phone number is: "+"\""+ number+"\"");
    }
}

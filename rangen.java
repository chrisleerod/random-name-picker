import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class rangen {
    public static void main(String[] args)
    {
        String[] arr={"Devan", "Corey", "Sara", "Michael", "Alex"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);
    }
}

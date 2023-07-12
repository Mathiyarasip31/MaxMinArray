import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n =scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements of your array");
        for (int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("sum of maximum and minimum is ");
        System.out.println(calculate(n,array));
    }

    public static int calculate(int n,int array[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
            else if(min>array[i])
            {
                min=array[i];
            }
        }return max+min;
    }
}

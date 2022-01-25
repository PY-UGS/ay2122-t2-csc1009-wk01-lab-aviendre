public class Example4 
{
    //---------------------------------------
    // Prints odd number in descending order
    //---------------------------------------  
    public static void main(String[] args)
    {
        for(int x = 102; x > 66; x = x - 1)
        {
            if(x%2 != 0)
                System.out.println("Value of  x : " + x);
        }
    }  
}

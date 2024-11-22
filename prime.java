public class Prime
{
    public static void main(String[] args)
    {
        int num=3489;
        boolean isPrime=true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
            }
        }
        if(isPrime)
        {
            System.out.println(num + "prime");
        }
        else
        {
            System.out.println(num + "not prime");
        }
    }
}
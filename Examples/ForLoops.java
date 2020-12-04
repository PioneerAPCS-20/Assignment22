
public class ForLoops 
{
    public static void main(String[] args)
    {
        System.out.println(pow(2, 10));
        indicesOfGoal("Hi there hippity hoppity.", "i");
    }

    public static int pow(int a, int b)
    {
        int prod = 1;

        for(int i = 0; i < b; i++)
        {
            prod *= a;
        }

        return prod;
    }

    public static int factorial(int n)
    {
        int prod = 1;

        for(int i = 1; i <= n; i++)
        {
            prod *= i;
        }

        return prod;
    }

    public static void indicesOfGoal(String str, String goal)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.substring(i, i+1).equals(goal))
            {
                System.out.println(i);
            }
        }
    }
}

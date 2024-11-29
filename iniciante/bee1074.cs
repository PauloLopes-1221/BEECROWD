using System;

class bee1074
{

    static void Main(string[] args)
    {

        int n, i, x;

        n = Convert.ToInt32(Console.ReadLine());

        while (n > 0)
        {
            x = Convert.ToInt32(Console.ReadLine());

            if (x == 0)
            {
                Console.WriteLine("NULL");
            }
            else if (x % 2 == 0 && x < 0)
            {
                Console.WriteLine("EVEN NEGATIVE");
            }
            else if (x % 2 == 0 && x > 0)
            {
                Console.WriteLine("EVEN POSITIVE");
            }
            else if (x % 2 != 0 && x > 0)
            {
                Console.WriteLine("ODD POSITIVE");
            }
            else if (x % 2 != 0 && x < 0)
            {
                Console.WriteLine("ODD NEGATIVE");
            }

            n--;
        }
    }

}
public class problem3 {
    public int number(int x)
    {
        if(x<0)
        {
            x=x*(-1);

        }
        int d=1;


            while(x>=10)
            {
                x=x/10;
                d++;

            }

        return d;
    }
}

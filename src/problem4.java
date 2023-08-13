public class problem4 {
    public void name(String s)
    {
        char F=s.charAt(0);
        char L=s.charAt(s.length()-1);
        if(F==L)
        {System.out.println("Same");}
        else
        {
            System.out.println("Difference");
        }

    }

}

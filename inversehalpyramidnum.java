public class inversehalpyramidnum {
    public static void main(String args[])
    {
        int n = 5;
        int m = 5;
        int number=0;
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(j+" ");
                //number++;
            }
            System.out.println();
        }
    }
}


public class MultiDimensionArray {
    public static void main(String[] args)
    {
        int nums[][] = new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int random = (int)(Math.random()*10);
                nums[i][j] = random;

            }
        }

        for(int n[] : nums)
        {
            for (int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

public class ThreeDarray {
    public static void main(String[] args)
    {
        int nums[][][] = new int[3][4][5]; //3D array

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                for(int k = 0; k<nums[i][j].length; k++)
                {
                    int random = (int)(Math.random()*10);
                    nums[i][j][k] = random;
                }
            }
        }

        for(int n[][] : nums)
        {
            for (int m[] : n)
            {
                for(int p : m)
                {
                     System.out.print(p + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


public class JaggedArray 
{
    public static void main(String[] args)
    {
        int nums[][] = new int[3][]; //jagged array, the size of the arrays inside the main array is not defined.

        //so you have to specify the size of each array inside the main array.
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
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


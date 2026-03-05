import java.util.Scanner;

public class DistinctNumbers
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[10];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < 10; i++) {
		    nums[i] = input.nextInt();
		}
		int[] uniqueNums = new int[10];
		int count = 0;
		for (int i = 0; i < 10; i++) {
		    int j = 0;
		    boolean found = false;
		    while (j < uniqueNums.length) {
		        if (nums[i] == uniqueNums[j]) {
		            found = true;
		            break;
		        }
		        j++;
		    }
		    if (!found) {
		        uniqueNums[count] = nums[i];
		        count++;
		    }
		}
		for (int i = 0; i < count; i++) {
		    System.out.print(uniqueNums[i] + " ");
		}
        input.close();
	}
}

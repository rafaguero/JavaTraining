package problems.amazon;

public class GreatestCommonDenom {
    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{2,4,8,10},4));
    }

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        return result;
    }
}

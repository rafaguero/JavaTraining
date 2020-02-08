package problems;
class SumOfDigits1
{
    public static void subDigits1(long n)
    {
        long s=0;

        s=sum(n);
        System.out.println("Sum of digits "+s);
    }
    static int sum(long num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            System.out.println("sum is " + sum);
            num/=10;
            System.out.println(("num is " + num));
        }
        return sum;
    }
}
public class SumOfDigits {

    public static void main(String[] args) {
        Integer sum = 450;
        SumOfDigits1.subDigits1(450);
        sum = addDigits(sum);
        System.out.println(sum);
    }
    public static Integer addDigits(Integer number){
        String numStr = number.toString();
        Integer totSum = 0;
        char tempChar;
        for (int i = 0; i < numStr.length(); i++){
            tempChar = numStr.charAt(i);
            int tempInt = Integer.parseInt(String.valueOf(tempChar));
            System.out.println("the number is "+ tempInt);
            totSum = totSum + tempInt;
        }
        return totSum;
    }
}

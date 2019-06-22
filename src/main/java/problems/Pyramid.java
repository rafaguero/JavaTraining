package problems;

public class Pyramid {

    public static void main(String[] args) {

        int numOfRows=8;
        int rowCount=1;
        for(int i = numOfRows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=rowCount;k++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }

    }
}

package HackerRank;

public class SequenceEquation {

    static int[] permutationEquation(int[] p) {
        int len=p.length;
        int inum=0;
        int result[]=new int[len];
        for(int i=1;i<=len;i++){
            for(int j=0;j<len;j++){
                if(p[j]==i){inum=j+1;break;}
            }
            for(int j=0;j<len;j++){
                if(p[j]==inum){inum=j+1;break;}
            }
            result[i-1]=inum;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] result = {4,3,5,1,2};
        result = permutationEquation(result);
        for(int i : result){
            System.out.println(i);
        }
    }
}

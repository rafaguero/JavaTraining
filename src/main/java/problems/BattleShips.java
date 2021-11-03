package problems;

import java.util.Arrays;
import java.util.List;

public class BattleShips {
    public List<String> battleBoard = Arrays.asList(".##.#","#.#..","#...#","#.##.");
    public int rowSize = battleBoard.size();
    public int colSize = battleBoard.get(0).length();


    public int[] countShips(){
        int boatCount = 0;
        int subCount = 0;
        int destroyCount = 0;

        for (int row=0; row < rowSize; row++){
            for(int col=0; col < colSize; col++){
                if (getValue(row,col) == '#'){
                    //do I have boat
                    if (getValue(row,col-1) == '.'){
                        if (getValue(row+1,col) == '.'){
                            if (getValue(row,col+1) == '.'){
                                if (getValue(row-1,col) == '.'){
                                    boatCount++;
                                }
                            }
                        }
                    }
                    //Check for submarines
                    if (getValue(row,col+1) == '#' && getValue(row,col-1) == '.' && getValue(row,col+2) == '.'  ){
                        if (getValue(row+1,col) == '.' && getValue(row+1,col+1) == '.'){
                            if (getValue(row-1,col) == '.' && getValue(row-1,col+1) == '.'){
                                subCount++;
                            }
                        }
                    }
                    //check for destroyers horizontal
                    if (getValue(row,col+1) == '#' && getValue(row,col+2) == '#' && getValue(row,col+3) == '.' &&
                            getValue(row,col+1) == '.'){
                        if (getValue(row+1,col) == '.' && getValue(row+1,col+1) == '.' && getValue(row,col+2) == '.'){
                            if (getValue(row-1,col) == '.' && getValue(row-1,col+1) == '.' && getValue(row-1,col+2) == '.'){
                                destroyCount++;
                            }
                        }
                    }
                    //check destroyers vertically
                    if (getValue(row+1,col) == '.' && getValue(row,col+1) == '.' && getValue(row,col-1) == '.'){
                        if (getValue(row,col-1) == '.' && getValue(row,col+1) == '.'){
                            if (getValue(row-1,col-1) == '.' && getValue(row-1,col+1) == '.' ){
                                if (getValue(row-2,col-1) == '.' && getValue(row-2,col+1) == '.' && getValue(row+1,col) == '.' ){
                                    destroyCount++;
                                }
                            }
                        }
                    }
                    //check destroyer ##
                    //                #
                    if (getValue(row+1,col) == '.' && getValue(row+1,col+1) == '.' && getValue(row,col-1) == '.' && getValue(row,col+2) == '.'){
                        if (getValue(row-1,col) == '#' && getValue(row-1,col+1) == '.' && getValue(row-2,col) == '.' && getValue(row-1,col-1) == '.'){
                            destroyCount++;
                        }
                    }
                    //check destroyer ##
                    //                 #
                    if (getValue(row,col-1) == '.' && getValue(row,col+1) == '#' && getValue(row,col+2) == '.' && getValue(row+1,col) == '.'
                    && getValue(row+1,col+1) == '.'){
                        if (getValue(row+1,col) == '.' && getValue(row+1,col+1) == '#' && getValue(row+1,col+2) == '.' && getValue(row+2,col+1) == '.'){
                            destroyCount++;
                        }

                    }



                }else {
                    continue;
                }
            }
        }
        return null;
    }

    public Character getValue(int row, int col){
        if (row < rowSize || col < colSize){
            return '.';
        }
        if (row > rowSize || col > colSize){
            return '.';
        }
        return battleBoard.get(row).charAt(col);
    }
}

package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortInputData {
    class SaleData implements Comparable<SaleData> {
        String item;
        Integer numberSold;
        Integer salePrice;

        public SaleData(String item, Integer numberSold, Integer salePrice){

            this.item = item;
            this.numberSold = numberSold;
            this.salePrice = salePrice;
        }

        @Override
        public int compareTo(SaleData o) {
            if (this.numberSold == o.numberSold){
                if (this.salePrice < o.salePrice){
                    return -1;
                }else {
                    return 1;
                }
            }else if (this.numberSold < o.numberSold){
                return -1;
            }else {
                return 1;
            }

        }

        @Override
        public String toString() {
            return "SaleData{" +
                    "item='" + item + '\'' +
                    ", numberSold=" + numberSold +
                    ", salePrice=" + salePrice +
                    '}';
        }
    }

    public List<SaleData> sortSaleData(){
        SaleData itemInfo1 = new SaleData("item1",10,5);
        SaleData itemInfo2 = new SaleData("item2",15,10);
        SaleData itemInfo3 = new SaleData("item4",10,3);
        SaleData itemInfo4 = new SaleData("item5",15,7);
        List<SaleData> itemData = Arrays.asList(itemInfo1,itemInfo2,itemInfo3,itemInfo4);
        Collections.sort(itemData);
        return itemData;
    }

    public static void main(String[] args) {
        SortInputData sortInputData = new SortInputData();
        List<SaleData> saleData = sortInputData.sortSaleData();
        saleData.forEach(item -> System.out.print(item.toString()));

    }

}

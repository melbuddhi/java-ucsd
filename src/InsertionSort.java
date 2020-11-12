//This code implements Insertion Sort on the array "values"

public class InsertionSort {

    public static void main(String[] args) {
        int[] values = {78,32,2,101,23,67,91};
        sort(values);
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i] + " ");
        }
    }

    public static void sort(int[] vals){
        int currInd;

        for(int pos = 1; pos < vals.length; pos++){
            currInd = pos;

            while(currInd > 0 && vals[currInd] < vals[currInd-1]){
                swap(vals, currInd);
                currInd = currInd - 1;
            }
        }
    }

    public static void swap(int[] vals, int currInd){
        int temp = vals[currInd];
        vals[currInd] = vals[currInd-1];
        vals[currInd - 1] = temp;
    }

}
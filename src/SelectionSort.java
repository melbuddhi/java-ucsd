//This code implements Selection Sort on the array "values"

public class SelectionSort {

    public static void main(String[] args){
        int[] values = {34, 67, 12, 79, 20, 100, 34, 30, 15, 10};

        sort(values);
        for(int x = 0; x < values.length; x++){
            System.out.print((int)values[x]+" ");
        }

    }

    public static void sort(int[] v){
        for(int i = 0; i < v.length - 1; i++){
            int ind = i;
            for(int j = i + 1; j < v.length; j++){
                if(v[j] < v[ind]){
                    ind = j;
                }
            }
            swap(v, ind, i);
        }
    }

    public static void swap(int[] val, int indM, int index){
        int temp = val[indM];
        val[indM] = val[index];
        val[index] = temp;
    }
}
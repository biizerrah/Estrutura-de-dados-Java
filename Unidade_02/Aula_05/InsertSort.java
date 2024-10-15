public class InsertSort {

    public static void InsertionSort(int arr[]){

        int tamanho = arr.length;

        for(int i = 1; i < tamanho; i++){

            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args){

        int array[] = {1,5,56,40,8,10};

        for (int elemento : array) {
            System.out.print(elemento + " ");
        }

        InsertionSort(array);

        System.out.println("");

        for(int elemento : array){
            System.out.print(elemento + " ");
        }
    }
    
}

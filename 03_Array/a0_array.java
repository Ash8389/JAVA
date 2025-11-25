public class a0_array
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);

        int arr1[] = new int[5];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = (int)(Math.random()*10);
        }
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

        //-> 2D Array

        int arr2[][] = new int[3][3];

        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                arr2[i][j] = (int)(Math.random()*10);
            }
        }

        for(int m[] : arr2){
            System.out.println();
            for(int n : m){
                System.out.print(n + " ");
            }
        }

        //-> Jagged Array

        int arr3[][] = new int[3][];
        arr3[0] = new int[4];
        arr3[1] = new int[3];
        arr3[2] = new int[2];

        for(int i = 0; i<arr3.length; i++){
            for(int j = 0; j<arr3[i].length; j++){
                arr3[i][j] = (int)(Math.random()*10);
            }
        }

        for(int a[] : arr3){
            System.out.println();
            for(int b : a){
                System.out.print(b + " ");
            }
        }

    }
}
package Searching;

public class LinearSearch {
    public static int search(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int search(char[] arr,char key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int search(double[] arr,double key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int search(float[] arr,float key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int search(String[] arr,String key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key))
                return i;
        }
        return -1;
    }

    public static int[] search(int[][] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] == key)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(char[][] arr,char key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] == key)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(double[][] arr,double key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] == key)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(float[][] arr,float key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] == key)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(String[][] arr,String key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j].equals(key))
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}

public class Array {
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5,6};
        for(int i=0;i<6;i++){
            System.out.println("Element "+i+" = "+myIntArray[i]);
        }
        double[] myDoubleArray = new double[25];
        for(int i=0;i<myDoubleArray.length;i++){
            myDoubleArray[i] = i*10.0;
        }
        for(int i=0;i<myDoubleArray.length;i++){
            System.out.println("Element "+i+" = "+myDoubleArray[i]);
        }
    }
}

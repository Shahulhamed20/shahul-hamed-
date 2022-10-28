package particallyopenbook12.java;

public class Copyof {

	public static void main(String[] args) {
		int[] arr={13,44,26,78,68};
        int[] arrcopy=copyof(arr);
        System.out.println("The elements on the copied array are");
        for(int row=0;row<arrcopy.length;row++){
            System.out.println(arrcopy[row]+" ");
        }
    }

    public static int[] copyof(int[] arr){
        int[] copy=arr;
        return copy;

	}

}

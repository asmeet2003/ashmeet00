import java.util.*;
public class sum {
    public static int fun(int sum,int arr[],int i,int j){
        
        if(i>j){
            return sum;
        }
            sum=sum+arr[i]+arr[j];
            return fun(sum, arr,i+1,j-1);
        
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4};
        System.out.println(fun(0, arr, 0, arr.length-1));
    }
}

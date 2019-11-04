package InterviewPrep_HackerRank.Sorting;

import java.util.Arrays;

public class mergeSort {

    static void merge(int a[], int p, int q, int r){
        int i=p,j=q+1,k=0;
        int[] result = new int[r-p+1];
        while(i<=q && j<=r){
            if(a[i]<a[j]) {
                result[k++] = a[i++];
            }
            else {
                result[k++] = a[j++];
            }
        }
        while (i<=q){
            result[k++]=a[i++];
        }
        while(j<=r){
            result[k++]=a[j++];
        }
        for(int n=p,m=0; n<=r; n++,m++){
            a[n] = result[m];
        }
        System.out.println(Arrays.toString(a));
    }

    static void sort(int a[], int p,int r){
        if(p<r){
            int q = (p+r)/2;
            sort(a,p,q);
            sort(a,q+1,r);
            merge(a,p,q,r);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,9,3,5,8,6,1,7,0,4};
        sort(a,1,a.length-1);
    }
}

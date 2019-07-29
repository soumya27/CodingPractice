//Link: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
package HackerRank_algorithms_implementation;

public class E_PDFViewer {
    // ascii for lower case alphabets a-z =97-122
    static int designerPdfViewer(int[] h, String word) {
        int index, area=0,size = word.length(),max=-1;
        for(int i =0 ;i<size;i++)
        {
            index = (int)word.charAt(i) - 97;
            if(h[index]>max)
                max = h[index];
        }
        area= max*size;
        return area;
    }

    public static void main(String[] args) {
        int h[] = new int[]{1 ,3, 1, 3, 1 ,4, 1, 3, 2, 5, 5, 5, 5, 5, 5 ,5 ,5, 5, 5, 5 ,5 ,5 ,5 ,5 ,5 ,7};
        String word = "zaba";
        System.out.println(designerPdfViewer(h,word));
    }
}

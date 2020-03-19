package InterviewPrep_HackerRank;

import java.util.Arrays;

public class p_DFS {

   private static void flipZeros( char[][] input, int i , int j){
       if( i<0 || i>= input.length|| j<0 || j>=input[0].length || input[i][j] == 'X')
           return;
       
       input[i][j] = 'X';

       flipZeros(input, i+1,j);
       flipZeros(input, i-1,j);
       flipZeros(input, i,j+1);
       flipZeros(input, i,j-1);
   }

    public static void dfs(char[][] input){
       for (int i = 0 ; i <input.length; i++){
           for( int j =0 ; j<input[0].length;j++){
               if (input[i][j] == 'O') {
                   flipZeros(input,i,j);
               }
           }
       }
       for( char[] row : input)
           System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        char[][] input = new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        dfs(input);
    }
}

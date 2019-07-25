//Link:https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
package InterviewPrep_HackerRank.Hash_Dict;

import java.util.*;

public class RansonNote {

    static void checkMagazine(String[] magazine, String[] note) {

        Dictionary<String,Integer> magDict = new Hashtable<>();
        int m = magazine.length;
        int n = note.length;

        if(n > m ){
            System.out.println("No");
            return;
        }

        for(String word : magazine){
            if(magDict.get(word) == null){
                magDict.put(word,1);
            }
            else {
                Integer key = magDict.get(word);
                magDict.put(word, ++key);
            }
        }

        for(String word : note){
            if( magDict.get(word) == null || magDict.get(word) <= 0){
                System.out.println("No");
                return;
            }
            else{
                Integer key = magDict.get(word);
                magDict.put(word, --key);
            }
        }

        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

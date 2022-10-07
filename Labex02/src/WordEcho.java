import java.util.Scanner;

public class WordEcho {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the word:");
        String word = scan.next();

        //System.out.println(word.length());

        for(int i = 1; i < word.length(); i++ ){
            System.out.println(word);
        }


    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Word to Digit
 *
 * https://www.codeeval.com/open_challenges/104/
 *
 * @author: todyerutz@plainitricacy.wordpress.com
 */

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Tudor/IdeaProjects/Word_Digit/src/txt.txt"));
        String[] digits = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String ln;
        List<Integer> out = new ArrayList<Integer>();
        while((ln = reader.readLine())!=null){
            out.clear();
            String[] parts = ln.split(";");
            for(int i=0; i<parts.length; i++){
                System.out.print(parts[i] + ";");
                for(int j=0; j<digits.length; j++){
                    if(parts[i].equals(digits[j])){
                        out.add(j);
                    }
                }
            }
            System.out.println();
            for(int i:out){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

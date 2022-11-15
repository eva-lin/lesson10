import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        String[] words = null;
        int count =0;
        String line = "";
        File f = new File("voina i mir 1 tom.txt");
        ArrayList<String> lines = new ArrayList<>();
        Scanner scnr = new Scanner(f);
            while (scnr.hasNextLine()){
                line = scnr.nextLine();
                lines.add(line);
            }
        Pattern pattern = Pattern.compile("[Сс]трад.*");
        Matcher matcher =  pattern.matcher("");
        if (matcher.matches()){
            System.out.println("Yes");
        }

        for (String st: lines){
            words = st.split(" ");
            for (String word: words) {
                matcher = pattern.matcher(word);
                if (matcher.matches()) {
                    count++;
                }
            }
        }
        System.out.println("Найдено "+ count + " повторений в тексте");

        //Задание 3
        int[] result = new int[9];
        System.out.println("Таблица умножения");
        for (int i = 1; i <10 ; i++) {
            result = Multiplication.multiplication(i);
            System.out.println(Arrays.toString(result));
        }
    }
}
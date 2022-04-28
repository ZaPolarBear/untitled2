

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> sortstrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        FileReader fileReader = new FileReader("D:\\untitled2\\src\\main\\resources\\im.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();

        while (line != null){
            System.out.println(line);
            strings.add(line);
            line = reader.readLine();
        }
        int length = strings.size();
        SortStrings(strings, sortstrings, length, k);
        strings.add("aaa");

        FileWriter writer = new FileWriter("D:\\untitled2\\src\\main\\resources\\out.txt");
        for (int i = 0; i < length; i++){
            writer.write(strings.get(i));
            writer.write("\n");
        }
        writer.write("\n");
        length = sortstrings.size();
        for (int i = 0; i < length; i++){
            writer.write(sortstrings.get(i));
            writer.write("\n");
        }
        writer.close();
        int j = 0;

    }


    static void SortStrings (ArrayList<String> strings, ArrayList<String> sortstrings, int length, int k) {
        for (int i = 1; i < length; i += 2) {
            int j = Integer.parseInt(strings.get(i));
            if (j > k) {
                sortstrings.add(strings.get(i - 1));
                sortstrings.add(strings.get(i));
            }
        }
    }
}

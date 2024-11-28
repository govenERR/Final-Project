import java.io.*;
import java.util.Scanner;
public class GetCSV {
    //Hashtable<Float, Float> standardCurve;
    Hashtable<Float, Float> experimentalData;
    public static void main(String[] args) throws Exception {
        GetCSV test = new GetCSV();
        //Scanner fileName = new Scanner(System.in);
        //System.out.println("Submit name of standard data file");
        File standard = new File("F:\\lfhre2.csv");
        Scanner sc = new Scanner(standard);
        while (sc.hasNext()) {
            test.experimentalData.put(sc.useDelimiter(","));
        }
        System.out.println(test.experimentalData);
        sc.close();
    }

    
}

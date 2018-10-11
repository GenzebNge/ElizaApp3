package elizaApp3;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Eliza elisaObj = new Eliza();
        Random random = new Random();
         ArrayList<String> myArrayLysit = new ArrayList<>();
        String nextInput = "";
        System.out.println(elisaObj.getInitialMessage() + "\t" + elisaObj.getRepitedQuestions());
        Scanner scan = new Scanner(System.in);
        nextInput = scan.nextLine();
        while (!nextInput.equalsIgnoreCase("q")) {


            if(nextInput.equalsIgnoreCase("Q")){
                System.exit(0);
            }

            int randomIndex = random.nextInt(elisaObj.getSampleQualifier().size());
            String randomElement = elisaObj.getSampleQualifier().get(random.nextInt(elisaObj.getSampleQualifier().size()));
            System.out.println(elisaObj.getSampleQualifier().get(randomIndex) + "\t" + nextInput.replaceAll("my", "your").replaceAll("am","are").replaceAll("me", "you").replaceAll("i", "you"));

//            System.out.println(elisaObj.getSampleQualifier().get(randomIndex) + "\t" + nextInput.replaceAll("my", "your").replaceAll("am",
//                    "are").replaceAll("me", "you").replaceAll("i", "you" ));

            System.out.println(elisaObj.getRepitedQuestions());
            nextInput = scan.nextLine();

        }
    }
}

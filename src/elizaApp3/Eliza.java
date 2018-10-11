package elizaApp3;

import java.util.ArrayList;
import java.util.Random;

public class Eliza {

    private String initialMessage;
    private String userMessage;
    private String repitedQuestions;
    private String printUserMessage;


    public ArrayList<String> sampleQualifier = new ArrayList<>();



    public void setSampleHedges(ArrayList<String> sampleHedges) {
        this.sampleHedges = sampleHedges;
    }

    public ArrayList<String> sampleHedges = new ArrayList<>();


    public String getRepitedQuestions() {
        repitedQuestions ="Enter your response here or Q to quit:";
        return repitedQuestions;
    }

    public void setRepitedQuestions(String repitedQuestions) {
        this.repitedQuestions = repitedQuestions;
    }

    public String getInitialMessage() {
        initialMessage = "Good day. What is your problem?";
        return initialMessage;
    }

    public void setInitialMessage(String initialMessage) {
        this.initialMessage = initialMessage;
    }

    public ArrayList<String> getSampleQualifier() {
        sampleQualifier.add("Why do you say that");
        sampleQualifier.add("You seem to think that");
        sampleQualifier.add("So, you are concerned that");
        return sampleQualifier;
    }

    public ArrayList<String> getSampleHedges() {

        sampleHedges.add("Please tell me more");
        sampleHedges.add("Many of my patients tell me the same thing");
        sampleHedges.add("It is getting late, maybe we had better quit");
        return sampleHedges;
    }




}

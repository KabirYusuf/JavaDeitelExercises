package chapter7.Q7_40;

public class Polling{
    private final String[] topics={"Political Issues", "Global Issues", "Mental Issues", "Religious Issues", "Environmental Issues"};
    private final int[][]surveyResponses = new int[5][10];



    public void displaySurveyResult(){
            for (int j = 0; j < 5; j++) {
                System.out.print(topics[j] + ": ");
                System.out.print("| ");
                for (int k = 0; k < 10; k++) {
                    System.out.print(surveyResponses[j][k]);
                    System.out.print(" | ");
                }
                System.out.println();
            }
    }

    public int[][] getSurveyResponses(){
        return surveyResponses;
    }

    public String[] getTopics(){
        return topics;
    }
}

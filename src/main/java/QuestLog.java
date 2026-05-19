import java.util.ArrayList;
import java.util.List;

public class QuestLog {
    private List<ScoreEvent> events;

    public QuestLog() {
        events = new ArrayList<>();
    }

    public void addEvent(ScoreEvent event) {
        events.add(event);
    }

    public int getTotalScore() {
        int totalPoints = 0;
        for (ScoreEvent e : events) {
            totalPoints += e.getPoints();
        }
        return totalPoints;
    }

    public ScoreEvent getHighestScoringEvent() {
        int highScore = 0;
        ScoreEvent highEvent = null;

        for (ScoreEvent e : events) {
            if (highScore < e.getPoints()) {
                highScore = e.getPoints();
                highEvent = e;
            }
        }
        return highEvent;
    }

    public ScoreEvent getLowestScoringEvent() {
        int lowScore = Integer.MAX_VALUE;
        ScoreEvent lowEvent = null;

        for (ScoreEvent e : events) {
            if (lowScore > e.getPoints()) {
                lowScore = e.getPoints();
                lowEvent = e;
            }
        }
        return lowEvent;
    }

    public void printSummary() {
        System.out.println("""
        Quest Log
        ---------------""");
        for (ScoreEvent e : events) {
            System.out.println(e.getSummary());
        }
        System.out.println("---------------");
        System.out.println("Total Score: "+ getTotalScore());
        System.out.println("Best Event: " + getHighestScoringEvent().getSummary());
        System.out.println("Worst Event: "+ getLowestScoringEvent().getSummary());


    }

}

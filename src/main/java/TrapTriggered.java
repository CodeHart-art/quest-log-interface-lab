public class TrapTriggered implements ScoreEvent {
    private String trapName;
    private int damage;

    public TrapTriggered(String trapName, int damage) {
        this.trapName = trapName;
        this.damage = damage;
    }

    public String getName() {
        return trapName;
    }

    public int getPoints() {

        int points;
        return points = damage * -10;
    }

    public String getSummary(){
        return "Triggered " + trapName + " for " + getPoints() + " points";
    }
}

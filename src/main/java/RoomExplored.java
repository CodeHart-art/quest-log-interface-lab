public class RoomExplored implements ScoreEvent {
    private String roomName;
    private boolean secretFound;

    public RoomExplored(String roomName, boolean secretFound) {
        this.roomName = roomName;
        this.secretFound = secretFound;
    }

    public String getName() {
        return roomName;
    }

    public int getPoints() {
        int points = 20;
        if (secretFound) {
            points += 40;
        }
        return points;
    }

    public String getSummary(){
        return "Explored " + roomName + " for " + getPoints() + " points";
    }
}

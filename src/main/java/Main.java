public class Main {
    public static void main(String[] args) {

        QuestLog questLog = new QuestLog();
        ScoreEvent event1 = new MonsterDefeat("Jerry", 5, true);
        ScoreEvent m2 = new MonsterDefeat("terry", 5, false);
        ScoreEvent found1 = new TreasureFound("broken sword", "common");
        ScoreEvent found2 = new TreasureFound("The Sword", "Legendary");
        ScoreEvent r1 = new RoomExplored("Grand Library",true);
        ScoreEvent r2 = new RoomExplored("Regular Library",false);
        ScoreEvent t1 = new TrapTriggered("Caltrops", 1);
        ScoreEvent t2 = new TrapTriggered("Rune Mine",7);

        questLog.addEvent(event1);
        questLog.addEvent(m2);
        questLog.addEvent(t1);
        questLog.addEvent(t2);
        questLog.addEvent(found1);
        questLog.addEvent(found2);
        questLog.addEvent(r1);
        questLog.addEvent(r2);

        questLog.printSummary();


    }
}

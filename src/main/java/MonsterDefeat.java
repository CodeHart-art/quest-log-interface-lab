public class MonsterDefeat implements ScoreEvent {
    private String monsterName;
    private int difficultyLevel; // 1 to 5
    private boolean boss;

    public MonsterDefeat(String monsterName, int difficultyLevel, boolean boss) {
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
    }

    @Override
    public String getName() {
        return monsterName;
    }

    @Override
    public int getPoints(){
        int points = 0;
        int bossPoints = 100;


        if (boss){
            points = (difficultyLevel * 50) + 100;
        }else {
            points = difficultyLevel * 50;
        }

        return points;
    }

    @Override
    public String getSummary(){
        return "Defeated " + monsterName + " for " + getPoints()+ " points";
    }
}

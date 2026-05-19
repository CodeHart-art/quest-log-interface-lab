public class TreasureFound implements ScoreEvent {
    private String treasureName;
    private String rarity; // common, rare, or legendary

//    common = 25 points
//    rare = 75 points
//    legendary = 150 points
//    anything else = 0 points

    public TreasureFound(String treasureName, String rarity) {
        this.treasureName = treasureName;
        this.rarity = rarity;
    }

    @Override
    public String getName() {
        return treasureName;
    }

    @Override
    public int getPoints() {
        return switch (rarity.toLowerCase()) {
            case "common" -> 25;
            case "rare" -> 75;
            case "legendary" -> 150;
            default -> {
                yield 0;
            }
        };
    }

    @Override
    public String getSummary() {
        return "Found " + treasureName + " for " + getPoints() + " points";
    }
}

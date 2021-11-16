package mate.lesson.ocp.first;

public class Main {
    public static void main(String[] args) {
        FirstSportParserRealization parserRealization =
                new FirstSportParserRealization();
        SportInfo nbaInfo = parserRealization
                .parse(new String[]{"nba", "some other data"});
        SportInfo nhlInfo = parserRealization
                .parse(new String[]{"nhl", "some other data"});
        SportInfo euroInfo = parserRealization
                .parse(new String[]{"euro", "some other data"});
    }
}

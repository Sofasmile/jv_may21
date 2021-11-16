package mate.lesson.ocp.second;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, SportInfoBuilder> sportBuilders = new HashMap<>();
        sportBuilders.put("nba", new NBASportInfoBuilder());
        sportBuilders.put("nhl", new NHLSportInfoBuilder());
        sportBuilders.put("euro", new EuroSportInfoBuilder());

        SportParserRealization sportParser = new SportParserRealization(sportBuilders);
        SportInfo nbaInfo = sportParser.parse(new String[]{"nba", "some other data"});
        SportInfo nhlInfo = sportParser.parse(new String[]{"nhl", "some other data"});
    }
}

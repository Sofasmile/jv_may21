package mate.lesson.ocp.first;

public class FirstSportParserRealization {
    public SportInfo parse(String[] data) { // "nhl", "some other data"
        SportInfo result = null;
        if (data[0].equals("nba")) {
            // код для аналізу NBA
            result  = new SportInfo();
        } else if (data[0].equals("nhl")) {
            // код для аналізу NHL
            result  = new SportInfo();
        } else if (data[0].equals("euro")) {
            // код для аналізу euro
            result  = new SportInfo();
        }
        return result;
    }
}

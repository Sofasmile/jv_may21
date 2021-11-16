package mate.lesson.ocp.second;

import java.util.Map;
import java.util.stream.Stream;

public class SportParserRealization {
    private Map<String, SportInfoBuilder> builders;

    public SportParserRealization(Map<String, SportInfoBuilder> builders) {
        this.builders = builders;
    }

    public SportInfo parse(String[] data) {
         // if -else
        SportInfoBuilder builder = builders.get(data[0]);
        return builder.build(data);
    }
}

import java.io.IOException;

public class WeatherProvider {

    public interface WeatherProvider {

        WeatherData getWeather(Periods periods) throws IOException;

        WeatherData getAllFromDb() throws IOException;
    }
}

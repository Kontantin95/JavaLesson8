import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DatabaseRepository {
    boolean saveWeatherData(WeatherData weatherData) throws SQLException;
    List<WeatherData> getAllSavedData() throws IOException;
}


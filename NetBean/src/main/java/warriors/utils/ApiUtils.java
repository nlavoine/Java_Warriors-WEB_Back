package warriors.utils;

import warriors.model.GameWarriors;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

public class ApiUtils {

    public static GameWarriors convertJSONToGame(String json) {
        // TO IMPLEMENT HERE
        return null;
    }

    public static void displayJson(HttpServletResponse response, Object data) throws IOException {
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        String json = gson.toJson(data);
        out.print(json);
    }

    public static GameWarriors retrieveGameFromFile(InputStream inputStream) {
        // TO IMPLEMENT HERE
        return null;
    }
}

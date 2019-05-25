package warriors.client.web;

import warriors.engine.EngineWarriorGame;
import warriors.model.GameWarriors;
import warriors.utils.ApiUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ApiGame")
public class ApiGame extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsonInString = request.getParameter("game");
        EngineWarriorGame engineWarriorGame = new EngineWarriorGame();
        GameWarriors newGame = engineWarriorGame.launchGame(ApiUtils.convertJSONToGame(jsonInString));
        ApiUtils.displayJson(response, newGame);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApiUtils.displayJson(response, ApiUtils.retrieveGameFromFile(getServletContext().getResourceAsStream("/GameWarrior_JSON.json")));
    }
}

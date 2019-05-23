package warriors.client.web;

import warriors.engine.EngineWarriorGame;
import warriors.model.GameWarriors;
import static warriors.utils.ApiUtils.convertJSONToGame;
import static warriors.utils.ApiUtils.displayJson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static warriors.utils.ApiUtils.retrieveGameFromFile;

public class ApiGame extends HttpServlet {

    
    /**
     * GET /api/game
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // récuperation du json par le fichier 
        displayJson(response, retrieveGameFromFile(getServletContext().getResourceAsStream("/GameWarrior_JSON.json")));
    }

    /**
     * POST /api/game
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String jsonInString = request.getParameter("game");
        EngineWarriorGame engineWarriorGame = new EngineWarriorGame();
        GameWarriors newGame = engineWarriorGame.launchGame(convertJSONToGame(jsonInString));
        displayJson(response, newGame);
    }
}

package warriors.contracts;

import warriors.model.Hero;
import warriors.model.Map;
import warriors.model.GameState;

public interface IGame {

    public Map getPlateau();

    public Hero getHero();

    public GameState getGameState();
}

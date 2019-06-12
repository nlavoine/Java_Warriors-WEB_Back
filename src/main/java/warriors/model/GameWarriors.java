package warriors.model;

import warriors.contracts.IGame;


public class GameWarriors implements IGame {

    private Map map;
    private Hero hero;
    private GameState gameState;

    @Override
    public Map getPlateau() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hero getHero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GameState getGameState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

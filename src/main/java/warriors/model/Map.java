package warriors.model;

import java.util.ArrayList;
import warriors.contracts.IMap;

public class Map implements IMap {
    private String name;
    private int size;
    private ArrayList<Case> cases;

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Case> getCases() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public interface ILife {

    // Methoden zum Setzen der Ausgangssituation
    public void nukeAll();
    public void setAlive(int x, int y);
    public void setDead(int x, int y);

    // Methoden zum Abfragen der aktuellen Situation
    public boolean checkAlive(int x, int y);
    public int CellCount(int x, int y);

    // Methoden zum Fortschreiben der Generationen
    public ILife nextGeneration();

}

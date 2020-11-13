public class Life implements ILife {
  
  public static void main(String[] args) {
    Life l = new Life(new String[] {  "     ",
                                      "     ",
                                      " *** ",
                                      "     ",
                                      "     " });
    l = (Life) l.nextGeneration();
  }

  //Konstruktor
  public Life() {
    nukeAll();
    this.l(int x, int y);
  }

  public Life(String[] setup) {
    for (int y = 0; y < setup.length; y++)
      for (int x = 0; x < setup[y].length(); x++)
        if (setup[y].charAt(x) != ' ')
          setAlive(x, y);
  }


  @Override
  public void nukeAll() {
    // TODO Auto-generated method stub

  }

  @Override
  public void setAlive(int x, int y) {
    // TODO Auto-generated method stub
    this.Life(x,y);
      int count = 0;

    if ((x-1, y+1)  != ' '){
        return true; 
    } else {
        return false;
    }

    ((x-1, y)  != ' '){
        return true; 
    }

    ((x-1, y-1)  != ' '){
        return true; 
    }
    
    ((x, y+1)  != ' '){
        return true; 
    }

    ((x, y-1)  != ' '){
        return true; 
    }
    
    ((x+1, y+1)  != ' '){
        return true; 
    }

     ((x+1, y)  != ' '){
        return true; 
    }
     ((x+1, y-1)  != ' '){
        return true; 
    }

  }

  @Override
  public void setDead(int x, int y) {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean isAlive(int x, int y) {
    // TODO Auto-generated method stub
     for (int y = 0; y < setup.length(); y++)
      for (int x = 0; x < setup[y].length(); x++)
        if (setup[y].charAt(x) != ' ')
            return true;
      }
    }
   
    
  }

  @Override
  public ILife nextGeneration() {
    // TODO Auto-generated method stub

    return null;
  }
}
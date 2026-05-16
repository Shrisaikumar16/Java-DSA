public class Interfaces {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();   //this is jst an idea passed to its child class
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Room implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal - (by one step)");  
    }
}
package meciFotbal;

public class Minge {

    private int X;
    private int Y;
    private static CoordinateGenerator generator = new CoordinateGenerator();

    public Minge(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void suteaza() throws Gol, Out, Corner{
        X = generator.generateX();
        Y = generator.generateY();

        if(Y == 0 || Y == 50){
            throw new Out();
        }
        else if((X == 0 || X == 100) && (Y >= 20 && Y <= 30)){
            throw new Gol();
        }
        else if((X == 0 || X == 100) && (Y > 0 && Y < 20 || Y > 30 && Y < 50)){
            throw new Corner();
        }
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}

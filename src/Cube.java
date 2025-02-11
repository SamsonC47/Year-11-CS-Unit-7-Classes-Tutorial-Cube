public class Cube {
    private int side;

    Cube() {
        this.side = 1;
    }

    public Cube(int side) {
        this.side = side;
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
    }

    public int calculateVolume() {
        int volume = 0;
        volume = this.side * this.side * this.side;
        return volume;
    }

    public int calculateSurfaceArea() {
        int sa = 0;
        sa = this.side * this.side * 6;
        return sa;
    }
}

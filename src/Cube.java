public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = side;
    }

    public int calculateVolume() {
        return this.side * this.side * this.side;
    }

    public int calculateSurfaceArea() {
        return this.side * this.side * 6;
    }
}
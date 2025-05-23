import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CubeTester {

    @Test
    public void TestNoArgumentConstructorNoException() {
        Cube cube = new Cube();
        assertTrue(cube.getSide() == 1, "Ensure that your no argument constructor has been implemented correctly!");
    }

    @Test
    public void TestSingleArgumentConstructorNoException() {
        Cube cube = new Cube(5);
        assertTrue(cube.getSide() == 5, "Ensure that your single argument constructor has been implemented correctly!");
    }

    @Test
    public void TestSingleArgumentConstructorNegative() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> { new Cube(-1); });
    }

    @Test
    public void TestSingleArgumentConstructorZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> { new Cube(0); });
    }

    @Test
    public void TestSetter() {
        Cube cube = new Cube();
        cube.setSide(7);
        assertTrue(cube.getSide() == 7, "Ensure that your setter method has been implemented correctly!");
    }

    @Test
    public void TestSetterNegative() {
        Cube cube = new Cube();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> { cube.setSide(-1); });
    }

    @Test
    public void TestSetterZero() {
        Cube cube = new Cube();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> { cube.setSide(0); });
    }

    @Test
    public void TestVolume() {
        Cube cube = new Cube(5);
        int volume = cube.calculateVolume();
        assertTrue(volume == 125, "Ensure that your calculateVolume method has been implemented correctly!");
    }

    @Test
    public void TestVolumeTwo() {
        Cube cube = new Cube(7);
        int volume = cube.calculateVolume();
        assertTrue(volume == 343, "Ensure that your calculateVolume method has been implemented correctly!");
    }

    @Test
    public void TestSurfaceArea() {
        Cube cube = new Cube(5);
        int surfaceArea = cube.calculateSurfaceArea();
        assertTrue(surfaceArea == 150, "Ensure that your calculateSurfaceArea method has been implemented correctly!");
    }

    @Test
    public void TestSurfaceAreaTwo() {
        Cube cube = new Cube(7);
        int surfaceArea = cube.calculateSurfaceArea();
        assertTrue(surfaceArea == 294, "Ensure that your calculateSurfaceArea method has been implemented correctly!");
    }
}
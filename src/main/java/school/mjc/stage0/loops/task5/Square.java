package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            if (i == 0 || i == sideLength - 1) {
                for (int p = 0; p < sideLength; p++) {
                    System.out.print("8");
                }
                System.out.println();
            }

            if (i == sideLength - 1) break;

            if (i != 0 && i != sideLength) {
                System.out.print("8");
                for (int w = 0; w < sideLength - 2; w++) {
                    System.out.print(" ");
                }
                System.out.print("8" + "\n");
            }
        }
    }
}
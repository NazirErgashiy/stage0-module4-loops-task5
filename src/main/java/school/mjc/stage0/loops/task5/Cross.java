package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        float g = (float) sideLength / 2 + 0.5f;
        int center = (int) g-1;

        for (int i = 0; i < sideLength; i++) {

            if (i != center) {
                for (int y = 0; y < sideLength-1; y++) {
                    if (y == center) {
                        System.out.print("8");
                    }
                    System.out.print(" ");
                }
            }

            if (i == center) {
                for (int q = 0; q < sideLength; q++) {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}

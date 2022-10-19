package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int p = 0; p < length; p++) {
                    System.out.print("8");
                }
                System.out.println();
            }

            if (i == height - 1) break;

            if (i != 0 && i != height) {
                System.out.print("8");
                for (int w = 0; w < length - 2; w++) {
                    System.out.print(" ");
                }
                System.out.print("8" + "\n");
            }
        }
    }
}

package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        String symbol="8";
        int ramHeight = height;
        int center = height / 2;
        int spaces = 0;

        boolean isOverCenter = false;
        boolean isEven = false;

        if (height % 2 == 0) isEven = true;

        for (int i = 0; i < height; i++) {

            if (i == center) isOverCenter = true;

            if (!isOverCenter) {
                for (int a = 0; a < spaces; a++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < ramHeight; a++) {
                    System.out.print(symbol);
                }
                for (int a = 0; a < spaces; a++) {
                    System.out.print(" ");
                }
                System.out.println();
                ramHeight -= 2;
                spaces++;
            } else {
                if (isEven == true)
                    if (i == center) {
                        ramHeight += 2;
                        spaces--;
                    }
                for (int a = 0; a < spaces; a++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < ramHeight; a++) {
                    System.out.print(symbol);
                }
                for (int a = 0; a < spaces; a++) {
                    System.out.print(" ");
                }
                if (isEven == true) {
                    System.out.println();
                    ramHeight += 2;
                    spaces--;
                } else {
                    System.out.println();
                    ramHeight += 2;
                    spaces--;
                }
            }
        }
    }
}
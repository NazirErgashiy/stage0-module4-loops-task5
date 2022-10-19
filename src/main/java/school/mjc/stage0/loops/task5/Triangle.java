package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for (int i = 1; i < cathetusLength+1; i++) {
            System.out.print("");
            for (int g = 0; g < i; g++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

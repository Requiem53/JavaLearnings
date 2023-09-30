package SimpleDrawingWithShapes;

public class Diamond implements Shape{
    int height;

    public Diamond(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        int m = 1;
        int n;

        do {
            n = 1;

            while (++n <= height - m + 1){
                System.out.print(" ");
            }
            n = 1;

            do {
                System.out.print("`");
            }while (++n <= m * 2 - 1);

            System.out.println();
        }while (++m <= height);

        m = height - 1;

        do {
            n = 1;
            while (++n <= height - m + 1){
                System.out.print(" ");
            }

            n = 1;

            do {
                System.out.print("`");

            }while (++n <= m * 2 - 1);

            System.out.println();

        }while (--m > 0);
    }
}

package SimpleDrawingWithShapes;

public class Square implements Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        int i,j;
        for(i = 1; i <= side; i++){
            for(j = 1; j <= side; j++){
                System.out.print("` ");
            }
            System.out.print("\n");
        }
    }
}

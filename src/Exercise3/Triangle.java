package Exercise3;

public class Triangle {
    double side1;
    double side2;
    double side3;

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1,1,10);

        try {
            System.out.println(triangle1.checkSides()); //

        }catch (IllegalTriangleSideException e){
            System.out.println("Exception caught " + e.getMessage()); //new method from the

        }
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //throws = heres the exception what do you do with it
    public boolean checkSides() throws IllegalTriangleSideException{

        if(side1 + side2 < side3 || side2 + side3 < side1|| side1 + side3 < side2){
            throw new IllegalTriangleSideException("IllegalTriangleSideException!!!");
        }
        return true;
    }
}

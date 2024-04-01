package Exercise3;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2,1,3);
        Triangle triangle2 = new Triangle(5.8,8.2,3);
        Triangle triangle3 = new Triangle(20,1,90);


        try {
            System.out.println("Triangle 1: " + triangle1.checkSides());
            System.out.println("Triangle 2: " + triangle2.checkSides());
            System.out.println("Triangle 3: " + triangle3.checkSides());

        }catch (IllegalTriangleSideException e){
            System.out.println("Exception caught " + e.getMessage()); //new method from the

        }
    }
}

package seminar2.classWork;

public class task1 {
    public static void main(String[] args) {
        classVector classVector = new classVector(1, 1, 1);
        classVector classVector2 = new classVector(2, 2, 2);
        classVector result = classVector.mult(classVector2);
        System.out.println(result); 
        System.out.println(classVector.cos(classVector2) );
    }
    




    
}

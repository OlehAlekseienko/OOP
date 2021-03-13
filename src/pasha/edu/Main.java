package pasha.edu;

public class Main {
public static int getArea(int length , int width){
    return length * width;

}
    public static void main(String[] args) {
// linear programming
	int length = 2;
	int width = 3;
	int area = length * width;
        System.out.println(area);
        //imperative programming
        area = getArea(2,3);
        //OOP

    }
}

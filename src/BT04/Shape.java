package BT04;

public interface Shape {
    default double area() {
        return 0;
    }
    public static void description(){
        System.out.println("This is a shape");
    }
}

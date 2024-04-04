package ilp037.strucutural.bridge;

public class Circle extends Shape {
    public Circle(Color color){
        super(color);
    }

    @Override
    public String draw() {
        return "Draws a circle with" + color.fill();
    }
}

package core.basesyntax;

public class Square extends Figure implements AreaCalculator, FigureDrawer {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + Math.round(getArea()) + " sq. units, side: "
                + Math.round(getSide()) + " units, color: "
                + getColor();
    }
}

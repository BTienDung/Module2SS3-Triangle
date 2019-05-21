package season_4.Circle_Cylinder.Triangle;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        side1 = 1;
        side2 = 2;
        side3 = 3;
    };
    public Triangle(double side1, double side2, double side3, String color ){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    };


    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        double p = (getSide1()+getSide2()+getSide3())/2;
        double area = Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
        return area;
    }
    public double  getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }

    @Override
    public String toString(){
        return "Area is: "+getArea()
                +"\n Perimeter is: "+ getPerimeter()
                + "\n"+super.toString();
    }

}

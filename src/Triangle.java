public class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  double findArea(int a, int b, int c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public int findPerimeter(int a, int b, int c){
        return a + b + c;
    }

    @Override
    public String toString(){
        return String.format(
                "Area is: %s, Perimeter is: %s",
                findArea(a, b, c), findPerimeter(a, b, c)
        );
    }
}

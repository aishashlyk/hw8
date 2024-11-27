public class Average {
    int num1, num2, num3;

    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double getAverage() {
        return (double)(num1+num2+num3)/3;
    }

    @Override
    public String toString(){
        return String.format(
                "For %s, %s and %s the average: %.2f",
                num1, num2,num3, getAverage()
        );
    }

}

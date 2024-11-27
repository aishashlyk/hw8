public class Main {
    public static void main(String[] args) {
        //1
        Student myStudent1 = new Student(
                "Алиса", "Смит", "Коктем-2", 24
        );
        Student myStudent2 = new Student(
             "Азамат", "Мусагалиев", "Байтурсынова-45", 45
        );
        Student myStudent3 = new Student(
               "Кристина", "Агилера", "Желтоксана-77", 33
        );
        //1
        System.out.println(1);
        System.out.println(myStudent1);
        System.out.println(myStudent2);
        System.out.println(myStudent3);
        System.out.println();
        //2
        System.out.println(2);
        Triangle myTriangle = new Triangle(3,4, 5);
        System.out.println(myTriangle);
        System.out.println();
        //3
        System.out.println(3);
        Rectangle myRectangle1 = new Rectangle(5, 9);
        Rectangle myRectangle2 = new Rectangle(10, 14);
        System.out.println(myRectangle1);
        System.out.println(myRectangle2);
        System.out.println();
        //4
        System.out.println(4);
        Average avg = new Average(5,6,7);
        System.out.println(avg);
        System.out.println();
        //5.2
        System.out.println(5.2);
        Movie myMovie1 = new Movie(
                "Фокус", "RatPac-Dune Entertainment", "R"
        );
        System.out.println(myMovie1);
        //5.3
        System.out.println(5.3);
        Movie myMovie2 = new Movie("Главный герой","20th Century Studios"
        );
        System.out.println(myMovie2);


    }
}

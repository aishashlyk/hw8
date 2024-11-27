public class Student {
    String name;
    String surname;
    String address;
    int id;

    public Student(
            String name, String surname, String address, int id
    ) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format(
                "Имя: %s, Фамилия: %s, Адрес: %s, Id: %s",
                name, surname, address, id
        );
    }
}

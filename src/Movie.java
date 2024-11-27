public class Movie {
    String title;
    String studio;
    String rating;
    //5.1
    public Movie(
            String title, String studio, String rating
    ) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    //5.2
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    @Override
    public String toString(){
        return String.format(
                "Movie: %s, studio: %s, rating: %s",
                title, studio, rating
        );
    }
}


//Create a movie rating system

package Encapsulation;

class Movie {
    private String title;
    private double rating;

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10)
            this.rating = rating;
        else
            System.out.println("Invalid rating!");
    }

    public double getRating() { return rating; }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }
}

public class Rating_Movie {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.setTitle("Inception");
        m.setRating(9.0);
        System.out.println(m.getTitle() + " Rating: " + m.getRating());
    }
}

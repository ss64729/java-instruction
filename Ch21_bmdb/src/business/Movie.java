package business;

public class Movie {
private  int movieid;
private String title;
private String rating;
private int year;
private String director;
public Movie() {
	super();
}
public Movie(int movieid, String title, String rating, int year, String director) {
	super();
	this.movieid = movieid;
	this.title = title;
	this.rating = rating;
	this.year = year;
	this.director = director;
}

public Movie(String title, String rating, int year, String director) {
	super();
	this.title = title;
	this.rating = rating;
	this.year = year;
	this.director = director;
}

public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
@Override
public String toString() {
	return "Movie [movieid=" + movieid + ", title=" + title + ", rating=" + rating + ", year=" + year + ", director="
			+ director + "]";
}

}






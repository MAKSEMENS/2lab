package test;

public class Session {
    private Movie movie;
    private int[] date = new int[3];
    private int[] time = new int[3];
    private int count_of_sold;

    public Movie GetMovie() {
        return movie;
    }
    public void SetMovie(Movie newMovie) {
        movie = newMovie;
    }
    public int[] GetSessionDate() {
        return date;
    }
    public void SetSessionDate(int[] newDate) {
        date[0] = newDate[0];
        date[1] = newDate[1];
        date[2] = newDate[2];
    }
    public int[] GetSessionTime() {
        return time;
    }
    public void SetSessionTime(int[] newTime) {
        time = newTime;
    }
    public int GetCount_Sold() {
        return count_of_sold;
    }
    public void SetCount_Sold(int newCount_Sold) {
        count_of_sold = newCount_Sold;
    }

}
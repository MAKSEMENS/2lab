package test;

import javax.persistence.*;

@Entity
@Table(name = "cinema.movies")
public class Movie {
    private int movieId;
    private String title;
    /* private String genre;
    private int year;
    private String director;*/

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int GetMovieId(){
        return movieId;
    }
    private void SetMovieId (int id){
        movieId = id;
    }

    @Column(name="movie_name")
    public String GetTitle(){
        return title;
    }
    public void SetTitle(String tit) {
        title = tit;
    }
   /* public void SetTitle(String newTitle){
        title = newTitle;
    }

    @Column(name="movie_year")
    public int GetYear(){
        return year;
    }
    public void SetYear(int newYear){
        year = newYear;
    }

    @Column(name="movie_genre")
    public String GetGenre(){
        return genre;
    }
    public void SetGenre(String newGenre){
        genre = newGenre;
    }
    @Column(name="movie_director")
    public String GetDirector(){
        return director;
    }
    public void SetDirector(String newDirector){
        director = newDirector;
    } */


}
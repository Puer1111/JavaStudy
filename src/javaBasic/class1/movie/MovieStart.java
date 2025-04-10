package javaBasic.class1.movie;

import java.util.Scanner;

public class MovieStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie1 = new Movie();
        movie1.title = "배테랑2";
        movie1.review = sc.next();  // Scanner 로 각색 해봤음.

        Movie movie2 = new Movie();
        movie2.title="서울의 봄";
        movie2.review = sc.next();

        Movie[] movies = {movie1,movie2};
        for(Movie movieDescription: movies){
            System.out.println("영화 제목: " + movieDescription.title + " 영화 리뷰 : " + movieDescription.review.trim());
        }
    }
}

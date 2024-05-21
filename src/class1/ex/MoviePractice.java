package class1.ex;

public class MoviePractice {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "범죄도시4";
        movieReview1.review = "너무 재미있어요!";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "그녀는 죽었다.";
        movieReview2.review = "스릴이 넘쳐요.";

        MovieReview[] movieReviews = {movieReview1, movieReview2};
        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: "+ m.title + " / 영화 리뷰 내용: "+ m.review);
        }
    }
}

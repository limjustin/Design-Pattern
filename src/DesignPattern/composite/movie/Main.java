package DesignPattern.composite.movie;

public class Main {
    public static void main(String[] args) {
        // 라이브러리 생성
        System.out.println("***** 라이브러리 생성하고 영화 추가 *****");
        MovieLibrary library = new MovieLibrary("MyLibrary");

        Movie movie1 = new Movie("Movie1", 2013, 8000, "4K");
        Movie movie2 = new Movie("Movie2", 2015, 9572, "4K");
        Movie movie3 = new Movie("Movie3", 2018, 4116, "4K");

        library.insert(movie1);
        library.insert(movie2);
        library.insert(movie3);

        System.out.println("***** 시리즈 생성해서 라이브러리에 추가 *****");
        MovieSeries movieSeries = new MovieSeries("Awesome Movie Series", 2021, 30);

        Movie awesomeMovie1 = new Movie("Awesome Movie 1", 2013, 10000, "HD");
        Movie awesomeMovie2 = new Movie("Awesome Movie 2", 2015, 1500, "HD");
        Movie awesomeMovie3 = new Movie("Awesome Movie 3", 2018, 1443, "HD");
        Movie awesomeMovie4 = new Movie("Awesome Movie 4", 2021, 2641, "HD");
        Movie awesomeMovieNew1 = new Movie("Awesome Movie 1", 2013, 9166, "HD");

        movieSeries.add(awesomeMovie1);
        movieSeries.add(awesomeMovie2);
        movieSeries.add(awesomeMovie3);
        movieSeries.add(awesomeMovie4);
        movieSeries.add(awesomeMovieNew1);
        movieSeries.printPriceInfo();

        System.out.println("***** 시리즈의 세 번째 영화가 Awesome Movie 3 인지 확인 *****");
        System.out.println("세 번째 영화 제목: " + movieSeries.getMovie(3).getTitle() + ", 제작 년도: " + movieSeries.getMovie(3).getYear());

        System.out.println("***** 시리즈에서 세 번째 영화 삭제 *****");
        movieSeries.remove(awesomeMovie3);

        System.out.println("***** 시리즈에 있는 영화 목록 출력 *****");
        movieSeries.list();

        System.out.println("***** 라이브러리에 영화 시리즈 추가 *****");
        library.insert(movieSeries);

        System.out.println("***** 라이브러리에 없는 영화 삭제 *****");
        Movie movieNew = new Movie("New Movie", 1984, 9000, "HD");
        library.delete(movieNew);

        System.out.println("***** 라이브러리에 있는 영화 삭제 *****");
        library.delete(movie1);

        System.out.println("***** 라이브러리 내용 출력해보기 *****");
        library.printLibrary();
    }
}

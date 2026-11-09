public class Movie {
    //global variables
    private String movieName;
    private double rating;
    private int numRatings;
    private int revenue;

  //constructors
  public Movie(){
    Movie = "Avengers";
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;

  }

  public Movie(String MovieName, double Rating, int NumRating, int Revenue){
    movieName = MovieName;
    rating = Rating;
    numRatings = NumRating;
    revenue = Revenue

  }

  public void movieToString(){
    System.out.println("Movie:" + movieName);
    System.out.println("Rating:" + rating);
    System.out.println("Number of Ratings:" + numRatings);
    System.out.println("Revenue:" + revenue);

  }

  public String getMoiveName(){
    return movieName;
  }

  public int getRevenue(){
    return revenue;
  }

  public void addRating(double r){
    double prevTotal = rating * numRatings;
    double total = prevTotal + r
    numRatings++;
    rating = total / numRatings;
  
  }

  public boolean compareRatings(Movie x){
    if(rating > x.getRating()){
      return true;
    }
    return false;
  
}

public String revenueToString(){
  int rev = revenue;

   while(rev >= 0){
    int three = rev % 1000;
    ans = "," + three + ans;
    rev = rev / 1000;
   }
   ans = rev + ans;
   return ans;
}

 public Movie pirateMovie(){
  Movie temp = new Movie(name, rating, numRatings, revenue)
  //all returning the whole object
  return temp;

  return new Movie(name, rating, numRatings, revenue)

  return this;
}

}

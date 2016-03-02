
/**
 * Create a Newspaper with the following information:
 * 
 * Title of the paper, publisher, genre and number of releases a year
 * 
 * Contains methods to return any of the above information.
 * 
 * @author Vegard Fjørtoft og Morten Solli
 * @version 1.0.0
 */
public class Newspaper
{
    // instance variables - replace the example below with your own
    private int numberOfIssue;
    private String title;
    private String publisher;
    private String genre;
    private double price;
    private double defaultPrice;

    /**
     * Constructor for objects of class Newspaper
     * 
     * @param String: title of paper, String: publisher of paper, int: how many releases a year, String: genre
     * of the paper
     */
    public Newspaper(String title, String publisher, int issueNumber, String genre)
    {
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.numberOfIssue = issueNumber;
        this.defaultPrice = 19.99;
        this.price = defaultPrice;
    }

    /**
     * Method that returns the number of releases a year this paper has
     * 
     * @return int: number of releases a year
     */
    public int getIssueNumber()
    {
        return this.numberOfIssue;
    }

    /**
     * Method that returns the title of the paper
     * 
     * @return String: title of the paper
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Method that returns the publisher of the paper
     * 
     * @return String: publisher of the paper
     */
    public String getPublisher()
    {
        return this.publisher;
    }

    /**
     * Method that returns the genre of the paper
     *
     * @return String: genre of the paper
     */
    public String getGenre()
    {
        return this.genre;
    }

    /**
     * Method that sets the price of the paper
     *
     * @param  double: price of the paper
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * Method that returns the price of the paper
     *
     * @return  double: price of the paper
     */
    public double getPrice()
    {
        return price;
    }
}

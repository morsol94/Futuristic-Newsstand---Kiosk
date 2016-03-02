import java.util.HashMap;

/**
 * This class shall register the newspapers created by the Newspaper class.
 * It can add new newspapers, remove them, display all the papers in store, search for all the papers
 * written by a specific publisher and search for a specific paper by its title and publisher.
 * 
 * 
 * 
 * @author Ole Martin Hanstveit and Oscar Kise.
 * @version 2015.12.02
 */

public class NewsRegister
{

    private HashMap<String,Newspaper> newsCollection;

    /**
     * Creates a hashmap for collecting the newspapers.
     */
    public NewsRegister()
    {
        newsCollection = new HashMap<>();

    }

    /**
     * This method adds a newspaper to the collection, fill in details.
     *
     * 
     * @param String: name adds a titlename to the paper. String: publisher adds a publisher name to the paper.
     * int: issueNumber adds the number of issue of the paper. String: genre adds the type of genre.
     */

    public void addNewspaper(String name, String publisher, int issueNumber, String genre)
    {
        Newspaper newspaper = new Newspaper(name, publisher, issueNumber, genre);
        newsCollection.put(newspaper.getTitle(),newspaper);
    }

    /**
     * Removes a newspaper, type in the title of the paper you wish to remove.
     * 
     * @param String: newspaperToBeRemoved will find a matching key in the newsCollection hashMap
     * and remove the object.
     */
    public void removeNewspaper(String newspaperToBeRemoved)
    {
        newsCollection.remove(newspaperToBeRemoved);
    }
    
     /**
     * Method that sets the price of the paper
     *
     * @param String: tirle of the paper.  double: price of the paper.
     */
    public void selectPrice(String title ,double price)
    {
         Newspaper paper = newsCollection.get(title);
         paper.setPrice(price);
         
    }

    /**
     * This displays the entire collection of newspapers with their information.
     */
    public void displayCollection()
    {
        if(newsCollection.isEmpty())
        {
            System.out.println("There is no newspaper in the collection!");
        }
        else
        {
            for(String key : newsCollection.keySet())
            {
                System.out.println("Title: " + key + " , publisher: " + newsCollection.get(key).getPublisher()
                    + " , issue: " + newsCollection.get(key).getIssueNumber() + " , genre: " + newsCollection.get(key).getGenre() + " , price: "
                    + newsCollection.get(key).getPrice());
            }
        }
    }

    /**
     * Search for a specific newspaper by typing the title and publisher of the newspaper.
     * Remember to type in the exact correct title and publisher name.
     * 
     * @param String: titleSearch checks the stored titles in the hashMap collection against the 
     * title we're searching for. String: publisherSearch does the same, but for the publisher name.
     */
    public void searchForNewspaper(String titleSearch, String publisherSearch)
    {
        Newspaper valueOfTitle = newsCollection.get(titleSearch);

        
        if(newsCollection.containsValue(valueOfTitle) && valueOfTitle.getPublisher() == publisherSearch)
        {
            System.out.println("Newspaper found! Title: "+ titleSearch + " , publisher: " + valueOfTitle.getPublisher()
                + " , issue: " + valueOfTitle.getIssueNumber() + " , genre: " + valueOfTitle.getGenre() + " , price: "
                + valueOfTitle.getPrice());
        }
        else
        {
            System.out.println("Error, newspaper not found!");
        }

    }
    
    /**
     * When searching for publisher, display all that is published by that publisher.
     * 
     * @param String: publisherSearch compares the typed publisher parameter to all the
     * publishers stored in newsCollection.
     */
    public void searchAllFromPublisher(String publisherSearch)
    {
        for(String key : newsCollection.keySet())
        {
            if(newsCollection.get(key).getPublisher() == publisherSearch)
            {
                System.out.println("Match found! "+ newsCollection.get(key).getPublisher() +" has written: "+ newsCollection.get(key).getTitle());
            }
        }
    }
}

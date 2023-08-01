import java.util.*;

class Item{
    private int id,year;
    private String title;
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    Item(int id,String title,int year){
        this.id=id;
        this.title=title;
        this.year=year;
    }
    double calculateOverdueAmount(int days){
        return 0;
    }
}
class Book extends Item{
    String author,genre;
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    Book(int id,String title,int year,String author,String genre)
{
        super(id,title,year);
        this.author=author;
        this.genre=genre;
    }
    double calculateOverdueAmount(int days)
    {
        return 0.5*days;
    }
}
class Magazine extends Item{
    String publisher;
    int issueNumber;
    public int getIssueNumber() {
        return issueNumber;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    double calculateOverdueAmount(int days){
        return 0.25*days;
    }
    Magazine(int id,String title,int year,String publisher,int issueNumber){
        super(id,title,year);
        this.publisher=publisher;
        this.issueNumber=issueNumber;
    }
}
public class Lab_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book(512,"Sunnabella",2023,"Dhaval Malsattar", "Horrer");
        System.out.println("Book Name is "+b1.getTitle());
        System.out.println("Book genre is "+b1.getGenre());
        System.out.println("Book Overdue Amount is "+b1.calculateOverdueAmount(30));
        Magazine m1 = new Magazine(215,"DVS",2023,"Dhaval Malsattar",14253);
        System.out.println("Magazine issue number is is "+m1.getIssueNumber());
        System.out.println("Magazine Overdue Amount is "+m1.calculateOverdueAmount(30));

    }
}

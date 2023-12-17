package OOP_WEEK_7.TASK2;

public record Book(String title, String author, int publishYear, boolean availability ) {


    public String toString(){
        return "Title: " + this.title + "\nAuthor:" + this.author + "\nPublished: " + publishYear + "\nAvailability: " + availability;
    }
}

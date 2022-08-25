package quotes;

public class Quotes {
    public String author;
    public String text;

    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }
    public String toString(){
        return "The author, " + author + ", once said, \"" + text + "\"";
    }
}

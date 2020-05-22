public class Periodical {
    private String title, article, author, date;

    public Periodical(String title, String article, String author, String date) {
        this.title = title;
        this.article = article;
        this.author = author;
        this.date = date;
    }

        //Getters
    public String getTitle() {
        return title;
    }

    public String getArticle() {
        return article;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

         //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.getTitle() + this.getArticle() + " by " + this.getAuthor() + " published " + this.date;
    }

}

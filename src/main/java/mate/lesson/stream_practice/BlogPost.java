package mate.lesson.stream_practice;

class BlogPost {
    String title;
    String author;
    String type;
    int likes;

    public BlogPost(String title, String author, String type, int likes) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "BlogPost{"
                + "title='" + title + '\''
                + ", author='" + author + '\''
                + ", type='" + type + '\''
                + ", likes=" + likes
                + '}';
    }
}
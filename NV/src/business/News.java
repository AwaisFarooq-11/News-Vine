package src.business;
import src.technical.*;
public class News {

    private int news_id;
    private String title;
    private String content;
    private String news_category;
    private String imageURL;
    private String videoURL;
    private int rating;


    public News(int newsid, String title, String  content,String newscategory, String imageURL, String videoURL, int rating) {
        this.news_id = newsid;
        this.title = title;
        this.content = content;
        this.news_category = newscategory;
        this.imageURL = imageURL;
        this.videoURL = videoURL;
        this.rating = rating;
    }
    public News(int newsid,String title, String  content,
    String newscategory, String imageURL, String videoURL) {
        this.news_id = newsid;
        this.title = title;
        this.content = content;
        this.news_category = newscategory;
        this.imageURL = imageURL;
        this.videoURL = videoURL;
       
    }

    // Getters for News properties
    public int getNewsId() { return news_id; }
    public String getContent(){return content;}
    public String getTitle() { return title; }
    public String getNewsCategory() { return news_category; }
    public String getImageURL() { return imageURL; }
    public String getVideoURL() { return videoURL; }
    public int getRating() { return rating; }

    public String postNews(Integer news_id,String title, String content, String category, String imageURL, String videoURL) {
        News news = new News(news_id,title, content,category, imageURL,videoURL); // Create a new News object
        NewsHandler newsHandler = new NewsHandler();
        
        boolean success = newsHandler.addNews(news);
        if (success) {
            return "Posted Successfully!";
        } else {
            return "Failed to post news.";
        }
    }
}









//Final Form





// package src.business;

// public class News {

//     private int newsId;
//     private String title;
//     private String content;
//     private String newsCategory;
//     private String imageURL;
//     private String videoURL;
//     private String comment;

//     public News(int newsId, String title, String content, String newsCategory, String imageURL, String videoURL) {
//         this.newsId = newsId;
//         this.title = title;
//         this.content = content;
//         this.newsCategory = newsCategory;
//         this.imageURL = imageURL;
//         this.videoURL = videoURL;
//     }

//     public int getNewsId() {
//         return newsId;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getContent() {
//         return content;
//     }

//     public String getNewsCategory() {
//         return newsCategory;
//     }

//     public String getImageURL() {
//         return imageURL;
//     }

//     public String getVideoURL() {
//         return videoURL;
//     }

//     public String getComment() {
//         return comment;
//     }

//     public void setComment(String comment) {
//         this.comment = comment;
//     }
// }


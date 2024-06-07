// package src.controllers;
// import javax.swing.*;

// import src.business.News;
// import src.technical.NewsHandler;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// public class NewsControllerView extends JFrame {

    
//         public boolean addnews(String NewsId,String title, String content, String category, String imageURL, String videoURL) {
//             Integer news_id=Integer.parseInt(NewsId);
//             News news = new News(news_id,title,content,category,imageURL,videoURL);
//             String  Message=news.postNews(news_id,title, content, category, imageURL, videoURL);
//             if(Message=="Posted Successfully!")
//         return true;
//         else
//        return false;
//         }


//         // public boolean editnews(Integer postId, String newTitle, String newContent, String newCategory, String newImageURL, String newVideoURL) {
//         //     NewsHandler newsHandler = new NewsHandler();
//         //     return newsHandler.updateNews(postId, newTitle, newContent, newCategory, newImageURL, newVideoURL);
//         // }

//         public boolean editNewsURLs(int postId, String newImageURL, String newVideoURL) {
//             NewsHandler handler = new NewsHandler();
//             return handler.updateNewsURLs(postId, newImageURL, newVideoURL);
//         }
    


//         public boolean deletenews(String newsId) {
//             NewsHandler newsHandler = new NewsHandler();
//             return newsHandler.deleteNews(newsId);
//         }


     
//         /**
//          * @return
//          */
//         public List<News> getAllNews() {
//             var newsHandler = new NewsHandler();
//             return newsHandler.getAllNews();
//         }
        
//     }





     









package src.controllers;

import src.business.News;
import src.technical.NewsHandler;

import javax.swing.*;
import java.util.List;

public class NewsControllerView {

    private NewsHandler newsHandler;

    public NewsControllerView() {
        this.newsHandler = new NewsHandler();
    }

    public boolean addnews(String NewsId, String title, String content, String category, String imageURL, String videoURL) {
        try {
            int newsId = Integer.parseInt(NewsId);
            News news = new News(newsId, title, content, category, imageURL, videoURL);
            return newsHandler.addNews(news);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid News ID format.");
            return false;
        }
    }

    public boolean editNews(int postId, String newTitle, String newContent, String newCategory, String newImageURL, String newVideoURL) {
        // Create a News object with the updated information
        News updatedNews = new News(postId, newTitle, newContent, newCategory, newImageURL, newVideoURL);
        
        // Pass the complete News object to the news handler's updateNews method
        return newsHandler.updateNews(updatedNews);
    }
    

    // public boolean editNews(int postId, String newImageURL, String newVideoURL) {
    //     return newsHandler.updateNews(postId, newImageURL, newVideoURL);
    // }

    public boolean deletenews(String newsId) {
        try {
            int id = Integer.parseInt(newsId);
            return newsHandler.deleteNews(id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid News ID format.");
            return false;
        }
    }

    public List<News> getAllNews() {
        return newsHandler.getAllNews();
    }
}

package src.technical;
import src.business.News;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewsHandler {

    public boolean addNews(News news) {
        String insertSQL = "INSERT INTO news (news_id, title, news_category, content, imageURL, videoURL) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            pstmt.setInt(1, news.getNewsId());
            pstmt.setString(2, news.getTitle());
            pstmt.setString(3, news.getNewsCategory());
            pstmt.setString(4, news.getContent());
            pstmt.setString(5, news.getImageURL());
            pstmt.setString(6, news.getVideoURL());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteNews(int newsId) {
        String query = "DELETE FROM news WHERE news_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, newsId);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateNews(News news) {
        String query = "UPDATE news SET title = ?, content = ?, news_category = ?, imageURL = ?, videoURL = ? WHERE news_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, news.getTitle());
            statement.setString(2, news.getContent());
            statement.setString(3, news.getNewsCategory());
            statement.setString(4, news.getImageURL());
            statement.setString(5, news.getVideoURL());
            statement.setInt(6, news.getNewsId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateNews(News news) {
        String query = "UPDATE news SET title = ?, content = ?, category = ?, imageURL = ?, videoURL = ? WHERE news_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, news.getTitle());
            statement.setString(2, news.getContent());
            statement.setString(3, news.getNewsCategory());
            statement.setString(4, news.getImageURL());
            statement.setString(5, news.getVideoURL());
            statement.setInt(6, news.getNewsId()); // Assuming getNewsId() returns the news ID
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    

    public List<News> getAllNews() {
        String query = "SELECT * FROM news";
        List<News> newsList = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int newsId = resultSet.getInt("news_id");
                String title = resultSet.getString("title");
                String content = resultSet.getString("content");
                String category = resultSet.getString("news_category");
                String imageURL = resultSet.getString("imageURL");
                String videoURL = resultSet.getString("videoURL");

                News news = new News(newsId, title, content, category, imageURL, videoURL);
                newsList.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newsList;
    }
}

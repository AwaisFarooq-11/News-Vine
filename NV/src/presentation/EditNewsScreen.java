// package src.presentation;
// import javax.swing.*;

// import src.controllers.NewsControllerView;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class EditNewsScreen extends JFrame {

//     private JTextField postIdField, titleField, contentField, categoryField, imageURLField, videoURLField;
//     private JButton editButton;

//     public EditNewsScreen() {
//         setTitle("Edit News");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(7, 2));

//         JLabel postIdLabel = new JLabel("Post ID:");
//         postIdField = new JTextField();
//         add(postIdLabel);
//         add(postIdField);

//         JLabel titleLabel = new JLabel("New Title:");
//         titleField = new JTextField();
//         add(titleLabel);
//         add(titleField);

//         JLabel contentLabel = new JLabel("New Content:");
//         contentField = new JTextField();
//         add(contentLabel);
//         add(contentField);

//         JLabel categoryLabel = new JLabel("New Category:");
//         categoryField = new JTextField();
//         add(categoryLabel);
//         add(categoryField);

//         JLabel imageURLLabel = new JLabel("New Image URL:");
//         imageURLField = new JTextField();
//         add(imageURLLabel);
//         add(imageURLField);

//         JLabel videoURLLabel = new JLabel("New Video URL:");
//         videoURLField = new JTextField();
//         add(videoURLLabel);
//         add(videoURLField);

//         editButton = new JButton("Edit");
//         editButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 int postId = Integer.parseInt(postIdField.getText());
//                 String title = titleField.getText();
//                 String content = contentField.getText();
//                 String category = categoryField.getText();
//                 String imageURL = imageURLField.getText();
//                 String videoURL = videoURLField.getText();

//                 NewsControllerView newsController = new NewsControllerView();
//                 boolean success = newsController.editnews(postId, title, content, category, imageURL, videoURL);
//                 if (success) {
//                     JOptionPane.showMessageDialog(EditNewsScreen.this, "News edited successfully!");
//                 } else {
//                     JOptionPane.showMessageDialog(EditNewsScreen.this, "Failed to edit news.");
//                 }
//             }
//         });
//         add(editButton);

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new EditNewsScreen();
//             }
//         });
//     }
// }










package src.presentation;

import javax.swing.*;
import src.controllers.NewsControllerView;
import src.business.News;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditNewsScreen extends JFrame {
    private JTextField titleField, contentField, categoryField, imageURLField, videoURLField;
    private JButton saveButton, backButton;
    private News news;
    public EditNewsScreen(JFrame previousScreen, News news) {
        this.news = news;

        setTitle("Edit News");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField(news.getTitle());
        add(titleLabel);
        add(titleField);

        JLabel contentLabel = new JLabel("Content:");
        contentField = new JTextField(news.getContent());
        add(contentLabel);
        add(contentField);

        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField(news.getNewsCategory());
        add(categoryLabel);
        add(categoryField);

        JLabel imageURLLabel = new JLabel("Image URL:");
        imageURLField = new JTextField(news.getImageURL());
        add(imageURLLabel);
        add(imageURLField);

        JLabel videoURLLabel = new JLabel("Video URL:");
        videoURLField = new JTextField(news.getVideoURL());
        add(videoURLLabel);
        add(videoURLField);

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewsControllerView newsController = new NewsControllerView();
                boolean success = newsController.editNews(
                        news.getNewsId(),
                        titleField.getText(),
                        contentField.getText(),
                        categoryField.getText(),
                        imageURLField.getText(),
                        videoURLField.getText()
                );

                if (success) {
                    
                    JOptionPane.showMessageDialog(EditNewsScreen.this, "News updated successfully!");
                    previousScreen.setVisible(true);
                //previousScreen.refreshUI();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(EditNewsScreen.this, "Failed to update news!");
                }
            }
        });
        add(saveButton);

        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousScreen.setVisible(true);
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }

    public EditNewsScreen() {
        //TODO Auto-generated constructor stub
    }
}













// package src.presentation;

// import javax.swing.*;
// import src.controllers.NewsControllerView;
// import src.technical.NewsHandler;
// import src.business.News;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.List;

// public class EditNewsScreen extends JFrame {

//     private JTextField newsIdField, titleField, contentField, categoryField, imageURLField, videoURLField;
//     private JButton editButton, backButton, loadButton;
//     private NewsControllerView newsController;
//     private JFrame previousScreen;

//     public EditNewsScreen(JFrame previousScreen) {
//         this.previousScreen = previousScreen;
//         this.newsController = new NewsControllerView();

//         setTitle("Edit News");
//         setSize(400, 400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(8, 2));

//         JLabel newsIdLabel = new JLabel("News Id:");
//         newsIdField = new JTextField();
//         add(newsIdLabel);
//         add(newsIdField);

//         JLabel titleLabel = new JLabel("Title:");
//         titleField = new JTextField();
//         add(titleLabel);
//         add(titleField);

//         JLabel contentLabel = new JLabel("Content:");
//         contentField = new JTextField();
//         add(contentLabel);
//         add(contentField);

//         JLabel categoryLabel = new JLabel("Category:");
//         categoryField = new JTextField();
//         add(categoryLabel);
//         add(categoryField);

//         JLabel imageURLLabel = new JLabel("Image URL:");
//         imageURLField = new JTextField();
//         add(imageURLLabel);
//         add(imageURLField);

//         JLabel videoURLLabel = new JLabel("Video URL:");
//         videoURLField = new JTextField();
//         add(videoURLLabel);
//         add(videoURLField);

//         loadButton = new JButton("Load News");
//         loadButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 loadNews();
//             }
//         });
//         add(loadButton);

//         editButton = new JButton("Edit");
//         editButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 editNews();
//             }
//         });
//         add(editButton);

//         backButton = new JButton("Back");
//         backButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 previousScreen.setVisible(true);
//                 dispose();
//             }
//         });
//         add(backButton);

//         setVisible(true);
//     }

//     private void loadNews() {
//         int newsId = Integer.parseInt(newsIdField.getText());
//         NewsHandler newsHandler = new NewsHandler();
//         News news = newsHandler.getNewsById(newsId);

//         if (news != null) {
//             titleField.setText(news.getTitle());
//             contentField.setText(news.getContent());
//             categoryField.setText(news.getNewsCategory());
//             imageURLField.setText(news.getImageURL());
//             videoURLField.setText(news.getVideoURL());
//         } else {
//             JOptionPane.showMessageDialog(this, "News not found!");
//         }
//     }

//     private void editNews() {
//         try {
//             int newsId = Integer.parseInt(newsIdField.getText());
//             boolean success = newsController.editNews(
//                 newsId,
//                 titleField.getText(),
//                 contentField.getText(),
//                 categoryField.getText(),
//                 imageURLField.getText(),
//                 videoURLField.getText()
//             );

//             if (success) {
//                 JOptionPane.showMessageDialog(this, "News edited successfully!");
//             } else {
//                 JOptionPane.showMessageDialog(this, "Failed to edit news!");
//             }
//         } catch (Exception ex) {
//             ex.printStackTrace();
//             JOptionPane.showMessageDialog(this, "An error occurred while editing news!");
//         }
//     }
// }






//Final Form



// package src.presentation;

// import javax.swing.*;
// import src.controllers.NewsControllerView;
// import src.technical.NewsHandler;
// import src.business.News;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class EditNewsScreen extends JFrame {

//     private JTextField newsIdField, titleField, contentField, categoryField, imageURLField, videoURLField;
//     private JButton editButton, backButton, loadButton;
//     private NewsControllerView newsController;
//     private JFrame previousScreen;

//     public EditNewsScreen(JFrame previousScreen) {
//         this.previousScreen = previousScreen;
//         this.newsController = new NewsControllerView();

//         setTitle("Edit News");
//         setSize(500, 400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridBagLayout());

//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.fill = GridBagConstraints.HORIZONTAL;
//         gbc.insets = new Insets(10, 10, 10, 10);

//         JLabel newsIdLabel = new JLabel("News Id:");
//         newsIdField = new JTextField();
//         gbc.gridx = 0; gbc.gridy = 0;
//         add(newsIdLabel, gbc);
//         gbc.gridx = 1; gbc.gridy = 0;
//         add(newsIdField, gbc);

//         JLabel titleLabel = new JLabel("Title:");
//         titleField = new JTextField();
//         gbc.gridx = 0; gbc.gridy = 1;
//         add(titleLabel, gbc);
//         gbc.gridx = 1; gbc.gridy = 1;
//         add(titleField, gbc);

//         JLabel contentLabel = new JLabel("Content:");
//         contentField = new JTextField();
//         gbc.gridx = 0; gbc.gridy = 2;
//         add(contentLabel, gbc);
//         gbc.gridx = 1; gbc.gridy = 2;
//         add(contentField, gbc);

//         JLabel categoryLabel = new JLabel("Category:");
//         categoryField = new JTextField();
//         gbc.gridx = 0; gbc.gridy = 3;
//         add(categoryLabel, gbc);
//         gbc.gridx = 1; gbc.gridy = 3;
//         add(categoryField, gbc);

//         JLabel imageURLLabel = new JLabel("Image URL:");
//         imageURLField = new JTextField();
//         gbc.gridx = 0; gbc.gridy = 4;
//         add(imageURLLabel, gbc);
//         gbc.gridx = 1; gbc.gridy = 4;
//         add(imageURLField, gbc);

//         JLabel videoURLLabel = new JLabel("Video URL:");
//         videoURLField = new JTextField();
//         gbc.gridx = 0; gbc.gridy = 5;
//         add(videoURLLabel, gbc);
//         gbc.gridx = 1; gbc.gridy = 5;
//         add(videoURLField, gbc);

//         loadButton = new JButton("Load News");
//         loadButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 loadNews();
//             }
//         });
//         gbc.gridx = 1; gbc.gridy = 6;
//         add(loadButton, gbc);

//         editButton = new JButton("Edit");
//         editButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 if (validateFields()) {
//                     editNews();
//                 }
//             }
//         });
//         gbc.gridx = 1; gbc.gridy = 7;
//         add(editButton, gbc);

//         backButton = new JButton("Back");
//         backButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 previousScreen.setVisible(true);
//                 dispose();
//             }
//         });
//         gbc.gridx = 0; gbc.gridy = 7;
//         add(backButton, gbc);

//         setVisible(true);
//     }

//     private void loadNews() {
//         try {
//             int newsId = Integer.parseInt(newsIdField.getText());
//             NewsHandler newsHandler = new NewsHandler();
//             News news = newsHandler.getNewsById(newsId);

//             if (news != null) {
//                 titleField.setText(news.getTitle());
//                 contentField.setText(news.getContent());
//                 categoryField.setText(news.getNewsCategory());
//                 imageURLField.setText(news.getImageURL());
//                 videoURLField.setText(news.getVideoURL());
//             } else {
//                 JOptionPane.showMessageDialog(this, "News not found!");
//             }
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(this, "Invalid news ID format!");
//         }
//     }

//     private void editNews() {
//         try {
//             int newsId = Integer.parseInt(newsIdField.getText());
//             boolean success = newsController.editNews(
//                 newsId,
//                 titleField.getText(),
//                 contentField.getText(),
//                 categoryField.getText(),
//                 imageURLField.getText(),
//                 videoURLField.getText()
//             );

//             if (success) {
//                 JOptionPane.showMessageDialog(this, "News edited successfully!");
//             } else {
//                 JOptionPane.showMessageDialog(this, "Failed to edit news!");
//             }
//         } catch (Exception ex) {
//             ex.printStackTrace();
//             JOptionPane.showMessageDialog(this, "An error occurred while editing news!");
//         }
//     }

//     private boolean validateFields() {
//         if (titleField.getText().trim().isEmpty() || contentField.getText().trim().isEmpty() ||
//             categoryField.getText().trim().isEmpty() || imageURLField.getText().trim().isEmpty() ||
//             videoURLField.getText().trim().isEmpty()) {
//             JOptionPane.showMessageDialog(this, "All fields must be filled out!");
//             return false;
//         }
//         return true;
//     }
// }






// package src.presentation;

// import javax.swing.*;

// import src.controllers.NewsControllerView;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.Random;

// public class PostingNewsScreen extends JFrame {

//     private JTextField NewsIdField,titleField, contentField, categoryField, imageURLField, videoURLField;
//     private JButton postButton;

//     public PostingNewsScreen() {
//         setTitle("Post News");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(6, 2));

//         JLabel NewsIdLabel = new JLabel("News Id:");
//         NewsIdField = new JTextField(Integer.toString(new Random().nextInt(9000) + 1000));
//         add(NewsIdLabel);
//         add(NewsIdField);
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

//         postButton = new JButton("Post");
//         postButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 NewsControllerView newsController = new NewsControllerView();
//                 try {
//                     boolean successMessage =newsController.addnews(
//                         NewsIdField.getText(),
//                             titleField.getText(),
//                             contentField.getText(),
//                             categoryField.getText(),
//                             imageURLField.getText(),
//                             videoURLField.getText()
//                     );

//                     if (successMessage) {
//                         JOptionPane.showMessageDialog(PostingNewsScreen.this, "News posted successfully!");
//                     } else {
//                         JOptionPane.showMessageDialog(PostingNewsScreen.this, "Failed to post news!");
//                     }
//                 } catch (Exception ex) {
//                     ex.printStackTrace();
//                     JOptionPane.showMessageDialog(PostingNewsScreen.this, "An error occurred while posting news!");
//                 }
//             }
//         });
//         add(postButton);

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new PostingNewsScreen();
//             }
//         });
//     }
// }


// package src.presentation;

// import javax.swing.*;
// import src.controllers.NewsControllerView;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.Random;

// public class PostingNewsScreen extends JFrame {

//     private JTextField newsIdField, titleField, contentField, categoryField, imageURLField, videoURLField;
//     private JButton postButton, backButton;
//     private JFrame previousScreen;

//     public PostingNewsScreen(JFrame previousScreen) {
//         this.previousScreen = previousScreen;
//         setTitle("Post News");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(7, 2)); // 7 rows for an additional back button

//         JLabel newsIdLabel = new JLabel("News Id:");
//         newsIdField = new JTextField(Integer.toString(new Random().nextInt(9000) + 1000));
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

//         postButton = new JButton("Post");
//         postButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 NewsControllerView newsController = new NewsControllerView();
//                 try {
//                     boolean successMessage = newsController.addnews(
//                         newsIdField.getText(),
//                         titleField.getText(),
//                         contentField.getText(),
//                         categoryField.getText(),
//                         imageURLField.getText(),
//                         videoURLField.getText()
//                     );

//                     if (successMessage) {
//                         JOptionPane.showMessageDialog(PostingNewsScreen.this, "News posted successfully!");
//                     } else {
//                         JOptionPane.showMessageDialog(PostingNewsScreen.this, "Failed to post news!");
//                     }
//                 } catch (Exception ex) {
//                     ex.printStackTrace();
//                     JOptionPane.showMessageDialog(PostingNewsScreen.this, "An error occurred while posting news!");
//                 }
//             }
//         });
//         add(postButton);

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
// }









package src.presentation;

import javax.swing.*;
import src.controllers.NewsControllerView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PostingNewsScreen extends JFrame {

    private JTextField newsIdField, titleField, contentField, categoryField, imageURLField, videoURLField;
    private JButton postButton, backButton;
    private JFrame previousScreen;

    public PostingNewsScreen(JFrame previousScreen) {
        this.previousScreen = previousScreen;
        setTitle("Post News");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2)); // 8 rows for additional validation messages

        JLabel newsIdLabel = new JLabel("News Id:");
        newsIdField = new JTextField(Integer.toString(new Random().nextInt(9000) + 1000));
        newsIdField.setEditable(false);
        add(newsIdLabel);
        add(newsIdField);

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        add(titleLabel);
        add(titleField);

        JLabel contentLabel = new JLabel("Content:");
        contentField = new JTextField();
        add(contentLabel);
        add(contentField);

        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField();
        add(categoryLabel);
        add(categoryField);

        JLabel imageURLLabel = new JLabel("Image URL:");
        imageURLField = new JTextField();
        add(imageURLLabel);
        add(imageURLField);

        JLabel videoURLLabel = new JLabel("Video URL:");
        videoURLField = new JTextField();
        add(videoURLLabel);
        add(videoURLField);

        postButton = new JButton("Post");
        postButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateFields()) {
                    NewsControllerView newsController = new NewsControllerView();
                    try {
                        boolean successMessage = newsController.addnews(
                            newsIdField.getText(),
                            titleField.getText(),
                            contentField.getText(),
                            categoryField.getText(),
                            imageURLField.getText(),
                            videoURLField.getText()
                        );

                        if (successMessage) {
                            JOptionPane.showMessageDialog(PostingNewsScreen.this, "News posted successfully!");
                            clearFields();
                        } else {
                            JOptionPane.showMessageDialog(PostingNewsScreen.this, "Failed to post news!");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(PostingNewsScreen.this, "An error occurred while posting news!");
                    }
                }
            }
        });
        add(postButton);

        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenuScreen   previousScreen=new MainMenuScreen();
                previousScreen.setVisible(true);
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }

    private boolean validateFields() {
        if (titleField.getText().isEmpty() || contentField.getText().isEmpty() || categoryField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Title, Content, and Category are required fields!");
            return false;
        }
        return true;
    }

    private void clearFields() {
        titleField.setText("");
        contentField.setText("");
        categoryField.setText("");
        imageURLField.setText("");
        videoURLField.setText("");
    }
}











package src.presentation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditCommentScreen extends JFrame {

    private JTextField commentIdField, newCommentField;
    private JButton editButton;

    public EditCommentScreen() {
        setTitle("Edit Comment");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        JLabel commentIdLabel = new JLabel("Comment ID:");
        commentIdField = new JTextField();
        add(commentIdLabel);
        add(commentIdField);

        JLabel newCommentLabel = new JLabel("New Comment:");
        newCommentField = new JTextField();
        add(newCommentLabel);
        add(newCommentField);

        editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int commentId = Integer.parseInt(commentIdField.getText());
                String newComment = newCommentField.getText();

                // You can call the appropriate method from the News class here
                // For simplicity, I'll just display a message
                JOptionPane.showMessageDialog(EditCommentScreen.this, "Comment edited successfully!");
            }
        });
        add(editButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditCommentScreen();
            }
        });
    }
}




// final form







// package src.presentation;

// import javax.swing.*;
// import src.controllers.NewsControllerView;
// import src.business.News;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class EditCommentScreen extends JFrame {

//     private JTextField newsIdField, commentField;
//     private JButton editButton, backButton, loadButton;
//     private NewsControllerView newsController;
//     private JFrame previousScreen;

//     public EditCommentScreen(JFrame previousScreen) {
//         this.previousScreen = previousScreen;
//         this.newsController = new NewsControllerView();

//         setTitle("Edit Comments");
//         setSize(400, 300);
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

//         JLabel commentLabel = new JLabel("Comment:");
//         commentField = new JTextField();
//         gbc.gridx = 0; gbc.gridy = 1;
//         add(commentLabel, gbc);
//         gbc.gridx = 1; gbc.gridy = 1;
//         add(commentField, gbc);

//         loadButton = new JButton("Load Comment");
//         loadButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 loadComment();
//             }
//         });
//         gbc.gridx = 1; gbc.gridy = 2;
//         add(loadButton, gbc);

//         editButton = new JButton("Edit");
//         editButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 editComment();
//             }
//         });
//         gbc.gridx = 1; gbc.gridy = 3;
//         add(editButton, gbc);

//         backButton = new JButton("Back");
//         backButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 previousScreen.setVisible(true);
//                 dispose();
//             }
//         });
//         gbc.gridx = 0; gbc.gridy = 3;
//         add(backButton, gbc);

//         setVisible(true);
//     }

//     private void loadComment() {
//         try {
//             int newsId = Integer.parseInt(newsIdField.getText());
//             News news = newsController.getNewsById(newsId);

//             if (news != null) {
//                 // Assuming the news object has a method to get the comment. Adjust this according to your actual implementation.
//                 commentField.setText(news.getComment());
//             } else {
//                 JOptionPane.showMessageDialog(this, "News not found!");
//             }
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(this, "Invalid news ID format!");
//         }
//     }

//     private void editComment() {
//         try {
//             int newsId = Integer.parseInt(newsIdField.getText());
//             String comment = commentField.getText();

//             // Assuming the news object has a method to set the comment. Adjust this according to your actual implementation.
//             News news = newsController.getNewsById(newsId);
//             if (news != null) {
//                 news.setComment(comment);
//                 newsController.editNews(news.getNewsId(), news.getTitle(), news.getContent(), news.getNewsCategory(), news.getImageURL(), news.getVideoURL());
//                 JOptionPane.showMessageDialog(this, "Comment edited successfully!");
//             } else {
//                 JOptionPane.showMessageDialog(this, "Failed to edit comment!");
//             }
//         } catch (Exception ex) {
//             ex.printStackTrace();
//             JOptionPane.showMessageDialog(this, "An error occurred while editing comment!");
//         }
//     }
// }





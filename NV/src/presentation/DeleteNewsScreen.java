

package src.presentation;

import javax.swing.*;
import src.controllers.NewsControllerView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteNewsScreen extends JFrame {

    private JTextField postIdField;
    private JButton deleteButton;

    public DeleteNewsScreen() {
        setTitle("Delete News");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        JLabel postIdLabel = new JLabel("Post ID:");
        postIdField = new JTextField();
        add(postIdLabel);
        add(postIdField);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String postId = postIdField.getText();
                NewsControllerView newsController = new NewsControllerView();
                boolean success = newsController.deletenews(postId);
                if (success) {
                    JOptionPane.showMessageDialog(DeleteNewsScreen.this, "News deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(DeleteNewsScreen.this, "Failed to delete news.");
                }
            }
        });
        add(new JLabel()); // Empty label for grid layout
        add(deleteButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeleteNewsScreen();
            }
        });
    }
}




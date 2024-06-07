package src.presentation;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import src.controllers.NewsControllerView;
import src.business.News;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DisplayNewsScreen extends JFrame {
    private JButton backButton;
    private JPanel newsPanel;
    private JFrame previousScreen;
    private Timer timer;
    


    public DisplayNewsScreen(JFrame previousScreen) {
        this.previousScreen = previousScreen;
        setTitle("Display News");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        newsPanel = new JPanel();
        JButton Refresh = new JButton("Refresh");
        Refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshUI(); // Call the refreshUI() method when Refresh button is clicked
            }
        });
        newsPanel.add(Refresh);
        newsPanel.setLayout(new BoxLayout(newsPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(newsPanel);
        add(scrollPane, BorderLayout.CENTER);

        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             MainMenuScreen   previousScreen=new MainMenuScreen();
                previousScreen.setVisible(true);
                dispose();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(backButton);
        add(buttonPanel, BorderLayout.SOUTH);
    
        loadNews();

        setVisible(true);
        
    }
    
    public void refreshUI() {
        // Clear existing news entries
        newsEntryPanel.removeAll();
        //newsPanel.removeAll();
    
        // Reload and display updated news
        loadNews();
    
        // Repaint the panel to reflect the changes
        newsPanel.revalidate();
        newsPanel.repaint();
    }
    
    

    private void loadNews() {
        NewsControllerView newsController = new NewsControllerView();
        List<News> newsList = newsController.getAllNews();

        for (News news : newsList) {
            JPanel newsEntryPanel = new JPanel();
            newsEntryPanel.setLayout(new BorderLayout());
            newsEntryPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JTextArea newsContent = new JTextArea();
            newsContent.setText("News ID: " + news.getNewsId() + "\n"
                    + "Title: " + news.getTitle() + "\n"
                    + "Content: " + news.getContent() + "\n"
                    + "Category: " + news.getNewsCategory() + "\n"
                    + "Image URL: " + news.getImageURL() + "\n"
                    + "Video URL: " + news.getVideoURL() + "\n"
                    + "------------------------------------------------------------");
            //JButton Refresh = new JButton("Refresh");
        
            newsContent.setEditable(false);

            JPanel buttonPanel = new JPanel();
            JButton deleteButton = new JButton("Delete");
            JButton editButton = new JButton("Edit");
            
            

            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this news?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                    if (confirmation == JOptionPane.YES_OPTION) {
                        boolean success = newsController.deletenews(String.valueOf(news.getNewsId()));
                        if (success) {
                            JOptionPane.showMessageDialog(DisplayNewsScreen.this, "News deleted successfully!");
                            newsPanel.remove(newsEntryPanel);
                            newsPanel.revalidate();
                            newsPanel.repaint();
                        } else {
                            JOptionPane.showMessageDialog(DisplayNewsScreen.this, "Failed to delete news!");
                        }
                    }
                }
            });

            editButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new EditNewsScreen(DisplayNewsScreen.this, news);
                    setVisible(false);

                }
            });
            
            buttonPanel.add(editButton);
            buttonPanel.add(deleteButton);
            newsEntryPanel.add(newsContent, BorderLayout.CENTER);
            
            newsEntryPanel.add(buttonPanel, BorderLayout.SOUTH);

            newsPanel.add(newsEntryPanel);
            
        }
        
    }
}


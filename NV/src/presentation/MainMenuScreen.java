




// package src.presentation;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MainMenuScreen extends JFrame {

//     private JButton postNewsButton;
//     private JButton deleteNewsButton;
//     private JButton editNewsButton;
//     private JButton displayNewsButton;

//     public MainMenuScreen() {
//         setTitle("News Management Dashboard");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Header panel
//         JPanel headerPanel = new JPanel();
//         headerPanel.setBackground(new Color(70, 130, 180));
//         JLabel headerLabel = new JLabel("News Management Dashboard");
//         headerLabel.setForeground(Color.WHITE);
//         headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
//         headerPanel.add(headerLabel);
//         add(headerPanel, BorderLayout.NORTH);

//         // Buttons panel
//         JPanel buttonsPanel = new JPanel(new GridBagLayout());
//         buttonsPanel.setBackground(new Color(245, 245, 245));
//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.insets = new Insets(10, 10, 10, 10);

//         postNewsButton = createButton("Post News", "icons/post.png");
//         postNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new PostingNewsScreen();
//                 dispose();
//             }
//         });
//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         buttonsPanel.add(postNewsButton, gbc);

//         deleteNewsButton = createButton("Delete News", "icons/delete.png");
//         deleteNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DeleteNewsScreen();
//                 dispose();
//             }
//         });
//         gbc.gridy = 1;
//         buttonsPanel.add(deleteNewsButton, gbc);

//         editNewsButton = createButton("Edit News", "icons/edit.png");
//         editNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new EditNewsScreen();
//                 dispose();
//             }
//         });
//         gbc.gridy = 2;
//         buttonsPanel.add(editNewsButton, gbc);

//         displayNewsButton = createButton("Display News", "icons/display.png");
//         displayNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DisplayNewsScreen(null);
//                 dispose();
//             }
//         });
//         gbc.gridy = 3;
//         buttonsPanel.add(displayNewsButton, gbc);

//         add(buttonsPanel, BorderLayout.CENTER);

//         // Footer panel
//         JPanel footerPanel = new JPanel();
//         footerPanel.setBackground(new Color(70, 130, 180));
//         JLabel footerLabel = new JLabel("© 2024 News Management System");
//         footerLabel.setForeground(Color.WHITE);
//         footerPanel.add(footerLabel);
//         add(footerPanel, BorderLayout.SOUTH);

//         setVisible(true);
//     }

//     private JButton createButton(String text, String iconPath) {
//         JButton button = new JButton(text);
//         button.setFont(new Font("Arial", Font.PLAIN, 18));
//         button.setIcon(new ImageIcon(iconPath));
//         button.setPreferredSize(new Dimension(250, 50));
//         button.setFocusPainted(false);
//         button.setBackground(Color.WHITE);
//         button.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));
//         button.setToolTipText(text);
//         return button;
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new MainMenuScreen();
//             }
//         });
//     }
// }











// package src.presentation;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MainMenuScreen extends JFrame {

//     private JButton postNewsButton;
//     private JButton deleteNewsButton;
//     private JButton editNewsButton;
//     private JButton displayNewsButton;

//     public MainMenuScreen() {
//         setTitle("News Management Dashboard");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         // Header panel
//         JPanel headerPanel = new JPanel();
//         headerPanel.setBackground(new Color(70, 130, 180));
//         JLabel headerLabel = new JLabel("News Management Dashboard");
//         headerLabel.setForeground(Color.WHITE);
//         headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
//         headerPanel.add(headerLabel);
//         add(headerPanel, BorderLayout.NORTH);

//         // Buttons panel
//         JPanel buttonsPanel = new JPanel(new GridBagLayout());
//         buttonsPanel.setBackground(new Color(245, 245, 245));
//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.insets = new Insets(10, 10, 10, 10);

//         postNewsButton = createButton("Post News", "icons/post.png");
//         postNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new PostingNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         buttonsPanel.add(postNewsButton, gbc);

//         deleteNewsButton = createButton("Delete News", "icons/delete.png");
//         deleteNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DeleteNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridy = 1;
//         buttonsPanel.add(deleteNewsButton, gbc);

//         editNewsButton = createButton("Edit News", "icons/edit.png");
//         editNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new EditNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridy = 2;
//         buttonsPanel.add(editNewsButton, gbc);

//         displayNewsButton = createButton("Display News", "icons/display.png");
//         displayNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DisplayNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridy = 3;
//         buttonsPanel.add(displayNewsButton, gbc);

//         add(buttonsPanel, BorderLayout.CENTER);

//         // Footer panel
//         JPanel footerPanel = new JPanel();
//         footerPanel.setBackground(new Color(70, 130, 180));
//         JLabel footerLabel = new JLabel("© 2024 News Management System");
//         footerLabel.setForeground(Color.WHITE);
//         footerPanel.add(footerLabel);
//         add(footerPanel, BorderLayout.SOUTH);

//         setVisible(true);
//     }

//     private JButton createButton(String text, String iconPath) {
//         JButton button = new JButton(text);
//         button.setFont(new Font("Arial", Font.PLAIN, 18));
//         button.setIcon(new ImageIcon(iconPath));
//         button.setPreferredSize(new Dimension(250, 50));
//         button.setFocusPainted(false);
//         button.setBackground(Color.WHITE);
//         button.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));
//         button.setToolTipText(text);
//         return button;
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new MainMenuScreen();
//             }
//         });
//     }
// }





// package src.presentation;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MainMenuScreen extends JFrame {

//     private JButton postNewsButton;
//     private JButton deleteNewsButton;
//     private JButton editNewsButton;
//     private JButton displayNewsButton;

//     public MainMenuScreen() {
//         setTitle("Main Menu");
//         setSize(300, 250);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(4, 1));

//         postNewsButton = new JButton("Post News");
//         postNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new PostingNewsScreen(MainMenuScreen.this);
//                 dispose();
//             }
//         });
//         add(postNewsButton);

//         deleteNewsButton = new JButton("Delete News");
//         deleteNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DeleteNewsScreen(MainMenuScreen.this);
//                 dispose();
//             }
//         });
//         add(deleteNewsButton);

//         editNewsButton = new JButton("Edit News");
//         editNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new EditNewsScreen(MainMenuScreen.this);
//                 dispose();
//             }
//         });
//         add(editNewsButton);

//         displayNewsButton = new JButton("Display News");
//         displayNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DisplayNewsScreen(MainMenuScreen.this);
//                 dispose();
//             }
//         });
//         add(displayNewsButton);

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new MainMenuScreen();
//             }
//         });
//     }
// }



//Final Form



// package src.presentation;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MainMenuScreen extends JFrame {

//     private JButton postNewsButton;
//     private JButton deleteNewsButton;
//     private JButton editNewsButton;
//     private JButton displayNewsButton;

//     public MainMenuScreen() {
//         setTitle("Main Menu");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridBagLayout());

//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.fill = GridBagConstraints.HORIZONTAL;
//         gbc.insets = new Insets(10, 10, 10, 10);

//         postNewsButton = new JButton("Post News");
//         postNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new PostingNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridx = 0; gbc.gridy = 0;
//         add(postNewsButton, gbc);

//         deleteNewsButton = new JButton("Delete News");
//         deleteNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DeleteNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridx = 0; gbc.gridy = 1;
//         add(deleteNewsButton, gbc);

//         editNewsButton = new JButton("Edit News");
//         editNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new EditNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridx = 0; gbc.gridy = 2;
//         add(editNewsButton, gbc);

//         displayNewsButton = new JButton("Display News");
//         displayNewsButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 new DisplayNewsScreen(MainMenuScreen.this);
//                 setVisible(false);
//             }
//         });
//         gbc.gridx = 0; gbc.gridy = 3;
//         add(displayNewsButton, gbc);

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new MainMenuScreen();
//             }
//         });
//     }
// }










package src.presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuScreen extends JFrame {

    private JButton postNewsButton;
    private JButton deleteNewsButton;
    private JButton editNewsButton;
    private JButton displayNewsButton;

    public MainMenuScreen() {
        setTitle("News Management Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180));
        JLabel headerLabel = new JLabel("News Management Dashboard");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);
        add(headerPanel, BorderLayout.NORTH);

        // Buttons panel
        JPanel buttonsPanel = new JPanel(new GridBagLayout());
        buttonsPanel.setBackground(new Color(245, 245, 245));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        postNewsButton = createButton("Post News", "icons/post.png");
        postNewsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PostingNewsScreen(null);
                dispose();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonsPanel.add(postNewsButton, gbc);

        deleteNewsButton = createButton("Delete News", "icons/delete.png");
        deleteNewsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteNewsScreen();
                dispose();
            }
        });
        gbc.gridy = 1;
        buttonsPanel.add(deleteNewsButton, gbc);

        editNewsButton = createButton("Edit News", "icons/edit.png");
        editNewsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditNewsScreen();
                dispose();
            }
        });
        gbc.gridy = 2;
        buttonsPanel.add(editNewsButton, gbc);

        displayNewsButton = createButton("Display News", "icons/display.png");
        displayNewsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DisplayNewsScreen(null);
                dispose();
            }
        });
        gbc.gridy = 3;
        buttonsPanel.add(displayNewsButton, gbc);

        add(buttonsPanel, BorderLayout.CENTER);

        // Footer panel
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(70, 130, 180));
        JLabel footerLabel = new JLabel("© 2024 News Management System");
        footerLabel.setForeground(Color.WHITE);
        footerPanel.add(footerLabel);
        add(footerPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JButton createButton(String text, String iconPath) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setIcon(new ImageIcon(iconPath));
        button.setPreferredSize(new Dimension(250, 50));
        button.setFocusPainted(false);
        button.setBackground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));
        button.setToolTipText(text);
        return button;
    }

    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(new Runnable() {
    //         @Override
    //         public void run() {
    //             new MainMenuScreen();
    //         }
    //     });
    // }
}


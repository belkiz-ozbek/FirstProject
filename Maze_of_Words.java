package mypackage.game_project_final;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import static mypackage.game_project_final.Levels.levelFlag;

/**
 *
 * The main class representing the Maze Game.
 */
public class Maze_of_Words extends JPanel {

    /*
An object of the Easy class representing the easy level.
     */
    Easy easy = new Easy();

    /*
An object of the Medium class representing the medium level.
     */
    Medium medium = new Medium();

    /*
An object of the Hard class representing the hard level.
     */
    Hard hard = new Hard();

    /*
A Graphics object used for painting the game.
     */
    private Graphics graph;

    /**
     * The paint method takes a Graphics object as a parameter and uses it to
     * draw the maze based on the current difficulty level. If the difficulty
     * level is 1, the easy level is drawn. If the difficulty level is 2, the
     * medium level is drawn. If the difficulty level is 3, the hard level is
     * drawn. The difficulty level is determined by the levelFlag field in the
     * Levels class.
     */
    @Override
    public void paint(Graphics graph) {
        if (levelFlag == 1) {
            easy.paint(graph);
        }
        if (levelFlag == 2) {
            medium.paint(graph);
        }
        if (levelFlag == 3) {
            hard.paint(graph);
        }

    }
    /**
     * Maze_of_Words also has static fields for the different images used in the
     * game: rightIconMale, leftIconMale, downIconMale, upIconMale,
     * startIconMale, rightIconFemale, leftIconFemale, downIconFemale,
     * upIconFemale, and startIconFemale. These fields are used to display the
     * character's movements and current position in the maze.
     */

    static ImageIcon rightIconMale = new ImageIcon("./image/rightIcon_male.png");
    static ImageIcon leftIconMale = new ImageIcon("./image/leftIcon_male.png");
    static ImageIcon downIconMale = new ImageIcon("./image/downIcon_male.png");
    static ImageIcon upIconMale = new ImageIcon("./image/upIcon_male.png");
    static ImageIcon startIconMale = new ImageIcon("./image/startIcon_male.png");

    static ImageIcon rightIconFemale = new ImageIcon("./image/rightIcon_female.png");
    static ImageIcon leftIconFemale = new ImageIcon("./image/leftIcon_female.png");
    static ImageIcon downIconFemale = new ImageIcon("./image/downIcon_female.png");
    static ImageIcon upIconFemale = new ImageIcon("./image/upIcon_female.png");
    static ImageIcon startIconFemale = new ImageIcon("./image/startIcon_female.png");

    /* 
     * Finally, the class has a static JLabel field, label, which is used to display the character's current position in the maze. 
     */
    static JLabel label = new JLabel();

    /**
     * Displays the start screen where the player can choose to start the game
     * or exit.
     */
    public static void main(String[] args) {

        /**
         * This class represents a Java program that creates and displays
         * several graphical user interface (GUI) windows using the Swing
         * library. The program appears to be creating a maze game that involves
         * a character that can be controlled using keyboard input.
         *
         * The program begins by creating a JFrame window with two buttons,
         * "START" and "EXIT". When the user clicks the "START" button, another
         * JFrame window is displayed with a gender selection feature. This
         * window allows the user to choose between a male or female character
         * by clicking on corresponding buttons with male and female icons.
         *
         * After the user has selected a gender, the main game window is
         * displayed. This window contains a maze that the character can
         * navigate through using the arrow keys on the keyboard. The program
         * also includes a JLabel at the bottom of the window which displays the
         * current position of the character within the maze.
         *
         * The program also has an "EXIT" button which closes the program when
         * clicked.
         *
         */
        JFrame dispose = new JFrame("Start the Game");
        JFrame crs = new JFrame("CrossWord");
        JFrame gender = new JFrame("Choosing a Gender");
        JLabel genderlbl = new JLabel("Choose a gender:");
        JButton male = new JButton();
        JButton female = new JButton();
        JButton start = new JButton("START");
        JButton exit = new JButton("EXIT");
        Character ch = new Character();
        Crossword crw = new Crossword(ch);

        JFrame frame = new JFrame("Maze Game");
        Maze_of_Words game = new Maze_of_Words();

        label.setBounds(0, 720, 35, 35);
        label.setBackground(Color.LIGHT_GRAY);

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setOpaque(false);

        start.setBounds(80, 80, 80, 30);
        exit.setBounds(200, 80, 80, 30);

        dispose.add(start);
        dispose.add(exit);

        /**
         *
         * This method creates and displays a new window that prompts the user
         * to choose their gender. The window has two buttons, one for male and
         * one for female, and the user can choose their gender by clicking on
         * the corresponding button. The window also has a label that displays
         * the text "Please choose your gender:". The window has a size of
         * 500x500 and is located at the coordinates (350, 100) on the screen.
         * The layout of the window is set to null and the default close
         * operation is set to exit the program when the window is closed.
         */
        dispose.setSize(500, 500);
        dispose.setLocation(350, 100);
        dispose.setLayout(null);
        dispose.setVisible(true);
        dispose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         *
         * This method sets the size, bounds, and font for the genderlbl JLabel.
         * The size of the label is set to 200x100 pixels and its position on
         * the screen is set to (150, 20). The font of the label is set to
         * Calibri with a size of 25.
         */
        genderlbl.setSize(200, 100);
        genderlbl.setBounds(150, 20, 200, 100);
        genderlbl.setFont(new Font("Calibri", Font.PLAIN, 25));

        /**
         *
         * This method sets the icon, size, and background color of the "Female"
         * button. The icon displayed on the button is the "startIconFemale"
         * image. The size of the button is set to 100x100 pixels. The
         * background color of the button is set to pink.
         */
        female.setBounds(280, 150, 100, 100);
        female.setIcon(startIconFemale);
        female.setBorder(new EmptyBorder(5, 15, 5, 15));
        female.setBackground(Color.pink);
        /**
         *
         * This method is used to set the position of the text on the female
         * button. The text is centered horizontally and vertically on the
         * button.
         */
        female.setHorizontalTextPosition(JButton.CENTER);
        female.setVerticalTextPosition(JButton.CENTER);

        male.setBounds(100, 150, 100, 100);
        male.setIcon(startIconMale);
        male.setBorder(new EmptyBorder(5, 15, 5, 15));
        male.setBackground(new Color(54, 133, 245));
        /**
         *
         * This method is used to set the position of the text on the male
         * button. The text is centered horizontally and vertically on the
         * button.
         */
        male.setHorizontalTextPosition(JButton.CENTER);
        male.setVerticalTextPosition(JButton.CENTER);

        gender.setSize(500, 500);
        gender.setLocation(350, 100);
        gender.setLayout(null);
        gender.getContentPane().setBackground(new Color(177, 198, 224));

        gender.add(genderlbl);
        gender.add(male);
        gender.add(female);

        frame.add(label);
        frame.add(game);

        crs.setSize(650, 500);
        crs.setLocation(300, 100);

        start.addActionListener((ActionEvent e) -> {
            dispose.dispose();
            gender.setVisible(true);
            ImageIcon img;
            JLabel background1 = new JLabel();
            img = new ImageIcon("C:\\Users\\lenovo\\Desktop\\background.jpg");
            background1.setBounds(0, 0, 0, 50);
            background1 = new JLabel("", img, JLabel.CENTER);
            dispose.add(background1);
            dispose.setOpacity(1);
            gender.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            male.addActionListener((ActionEvent e1) -> {
                gender.dispose();
                frame.setVisible(true);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                label.setIcon(startIconMale);
                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e2) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e3) {
                        if (game.easy.canMove(label.getY() / 38, label.getX() / 38, e3.getKeyCode())) {
                            switch (e3.getKeyCode()) {
                                case 37 -> {
                                    label.setLocation(label.getX() - 10, label.getY());
                                    label.setIcon(leftIconMale);
                                }
                                case 38 -> {
                                    label.setLocation(label.getX(), label.getY() - 10);
                                    label.setIcon(upIconMale);
                                }
                                case 39 -> {
                                    label.setLocation(label.getX() + 10, label.getY());
                                    label.setIcon(rightIconMale);
                                }
                                case 40 -> {
                                    label.setLocation(label.getX(), label.getY() + 10);
                                    label.setIcon(downIconMale);
                                }
                            }
                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e4) {
                        if (e4.getKeyCode() == 37 || e4.getKeyCode() == 38 || e4.getKeyCode() == 39 || e4.getKeyCode() == 40) {
                            label.setIcon(startIconMale);
                        }
                        if (label.getX() > 1482 && label.getY() < 117 && label.getX() < 1520 && label.getY() >= 0) {
                            //frame.dispose();

                            /*crs.add(label);
                            crs.setBounds(300,300,300,300);
                            crs.setVisible(true);
                            crs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
                            JFrame pop = new JFrame("crossword");
                            pop.setBounds(300, 300, 300, 300);
                            pop.setVisible(true);
                            JPanel panel = new JPanel();
                            panel.setVisible(true);
                            pop.add(panel);
                            JLabel lbl = new JLabel();
                            lbl.setText(ch.question);
                            panel.add(lbl);
                            TextField text = new TextField();
                            text.setVisible(true);
                            panel.add(text);
                            JButton btn = new JButton("send");
                            panel.add(btn);
                            btn.addActionListener((ActionEvent e5) -> {
                                String userAns = text.getText();

                                /**
                                 *
                                 * Displays a window with a message depending on
                                 * the result of the Controller method.
                                 *
                                 * @param userAns the user's answer to be passed
                                 * to the Controller method
                                 *
                                 * @param crw the object containing the
                                 * Controller method
                                 *
                                 * @param pop the current window being displayed
                                 *
                                 * @param levelFlag a flag representing the
                                 * current level of the game
                                 *
                                 * @param game the game object to be reset and
                                 * displayed
                                 *
                                 * @param frame the frame containing the game
                                 * object
                                 *
                                 * @param panel a panel to which a message label
                                 * is added if the player did not win
                                 */
                                if (crw.Controller(userAns)) {
                                    pop.dispose();
                                    JFrame win = new JFrame("END OF THE GAME");
                                    win.setVisible(true);
                                    win.setBounds(300, 300, 300, 300);
                                    JLabel message = new JLabel();
                                    message.setText("CONGRATULATIONS!!! YOU WON THE GAME!!!");
                                    win.add(message);
                                    win.setDefaultCloseOperation(EXIT_ON_CLOSE);

                                    levelFlag++;
                                    game.paint(game.graph);
                                    win.dispose();
                                    frame.add(game);

                                } else {
                                    JLabel falsemessage = new JLabel("Try again!!");
                                    falsemessage.setBounds(300, 300, 300, 300);
                                    panel.add(falsemessage);
                                }
                            });
                        }
                    }
                });
            });

            female.addActionListener((ActionEvent e1) -> {
                gender.dispose();
                frame.setVisible(true);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                label.setIcon(startIconFemale);
                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e2) {
                    }

                    /**
                     * This method is an event handler that is triggered when
                     * the user presses a key on the keyboard while the main
                     * game window is in focus.
                     *
                     * When the event is triggered, the method calls the
                     * `canMove` method of the `Easy` class to check if the
                     * character can move in the direction of the arrow key that
                     * was pressed. If the character can move, the method
                     * updates the character's position and icon based on the
                     * arrow key that was pressed.
                     *
                     * @param e3 the key event triggered by pressing a key on
                     * the keyboard
                     */
                    @Override

                    public void keyPressed(KeyEvent e3) {
                        if (game.easy.canMove(label.getY() / 38, label.getX() / 38, e3.getKeyCode())) {
                            switch (e3.getKeyCode()) {
                                case 37:
                                    label.setLocation(label.getX() - 10, label.getY());
                                    label.setIcon(leftIconFemale);
                                    break;
                                case 38:
                                    label.setLocation(label.getX(), label.getY() - 10);
                                    label.setIcon(upIconFemale);
                                    break;
                                case 39:
                                    label.setLocation(label.getX() + 10, label.getY());
                                    label.setIcon(rightIconFemale);
                                    break;
                                case 40:
                                    label.setLocation(label.getX(), label.getY() + 10);
                                    label.setIcon(downIconFemale);
                                    break;
                            }
                        }
                    }

                    /**
                     * This method is an event handler that is triggered when
                     * the user releases a key on the keyboard while the main
                     * game window is in focus.
                     *
                     * When the event is triggered, the method checks if the key
                     * that was released is an arrow key. If it is, the
                     * character's icon is set to the female character icon.
                     *
                     * The method also checks if the character's position is
                     * within a certain range of coordinates. If it is, a pop-up
                     * window is displayed with a crossword question and a text
                     * field for the user to enter their answer. The user can
                     * submit their answer by clicking the "SUBMIT" button,
                     * which triggers another event handler to check if the
                     * answer is correct. If the answer is correct, a
                     * congratulations message is displayed and the game
                     * proceeds to the next level. If the answer is incorrect, a
                     * message prompting the user to try again is displayed.
                     *
                     * @param e4 the key event triggered by releasing a key on
                     * the keyboard
                     */
                    @Override
                    public void keyReleased(KeyEvent e4) {
                        if (e4.getKeyCode() == 37 || e4.getKeyCode() == 38 || e4.getKeyCode() == 39 || e4.getKeyCode() == 40) {
                            label.setIcon(startIconFemale);
                        }
                        if (label.getX() > 1482 && label.getY() < 117 && label.getX() < 1520 && label.getY() >= 0) {
                            JFrame pop = new JFrame("crossword");
                            pop.setBounds(300, 300, 300, 300);
                            pop.setVisible(true);
                            JPanel panel = new JPanel();
                            panel.setVisible(true);
                            pop.add(panel);
                            JLabel lbl = new JLabel();
                            lbl.setText(ch.question);
                            panel.add(lbl);
                            TextField text = new TextField();
                            text.setVisible(true);
                            panel.add(text);
                            JButton btn = new JButton("send");
                            panel.add(btn);
                            btn.addActionListener(new ActionListener() {

                                /**
                                 * This method is an event handler that is
                                 * triggered when the user clicks the "SUBMIT"
                                 * button in the pop-up window.
                                 *
                                 * When the event is triggered, the method gets
                                 * the user's input from the text field in the
                                 * pop-up window and checks if it is a correct
                                 * answer using the `Controller` method of the
                                 * `Crossword` class. If the answer is correct,
                                 * a congratulations message is displayed in a
                                 * new window and the game proceeds to the next
                                 * level. If the answer is incorrect, a message
                                 * prompting the user to try again is displayed.
                                 *
                                 * @param e5 the action event triggered by
                                 * clicking the "SUBMIT" button
                                 */
                                @Override
                                public void actionPerformed(ActionEvent e5) {
                                    String userAns = text.getText();

                                    if (crw.Controller(userAns)) {
                                        pop.dispose();
                                        JFrame win = new JFrame("END OF THE GAME");
                                        win.setVisible(true);
                                        win.setBounds(300, 300, 300, 300);
                                        JLabel message = new JLabel();
                                        message.setText("CONGRATULATIONS!!! YOU WON THE GAME!!!");
                                        win.add(message);

                                        Maze_of_Words game2 = new Maze_of_Words();
                                        win.setDefaultCloseOperation(EXIT_ON_CLOSE);

                                        levelFlag++;
                                        game.paint(game.graph);
                                        win.dispose();
                                        frame.add(game);

                                    } else {
                                        JLabel falsemessage = new JLabel("Try again!!");
                                        falsemessage.setBounds(300, 300, 300, 300);
                                        panel.add(falsemessage);
                                    }
                                }
                            });
                        }
                    }
                });
            });
        });

        /**
         * This method is an event handler that is triggered when the user
         * clicks the "EXIT" button in the main window.
         *
         * When the event is triggered, the main window is closed and the
         * program is terminated.
         *
         * @param e the action event triggered by clicking the "EXIT" button
         */
        exit.addActionListener((ActionEvent e) -> {
            dispose.dispose();
        });

    }
}

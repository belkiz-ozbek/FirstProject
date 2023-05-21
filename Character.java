package mypackage.game_project_final;

import javax.swing.*;

/**
 * A class representing a character in a maze game. Extends the JLabel class.
 */
public class Character extends JLabel {

    /**
     * A string representing the question asked by this character.
     */
    String question = " ";

    /**
     * A static string representing the answer to the question asked by this
     * character.
     */
    static String answer = " ";

    /**
     * Constructs a new Character object.
     */
    Character() {

        this.question = " ";
        Character.answer = " ";

    }
}

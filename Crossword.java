package mypackage.game_project_final;

import static mypackage.game_project_final.Levels.levelFlag;

/**
 *
 * A class representing a crossword puzzle in a maze game. Extends the Character
 * class.
 */
public class Crossword extends Character {

    /*
An array of strings representing questions for the crossword puzzle, for level 1.
     */
    static String[] questions3 = {"Meow!Meow!", "Yellow and too hot", "What writes your name?", "Not small", "Not wet", "Laugh out loud", "What navigates you?",
        "Stopping breathe", "Scrambled or boiled", "What do you chew?", "Where do you build muscle?", "You use to unlock", "Not women", "Fishes' home",
        "Not to lose", "Where do you visit animals", "... The Road Jack (A song)", "Where do you sleep?", "Who gives you milk", "Not young"};
    /*
An array of strings representing answers for the crossword puzzle, for level 1.
     */
    static String[] answers3 = {"Cat", "Sun", "Pen", "Big", "Dry", "lol", "Map", "Die", "Egg", "Gum", "Gym", "Key", "Men", "Sea", "Win", "Zoo", "Hit", "Bed", "Cow", "Old"};
    /*
An array of strings representing questions for the crossword puzzle, for level 2.
     */
    static String[] questions5 = {"My thoughts are same as yours", "Not dead", "..... Birds (A game name)", "Thing that a king wears on his head", "Not dirty", "Opposite of fix", "Not expensive",
        "Lets you know the time", "What do you do with liquids instead of eating them?", "Not true", "When do you go to the bed?", "Not vegetable", "..... Club (A movie)", "Not telling the truth",
        "It needs a pilot to fly", "Sings the Bohemian Rhapsody", "Not Lower", "Corona .....", "Colour of pureness", "Gravitational ....."};
    /*
An array of strings representing answers for the crossword puzzle, for level 2.
     */

    static String[] answers5 = {"Agree", "Alive", "Angry", "Crown", "Clean", "Broke", "Cheap", "Clock", "Drink", "False", "Night", "Fruit", "Fight", "Lying", "Plane", "Queen", "Upper", "Virus", "White", "Force"};
    /*
An array of strings representing questions for the crossword puzzle, for level 3.
     */

    static String[] questions7 = {"It comes from my parent's DNA, so it is", "Now I see ... clear", "Not legal", "Where do you place your fridge?", "Download(Same meaning)", "Every wife have a", "Not artificial",
        "You have to get this to drive", "Chernobyl ... power plant", "Opposite of maximum", "An ocean", "Composed of peptide bonds", "One fourth", "... Valley", "Gives you financial support", "Someone who goes to school to learn",
        "You say to someone who just entered the room", "... America (Marvel character)", "Part of the house where you place your bed", "Time-honored,old,dateless (....... Greek)"};

    /*
An array of strings representing answers for the crossword puzzle, for level 3.
     */
    static String[] answers7 = {"Genetic", "Crystal", "Illegal", "Kitchen", "Install", "Husband", "Natural", "License", "Nuclear", "Minimum", "Pacific", "Protein", "Quarter", "Silicon", "Sponsor", "Student", "Welcome", "Captain", "Bedroom", "Ancient"};

    /**
     * Constructor for the Crossword class. Takes a Character object as a
     * parameter and sets the question and answer for the crossword puzzle based
     * on the current level.
     *
     * @param person the Character object representing the player in the game
     */
    public Crossword(Character person) {
        // code to determine the question and answer for the crossword puzzle
        int min = 0;
        int max = 19;
        int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int min2 = 65;
        int max2 = 90;

        /*if(levelFlag==1){
            person.question=questions3[number];
            person.answer=answers3[number];
        }

        
        if(levelFlag==2){
            person.question=questions5[number];
            person.answer=answers5[number];
        }
         */
        if (levelFlag == 3) {
            person.question = questions7[number];
            person.answer = answers7[number];
        }

    }

    /**
     * A method to check if the user's answer is correct.
     *
     * @param userAns the user's answer to the crossword puzzle
     * @return true if the user's answer is correct, false otherwise
     */
    public boolean Controller(String userAns) {
        // code to check if the user's answer is correct
        return (Character.answer.toUpperCase().equals(userAns.toUpperCase()));
    }

}

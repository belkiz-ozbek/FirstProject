package mypackage.game_project_final;


import java.awt.Color;
import java.awt.Graphics;


/**
 * A class representing a hard level in a maze game.
 * Extends the Levels class.
 */

public class Hard extends Levels {

  /**
     * A 2D array representing the layout of the maze for this level.
     */
  int [][] lab1=new int [20][40 ];
  int row,col=0;
  /**
     * The number of rows in the maze.
     */
  int rowNum=20;
  /**
     * The number of columns in the maze.
     */
  int colNum=40;
  /**
     * The width of each block in the maze.
     */
  int blockW=38;
   /**
     * The height of each block in the maze.
     */
  int blockH=38;
  /**
     * A number used to scale the size of the blocks in the maze.
     */
  int num= 38;

    
  /**
     * Overrides the paint method of the Levels class to draw the maze for this level.
     * @param graph the Graphics object to draw on
     */  

  @Override
    public void paint( Graphics graph){

    // code to draw the maze

    int [][] maze =getMaze();
    for(row=0;row<rowNum;row++){
        for(col=0;col<colNum;col++){
            if(maze[row][col]==1){
                graph.setColor(Color.BLACK);
                graph.fillRect(col*num, row*num, blockW, blockH);
                graph.setColor(Color.black);
                graph.drawRect(col*num, row*num, blockW, blockH);
            }
            else if(maze[row][col]==2){
                graph.setColor(Color.yellow);
                graph.fillRect(col*num, row*num, blockW, blockH);
                graph.setColor(Color.black);
                graph.drawRect(col*num, row*num, blockW, blockH);


            }
            else{
                graph.setColor(Color.LIGHT_GRAY);
                graph.fillRect(col*num, row*num, blockW, blockH);
                graph.setColor(Color.black);
                graph.drawRect(col*num, row*num, blockW, blockH);
            }}
    }
    
    //graph.drawString("start", 5, 60);
    //graph.drawString("end",850,460);
    
 }
    

  /**
     * Returns the 2D array representing the layout of the maze for this level.
    /**
     * Returns the 2D array representing the layout of the maze for this level.
     * @return the 2D array representing the layout of the maze
     */

    public int[][] getMaze() {

        // code to return the maze array
        
     int maze[][]={
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
        {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
        {0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,2},
        {0,1,0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,0,1,0,1,1,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,1,1,1,1,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0},
        {0,1,0,1,0,0,1,0,1,1,1,1,0,1,1,1,1,1,0,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,0,1,1,0,0,0},
        {0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,1,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
        {0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {1,1,1,1,0,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
        {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
        {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0}
     };
       
     lab1=maze;
     return lab1; 
    }



    /**
 * Determines whether the player can move in a given direction in the maze.
 * 
 * @param row the row of the player's current position in the maze
 * @param col the column of the player's current position in the maze
 * @param direction the direction in which the player wishes to move
 *                  (38 corresponds to up, 40 corresponds to down,
 *                  37 corresponds to left, and 39 corresponds to right)
 * @return true if the player can move in the given direction, false otherwise
 */
    
    public boolean canMove(int row, int col, int direction){
      switch (direction) {
          case 38 -> {
              return lab1[row-1][col]!=1;
          }
          case 40 -> {
              return lab1[row+1][col]!=1;
          }
          case 37 -> {
              return lab1[row][col-1]!=1;
          }
          case 39 -> {
              return lab1[row][col+1]!=1;
          }
          default -> {
          }
      }
        return false;
    }

    }
    
   


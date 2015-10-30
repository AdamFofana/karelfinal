import kareltherobot.*;
 //* @version (a version number or a date)
 //*/
public class WindowCloser extends Robot implements Directions
{
    public WindowCloser(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
    
    public boolean leftIsClear()
    {
        boolean result = false;
       turnLeft();
       if(frontIsClear()){
           result=true;
        }
        
        turnRight();
        return result;
    }
   
    
    public void moveToNextWindow()
    {
       move();
       
    }
    public void closeWindow()
    {
        if(leftIsClear()){
            putBeeper();
        }
        else{
            moveToNextWindow();
        }
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
     
    
    public void work() 
    {
      putBeeper();
      
       while (frontIsClear()){
           if(leftIsClear()){
               putBeeper();
            }
           move();
        
            
        
        if(!frontIsClear()){
        turnRight();}
        if(nextToABeeper()){
           pickBeeper();
           
        turnOff();
        }
        
    }  
        
    }
}

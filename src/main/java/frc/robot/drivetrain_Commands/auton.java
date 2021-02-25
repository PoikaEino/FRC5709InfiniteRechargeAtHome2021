
/*package frc.robot.drivetrain_Commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Robot;

public class auton extends CommandGroup {
    int course = 1;
    int startingDistanceToAdd;
    public auton(){
        if (course == 1){
                addSequential(new auton_Drive_Y(100, 72, -1));
                addSequential(new auton_Drive_Turn(100, 147, true));
                addSequential(new auton_Drive_Y(100,57.2484,-1));
                addSequential(new auton_Drive_Turn(100,75,true));
                addSequential(new auton_Drive_Y(100,95.6388,-1));
                addSequential(new auton_Drive_Turn(100,84,true));
                addSequential(new auton_Drive_Y(100,13.5348,-1));
                

            

            
        }  
        else if (course == 2) {

        }
    }


     

    }

   public double encoderValue(){
   //   return (double) Robot.drivetrain.getEncoder();
   }

   public double gyroValue(){
   //    return (double) Robot.drivetrain.getGyro();
   }

   protected void end() {
        isFinished();
   }
      
    protected boolean isFinished() {
        return true;
    }
}
*/



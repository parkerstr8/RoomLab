package Rooms;

import Game.Runner;

public class ParkersRoom extends Room
{
    public ParkersRoom(int i, int z)
    {
        super (i, z);
    }

    @Override
    public void enterRoom(People.Person x)
    {
        occupant=x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Welcome to Parker's room. Kick off your armor and make yourself comfortable.");
        Runner.gameOff();
    }

}

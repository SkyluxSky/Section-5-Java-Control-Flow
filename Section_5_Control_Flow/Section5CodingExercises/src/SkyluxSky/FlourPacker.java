package SkyluxSky;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
            return false;
        }
        if(bigCount*5 + smallCount < goal) { // #2 supply must be greater than demand
            return false;
        }
        return (goal%5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
    }
}

package org.dsa;

public class TowersOfHannoi {

    /// Min number of steps to complete towers of Hannoi is (2 pow N) - 1
    /// Step 1 : interchange
    ///
    void towersOfHannoi (int numberOfDiscs, int source,int destination, int temp){
        if (numberOfDiscs > 0){
            towersOfHannoi(numberOfDiscs - 1, source, temp, destination);
            System.out.println(String.format("Disc {} Moved from {} to {}",source,destination));
            towersOfHannoi(numberOfDiscs - 1, temp, destination, source);
        }
    }
}

package main;

import java.util.Scanner;

public class TOH {
    public static int count = 0;
    public static int start = 0;
    public static int intermediate = 0;
    public static int size = 0;

    public static void main(String[] args) throws InvalidInputException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Disks in range 3 to 40: ");
        int numberOfDisks = scanner.nextInt();
       
        if (numberOfDisks <= 40 && numberOfDisks >= 3) {
            System.out.println("Enter Number of Towers in range 5 to 11 : ");
            
            int numberOfTowers = scanner.nextInt();
            
            if (numberOfTowers <= 10 && numberOfTowers >= 5) {
                
            	if (numberOfDisks < numberOfTowers)
                    movesForDiskLessThanTower(numberOfDisks, 1, numberOfTowers);
                
            	else if (numberOfDisks >= numberOfTowers) {
                    movesForDiskEqualAndMoreThanTower(numberOfDisks, 1, numberOfTowers);
                } 
                
            	System.out.println("Total number of Moves from Source to Destination: " + count);
           
            } else
            	throw new InvalidInputException("Invalid number of Towers. Towers limit is between 5 to 10.");
       
        } else
        	throw new InvalidInputException("Invalid number of Disks. Disks limit is between 3 to 40.");
    }

   
    public static void movesForDiskLessThanTower(int disk, int startTower, int endTower) {
        int towerIndex = 2;
        while (towerIndex <= disk + 1) {
            if (towerIndex - 1 == disk) {
                System.out.println("Disk" + (towerIndex - 1) + " is moved from tower " + startTower + " to tower " + endTower);
            } else {
                System.out.println("Disk" + (towerIndex - 1) + " is moved from tower " + startTower + " to tower " + towerIndex);
            }
            towerIndex++;
            count++;
        }
        towerIndex = towerIndex - 2;
        while (towerIndex > startTower) {
            if (towerIndex != endTower) {
                System.out.println("Disk" + (towerIndex - 1) + " is moved from tower " + towerIndex + " to tower " + endTower);
                count++;
            }
            towerIndex--;
        }
    }

    
    public static void movesForDiskEqualAndMoreThanTower(int disk, int startTower, int endTower) {
        int towerIndex = 2;
        int cnt = 0;
        while (towerIndex <= endTower - 2) {
            System.out.println("Disk" + (towerIndex - 1) + " is moved from tower " + startTower + " to tower " + towerIndex);
            towerIndex++;
            count++;
            cnt++;
        }
        towerIndex--;
        start = disk - 2;
        intermediate = disk - 1;
        size = disk;

        towerOfHanoi(disk - cnt, startTower, endTower, endTower - 1);

        while (towerIndex >= 2) {
            System.out.println("Disk" + (towerIndex - 1) + " is moved from tower " + towerIndex + " to tower " + endTower);
            towerIndex--;
            count++;
        }
    }

  
    public static void towerOfHanoi(int disk, int startTower, int endTower, int intermediateTower) {
        if (disk == 1) {
            System.out.println("Disk" + start + " is moved from tower " + startTower + " to tower " + endTower);
            count++;
            return;
        }
       
        towerOfHanoi(disk - 1, startTower, intermediateTower, endTower);
        
        if (disk == 2)
            System.out.println("Disk" + intermediate + " is moved from tower " + startTower + " to tower " + endTower);
        else if (disk == 3)
            System.out.println("Disk" + size + " is moved from tower " + startTower + " to tower " + endTower);
        count++;
       
        towerOfHanoi(disk - 1, intermediateTower, endTower, startTower);
    }
}
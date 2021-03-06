package unit05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double height, lenght, width;
		System.out.println("Height of the room: ");
		height = input.nextDouble();
		System.out.println("Lenght of the room: ");
		lenght = input.nextDouble();
		System.out.println("Width of the room: ");
		width = input.nextDouble();
		input.close();
		
		double totalArea = width * lenght + 2 * height * (lenght + width);
		int largeBuckets = 0, smallBuckets = 0;
		while (totalArea > 0) {
			if (totalArea > 140 || totalArea / 30.0 > 3.0) {
				totalArea -= 140;
				largeBuckets++;
			}
			else {
				totalArea -= 30;
				smallBuckets++;
			}
		}
		
		System.out.println("Large buckets: " + largeBuckets + " x 15$ = " + largeBuckets * 15 + "$");
		System.out.println("Small buckets: " + smallBuckets + " x 4$ = " + smallBuckets * 4 + "$");
		System.out.println("Total: " + (largeBuckets * 15 + smallBuckets * 4) + "$");
	}
}

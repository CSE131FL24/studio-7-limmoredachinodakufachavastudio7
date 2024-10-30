package studio7;

public class Rectangle {
	int length;
	int width;
	int area;
	int perimeter;
	boolean isSquare;
	
	public Rectangle(int objLength, int objWidth) {
		length = objLength;
		width = objWidth;
		area = objLength*objWidth;
		perimeter = (objLength + objWidth)*2;
		if (objWidth == objLength) {
			isSquare = true;
		}
	}
}

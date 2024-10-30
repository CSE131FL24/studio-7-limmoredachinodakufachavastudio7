package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Studio7Objects {
	
	public static void main(String[] args) {
//		StdDraw.setCanvasSize(400, 400);
//		StdDraw.setXscale(0, 400);
//        StdDraw.setYscale(0, 400);
//        StdDraw.clear(StdDraw.WHITE);
//        StdDraw.setPenColor(StdDraw.BLUE);
		
        Rectangle r1 = new Rectangle(3,4);
        Rectangle r2 = new Rectangle(5,2);
        System.out.println(r1.perimeter);
        System.out.println(r1.area);
        
//        StdDraw.filledRectangle(200, 175, 100, 75);
//        StdDraw.show();
        
	}
	
	public static void isSmallerThan(Rectangle r1, Rectangle r2) {
		if (r1.area > r2.area) { 
			System.out.println("r1 area is bigger than r2");
		}
		else if (r1.area < r2.area) {
			System.out.println("r2 area is bigger than r1");
		}
		else {
			System.out.println("r1 area is same as r2");
		}
	}
}


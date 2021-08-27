/*17. Write a program in JAVA to find the Area and Perimeter of a Rectangle.   
Sample Output:
Find the Area and Perimeter of a Rectangle :
-------------------------------------------------
Input the length of the rectangle : 10
Input the width of the rectangle : 15
The area of the rectangle is : 150
The perimeter of the rectangle is : 50
 */
 
 import java.util.Scanner;
public class Area_Perimeter 
{
    public static void main(String[] args) 
    {
        
System.out.println("Find the perimeter and area of rectangle:----------------");
        int l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = l * b;
        System.out.println("Area of rectangle:"+area);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascaltriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {       //outer loop time complexity 0(numrows)
            List<Integer> row = new ArrayList<>();
            
            // Fill the row
            for (int j = 0; j <= i; j++) {         // inner loop 0(i) // space complexity 0(numsrows2)
                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Sum of the two numbers above
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            
            triangle.add(row);
        }
        
        return triangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the number of rows : ");
        int numRows = scanner.nextInt();
        List<List<Integer>> result = generate(numRows);
           System.out.println(result);
            
    }
}


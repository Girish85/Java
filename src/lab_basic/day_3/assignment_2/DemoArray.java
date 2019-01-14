package lab_basic.day_3.assignment_2;

public class DemoArray {
    public static void main(String[] args) {
        int firstArrayMatrix[][] = {{3,3,3},{6,6,6}};
        int secondArrayMatrix[][] = {{6,6,6},{3,3,3}};
        int sum[][] = new int[2][3];
        System.out.println("First Matrix : ");
        for (int row=0;row<firstArrayMatrix.length;row++)
        {
            System.out.println("");
            for (int column : firstArrayMatrix[row])
            {                                               //First Matrix
                System.out.print(column+"   ");
            }
        }
        System.out.println("\nSecond Matrix : ");
        for (int row=0;row<secondArrayMatrix.length;row++)
        {
            System.out.println("");
            for (int column : secondArrayMatrix[row])
            {                                               //Second Matrix
                System.out.print(column+"   ");
            }
        }
        System.out.println("\nSum of two Matrices is : ");
        for (int row=0;row<firstArrayMatrix.length;row++)
        {
            for (int column=0;column<firstArrayMatrix[row].length;column++)
            {
                sum[row][column] = firstArrayMatrix[row][column]+secondArrayMatrix[row][column];
            }
        }
        for (int row[] : sum)
        {
            System.out.println("");
            for (int column : row)
            {
                System.out.print(column + "   ");
            }
        }
    }
}

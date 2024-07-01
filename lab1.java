import java.util.Scanner;

public class WarehouseSpaceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int WAREHOUSE_LENGTH = 50;
        final int WAREHOUSE_WIDTH = 20;
        final int ROW_SPACING = 2;
        final int MAX_ROW_HEIGHT = 6;

        System.out.println("Enter number of Type 1 boxes (1x1x1): ");
        int type1Boxes = scanner.nextInt();
        System.out.println("Enter number of Type 2 boxes (2x2x1): ");
        int type2Boxes = scanner.nextInt();
        System.out.println("Enter number of Type 3 boxes (2x2x2): ");
        int type3Boxes = scanner.nextInt();

        int totalSpaceUsedType1 = type1Boxes * 1; // Each Type 1 box uses 1 square meter.
        int totalSpaceUsedType2 = type2Boxes * 4; // Each Type 2 box uses 4 square meters.
        int totalSpaceUsedType3 = type3Boxes * 8; // Each Type 3 box uses 8 square meters.

        int totalSpaceUsed = totalSpaceUsedType1 + totalSpaceUsedType2 + totalSpaceUsedType3;
        int totalAvailableSpace = WAREHOUSE_LENGTH * WAREHOUSE_WIDTH;
        int remainingSpace = Math.max(0, totalAvailableSpace - totalSpaceUsed);

        System.out.println("Total remaining space in the warehouse in square meters: " + remainingSpace);

        System.out.println("\nRemaining capacity for each type of box:");
        System.out.println("  - Type 1 boxes: " + (remainingSpace / 1));
        System.out.println("  - Type 2 boxes: " + (remainingSpace / 4));
        System.out.println("  - Type 3 boxes: " + (remainingSpace / 8));
    }
}

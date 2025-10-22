public class ProductRating {
    public static void main(String[] args) {
        int[][] ratings = {
            {4, 5, 4},
            {3, 5, 3},
            {4, 5, 3},
            {1, 2, 1}
        };

        System.out.println("Rating\t\tProduct\t\tPackaging\tDelivery\tCustomer Average");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < ratings.length; i++) {
            double customerSum = 0;
            System.out.printf("Customer %d\t", i + 1);
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.printf("%d\t\t", ratings[i][j]);
                customerSum += ratings[i][j];
            }
            double customerAverage = customerSum / ratings[i].length;
            System.out.printf("%.2f\n", customerAverage);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.print("Criterion Average\t");
        for (int j = 0; j < ratings[0].length; j++) {
            double criterionSum = 0;
            for (int i = 0; i < ratings.length; i++) {
                criterionSum += ratings[i][j];
            }
            double criterionAverage = criterionSum / ratings.length;
            System.out.printf("%.2f\t\t", criterionAverage);
        }
        System.out.println();
    }
}
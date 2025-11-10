package Task2;

public class Task2 {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;
        final int MAXAGE = 26;

        int[][] agedistribution = {
                {12, 21},  		// 12 %    	// This line matches to random numbers 1..10, gives age 21
                {36, 22},		// 24 %    	// ...
                {62, 23},    	// 26 %
                {80, 24},  		// 18 %
                {92, 25}, 		// 12 %
                {100, MAXAGE} 	// 8 %	  	// This line matches to random numbers 82 to 100
        };

        int generatedAges[] = new int[MAXAGE+1];

        // Generate ages according to the distribution:
        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1; 	// generate a random number 1..100 -> we get the row which gives the age
            int j = 0;
            System.out.println("x=" + x);
            while (x > agedistribution[j][0]) j++;  // search for the correct row to get the matching age
            generatedAges[agedistribution[j][1]]++; // age founded gives an index to the generated ages count table: increment it (by one)
        }

        // Output the result of the generation:
        System.out.println("Age  count     %-share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-4d %-8d %-8.2f\n";
                System.out.printf(str, age, generatedAges[age], ((double)generatedAges[age])/REITERATIONS*100 );
            }
        }
    }

}

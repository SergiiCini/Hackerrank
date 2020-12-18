package app;

class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int count = 0;
        int valleys = 0;
        for (char step : path.toCharArray()) {
            switch (step) {
                case 'U':
                    count++;
                    if (count == 0) {
                        valleys++;
                    }
                    break;
                case 'D':
                    count--;
                    break;
            }
        }
        System.out.println(valleys);
        return valleys;
    }
    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");
    }


}

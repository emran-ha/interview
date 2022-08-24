package algoeducative;

class TrainPlatform {
    public static int findPlatform(int[] arrival, int[] departure) {
        int result = 1;
        int platform = 1;
        for (int i = 0; i < arrival.length - 1; i++) {
            platform = 1;
            for (int j = i + 1; j < arrival.length; j++) {
                if (Math.max(arrival[i], arrival[j]) <= Math.min(departure[i], departure[j])) {
                    platform++;
                }
            }
            result = Math.max(result, platform);
        }
        return result;
    }

    public static void main(String[] args) {
        int arrival[] = {900, 940, 950, 1100, 955};
        int departure[] = {910, 1200, 1120, 1130, 1900};
        System.out.println(findPlatform(arrival, departure));
    }
}

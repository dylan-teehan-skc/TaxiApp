class Map {
    private static String[][] taximap;

    static {
        createMap();
    }

    public static void createMap() {
        taximap = new String[][] {
                {"Killmurry", "Dromrow", "Cappavilla"},
                {"Plassey", "Thomond", "College Court"}
        };
    }

    public static String[][] getMap() {
        return taximap;
    }
}
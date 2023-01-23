class Main {
    public static void main(String[] args) {
        String str = "Hi, this is a test";
        String[] result = str.split(" ");
        int i = result.length - 1;
        while (i >= 0) {
            System.out.printf("%s ",result[i]);
            i--;
        }
    }
}

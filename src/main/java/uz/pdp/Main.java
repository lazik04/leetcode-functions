package uz.pdp;

public class Main {
    public static void main(String[] args) {
        CheckIfArrayPairsAreDivisibleByK check = new CheckIfArrayPairsAreDivisibleByK();
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9,2,4};
        boolean b = check.canArrange(arr, 5);
        System.out.println(b);
    }
}
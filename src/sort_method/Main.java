package sort_method;

public class Main {

    public static void printStrArray(String[] arr){
        for(String a: arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        System.out.println("Original: ");
        String[] arrString = {"Ning", "Park", "Darm", "Tong", "Beau", "Benz", "Wan", "Fluk"};
        printStrArray(arrString);
        System.out.println();
        System.out.println("Sort: ");
        SortMethod.sort(arrString, new NameCompare());
        printStrArray(arrString);

    }
}

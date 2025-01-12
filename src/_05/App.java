package _05;

public class App {
  // {A, B, C}
  // A
  // AB
  // ABC
  public static void printTriangle(Object[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(arr[j]);
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    printTriangle(new Integer[] { 1, 2, 3, 4 });
    printTriangle(new Character[] { 'A', 'B', 'C', 'D', 'E' });
    printTriangle(new String[] {});
    printTriangle(new String[] { "Hello" });
    printTriangle(new String[] { "Hello", "There", "Friend" });
  }
}
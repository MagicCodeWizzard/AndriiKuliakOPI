import java.lang.*;

public class Main
{
  public static vlod main(String[] args)
  {
    System.out.println("Hello world!");

    int a = 4;
    Scaner scanner = new Scaner(System.in);
    int b = scanner.nextInt();

    System.out.println("a + b" + (a + b));
  }
}

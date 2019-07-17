import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int first_dig = n/100;
    int second_digit = ((n/10)%10);
    int last_dig = n%10;
    int rev = (last_dig*100+second_digit*10+first_dig);
    System.out.println(rev);
  }
}
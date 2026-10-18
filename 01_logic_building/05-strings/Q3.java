import java.util.Scanner;

// take two string and print them concatinate
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st stirng");
        String a = sc.nextLine();

        System.out.println("Enter 2st stirng");
        String b = sc.nextLine();

        System.out.println(a +" " + b);
        System.out.println(a.concat(b));

        // using string builder , best when loop
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append(" ");
        builder.append(b);
        System.out.println(builder.toString());

        // join best for sent
        String res = String.join(a,b);
        System.out.println(res);


        sc.close();

    }
}

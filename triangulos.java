import java.util.Scanner;
public class triangulos
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        double A, B, C;
        
        System.out.print("\n Informe o primeiro ângulo: ");
        A = scanner.nextDouble();
        
        System.out.print("\n Informe o segundo ângulo: ");
        B = scanner.nextDouble();
        
        C = 180 - A - B;
        
        System.out.printf("\n O valor do terceiro ângulo é: " + C);
        
        if (C>= 90) {
            System.out.printf ("\n É um triângulo retângulo.");
        }
        else
        {
            System.out.printf ("\n Não é um triângulo retângulo.");
        }
    }
}
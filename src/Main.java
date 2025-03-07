import model.entities.Contract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("--Entre os dados do contrato--");
        System.out.println("Numero do contrato: ");
            int contractNumber = sc.nextInt();
                sc.nextLine();
        System.out.println("Data do contrato (dd/MM/yyyy)");
            Date contractDate = sdf.parse(sc.nextLine());
        System.out.println("Valor do contrato:");
            double contractValue = sc.nextDouble();
                sc.nextLine();

                Contract cr = new Contract(contractNumber, contractDate, contractValue);

        System.out.println("Qual o numero de parcelas?");
            int intallmentsNumber = sc.nextInt();
                sc.nextLine();
    }
}
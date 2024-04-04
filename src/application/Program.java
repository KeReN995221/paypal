package application;

import entities.Contract;
import entities.Instalment;
import services.ContractServices;
import services.PaypalServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numero = keyboard.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(keyboard.next(), formater);
        System.out.print("Valor do contrato: ");
        double valor = keyboard.nextDouble();
        System.out.print("Numero de parcelas: ");
        int nParcelas = keyboard.nextInt();

        Contract contract = new Contract(numero, data, valor);
        ContractServices contractServices = new ContractServices(new PaypalServices());
        contractServices.processContract(contract,nParcelas);

        System.out.println("Parcelas: ");
        for (Instalment instalment : contract.getInstalments()){
            System.out.println(instalment);
        }
        keyboard.close();
    }
}

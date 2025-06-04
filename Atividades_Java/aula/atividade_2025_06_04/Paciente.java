package atividade_2025_06_04;

import java.util.Scanner;

public class Paciente {

public static Scanner entrada = new Scanner(System.in);

public static String[] nomePaciente = new String [255], cpfPaciente = new String [255];
public static int numeroPacientes = 0;

	public static void cadastrarPaciente() {
		
		System.out.println("Nome do paciente:");
        nomePaciente[numeroPacientes] = entrada.nextLine();

        System.out.println("CPF:");
        cpfPaciente[numeroPacientes] = entrada.nextLine();
        numeroPacientes ++;
        
        System.out.println("Paciente cadastrado.");
        Main.main(null);
	}
}

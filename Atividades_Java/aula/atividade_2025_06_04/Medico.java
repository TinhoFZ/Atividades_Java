package atividade_2025_06_04;

import java.util.Scanner;

public class Medico {

public static Scanner entrada = new Scanner(System.in);
	
public static String [] nomeMedico = new String [255], especialidadeMedico = new String [255];
public static int numeroMedicos = 0;


	public static void cadastrarMedico() {
		System.out.println("Nome do médico:");
        nomeMedico[numeroMedicos] = entrada.nextLine();

        System.out.println("Especialidade:");
        especialidadeMedico[numeroMedicos] = entrada.nextLine();

        numeroMedicos ++;
        System.out.println("Médico cadastrado!");
        
        Main.main(null);
	}
}

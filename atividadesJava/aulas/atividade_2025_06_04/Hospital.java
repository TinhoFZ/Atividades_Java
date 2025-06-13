package atividade_2025_06_04;

import java.util.Scanner;

public class Hospital {

// consultasPaciente vai armazenar o valor de todas as consultas do paciente
public static String [] consultasPaciente = new String[255];
public static int [] numeroConsultasMedico = new int [255];

public static String cpfConsulta, medicoConsulta, data;
// usados para contar o número atual de cadastros no sistema
public static int dia, mes, ano;

public static Scanner entrada = new Scanner(System.in);
	
	public static void registrarConsulta() {
		
		System.out.println("CPF do paciente:");
        cpfConsulta = entrada.nextLine();

        System.out.println("Nome do médico:");
        medicoConsulta = entrada.nextLine();
;
        for (int i = 0; i < Paciente.numeroPacientes; i ++) {
        	if (cpfConsulta.equalsIgnoreCase(Paciente.cpfPaciente[i]) && medicoConsulta.equalsIgnoreCase(Medico.nomeMedico[i])) {

                System.out.println("Ano da consulta:");
                ano = entrada.nextInt();
                System.out.println("Mês da consulta:");
                mes = entrada.nextInt();
                System.out.println("Dia da consulta:");
                dia = entrada.nextInt();
                
                entrada.nextLine();
                
                data = dia + "/" + mes + "/" + ano;
                
                // Armazenando a data de todas as consultas no mesmo número de array do paciente
                consultasPaciente[i] = consultasPaciente[i] + "\n" + data;
                
                System.out.println("Consulta registrada.");
        	}
        }
        Main.main(null);
	}
	
	public static void consultasPaciente() {
		System.out.println("CPF do paciente:");
        
        cpfConsulta = entrada.nextLine();
        
        for (int i = 0; i < Paciente.numeroPacientes; i ++) {
        	if (cpfConsulta.equalsIgnoreCase(Paciente.cpfPaciente[i])) {
        		System.out.println(consultasPaciente[i]);
        		Main.main(null);
        	}
        }
	}
}

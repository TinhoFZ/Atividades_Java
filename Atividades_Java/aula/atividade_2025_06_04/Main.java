package atividade_2025_06_04;

import java.util.Scanner;

public class Main {
public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int opcao = 0;

            System.out.println("Menu: \n 1 - Cadastrar Paciente \n 2 - Cadastrar Médico \n 3 - Registrar Consulta \n "
            		+ "4 - Ver Consultas de Paciente \n 5 - Sair \n Escolha: ");

            opcao = entrada.nextInt();
            // nextLine necessário para que o próximo input não seja ignorado
            entrada.nextLine();

            switch (opcao) {
            case 1:
            	Paciente.cadastrarPaciente();
            	break;
            
            case 2:
                Medico.cadastrarMedico();
                break;
                
            case 3:
            	Hospital.registrarConsulta();
                break;
                
            case 4:
            	Hospital.consultasPaciente();
            	break;
            	
            case 5:
                System.out.println("Sistema encerrado.");
                System.exit(0);
            }
       }
   }

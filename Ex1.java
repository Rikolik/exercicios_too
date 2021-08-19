package Trabalho_Pratico_1;

import javax.swing.*;

public class Ex1 {
    public final static double[] SALARIO_PISO = {1100, 2203.48, 3305.22, 6433.57};
    public final static double[] ALIQUOTA = {0.075, 0.09, 0.12, 0.14};

    public static void main (String[] args) {
        String input, nmPessoa;
        double vlSalarioBruto, vlSalarioLiquido, prAliquotaInss, vlInss;
        boolean valoresPegos = false;

        vlSalarioBruto = vlSalarioLiquido = prAliquotaInss = vlInss = 0;
        nmPessoa = "";

        do {
            try {
                input = JOptionPane.showInputDialog("Nome do funcionário: ");
                nmPessoa = input;

                input = JOptionPane.showInputDialog("Salário: ");
                vlSalarioBruto = Double.parseDouble(input);
                valoresPegos = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + "\n" + "Classe: " + e.getClass());
                valoresPegos = false;
            }
        } while (!valoresPegos);

        for (int i = 0; i < SALARIO_PISO.length; i++)
        {
            if (vlSalarioBruto <= SALARIO_PISO[i]) {
                prAliquotaInss = ALIQUOTA[i];
                break;
            }
        }

        vlInss = vlSalarioBruto * prAliquotaInss;
        vlSalarioLiquido = vlSalarioBruto - vlInss;

        JOptionPane.showMessageDialog(null, "Nome: " + nmPessoa + "\nSalário bruto: " + vlSalarioBruto + "\nINSS: " + vlInss + "\nSalário líquido: " + vlSalarioLiquido);
    }
}

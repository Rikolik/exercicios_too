package Trabalho_Pratico_1;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Ex2 {
    public static void main (String[] args) {
        String input;
        double vlDiaria, vlTotal;
        GregorianCalendar dtLocacao, dtDevolucao;
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        long diasAlugado = 0;
        boolean valoresPegos = false;

        vlDiaria = 0;
        dtLocacao = new GregorianCalendar();
        dtDevolucao = new GregorianCalendar();

        do {
            try {
                input = JOptionPane.showInputDialog("Diária: ");
                vlDiaria = Double.parseDouble(input);

                input = JOptionPane.showInputDialog("Data Locação (DD/MM/YYYY): ");
                dtLocacao.setTime(formatadorData.parse(input));

                input = JOptionPane.showInputDialog("Data Devolução (DD/MM/YYYY): ");
                dtDevolucao.setTime(formatadorData.parse(input));
                valoresPegos = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + "\n" + "Classe: " + e.getClass());
                valoresPegos = false;
            }
        } while (!valoresPegos);

        diasAlugado = (dtDevolucao.getTimeInMillis() - dtLocacao.getTimeInMillis()) / (1000 * 60 * 60 * 24);
        vlTotal = diasAlugado * vlDiaria;

        JOptionPane.showMessageDialog(null, "Valor da diária: " + vlDiaria + "\nData de locação: " + formatadorData.format(dtLocacao.getTime()) + "\nData de devolução: " + formatadorData.format(dtDevolucao.getTime()) + "\nDias de locação: " + diasAlugado + "\nValor total da locação: " + vlTotal);
    }
}

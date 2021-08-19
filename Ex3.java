package Trabalho_Pratico_1;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Ex3 {
    public static void main (String[] args) {
        String input;
        GregorianCalendar dtInserida, dtPagamento;
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder resultado = new StringBuilder();
        boolean valoresPegos = false;

        dtInserida = new GregorianCalendar();
        dtPagamento = new GregorianCalendar();

        do {
            try {
                input = JOptionPane.showInputDialog("Data: ");
                dtInserida.setTime(formatadorData.parse(input));

                valoresPegos = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + "\n" + "Classe: " + e.getClass());
                valoresPegos = false;
            }
        } while (!valoresPegos);

        resultado.append("Data informada: ").append(formatadorData.format(dtInserida.getTime())).append("\n");
        dtPagamento.setTime(dtInserida.getTime());

        for (int i = 0; i < 5; i++)
        {
            dtPagamento.setTimeInMillis(dtPagamento.getTimeInMillis() + (1000 * 60 * 60 * 24 * 7));
            resultado.append("Data de pagamento: ").append(formatadorData.format(dtPagamento.getTime())).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
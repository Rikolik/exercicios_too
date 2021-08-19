package Trabalho_Pratico_1;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Ex4 {
    public static void main (String[] args) {
        String input;
        StringBuilder resultado = new StringBuilder();
        boolean valoresPegos = false;

        double vlCompra, vlParcela;
        int qtParcela;
        GregorianCalendar dtVencimento;
        SimpleDateFormat formatadorData;
        double[] arrVlParcelas;
        GregorianCalendar[] arrDtVencimento;

        vlCompra = vlParcela = 0;
        qtParcela = 0;
        dtVencimento = new GregorianCalendar();
        formatadorData = new SimpleDateFormat("dd/MM/yyyy");

        do {
            try {
                input = JOptionPane.showInputDialog("Valor da compra: ");
                vlCompra = Double.parseDouble(input);

                input = JOptionPane.showInputDialog("Quantidade de parcelas: ");
                qtParcela = Integer.parseInt(input);

                valoresPegos = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + "\n" + "Classe: " + e.getClass());
                valoresPegos = false;
            }
        } while (!valoresPegos);

        resultado.append("Valor da compra: ").append(Math.round(vlCompra)).append("\nTotal de Parcelas: ").append(qtParcela).append("\n");
        vlParcela = vlCompra / qtParcela;
        arrVlParcelas = new double[qtParcela];
        arrDtVencimento = new GregorianCalendar[qtParcela];

        for (int i = 0; i < qtParcela; i++)
        {
            dtVencimento.setTimeInMillis(dtVencimento.getTimeInMillis() + (1000L * 60 * 60 * 24 * 30));
            arrVlParcelas[i] = vlParcela;
            arrDtVencimento[i] = dtVencimento;

            resultado.append("Valor da parcela: ").append(arrVlParcelas[i]).append(" Data do ").append(i + 1).append("° vencimento: ");
            resultado.append(formatadorData.format(arrDtVencimento[i].getTime())).append("\n");
        }

        System.out.println(resultado);
    }
}
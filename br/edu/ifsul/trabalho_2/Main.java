package br.edu.ifsul.trabalho_2;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //list
        List<Obra> obras = new ArrayList<>();
        List<Terreno> terrenosObra;
        List<Proprietario> proprietariosCadastrados = new ArrayList<>();
        List<Empreiteira> empreiteirasCadastradas = new ArrayList<>();

        //dados
        Obra novaObra;
        GregorianCalendar dataEntregaObra;
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        Terreno novoTerreno;
        Proprietario proprietarioTerreno;
        Empreiteira empreiteiraObra;
        Integer codigo = 1;

        //controle
        int qtTerrenos = 0;
        boolean continuar = true;
        String input;

        while (continuar)
        {
            try {
                novaObra = new Obra();

                //codigo
                novaObra.setCodigo(codigo);

                //nome
                input = JOptionPane.showInputDialog("Informe um nome para a obra: ");
                novaObra.setNome(input);

                //descricao
                input = JOptionPane.showInputDialog("Informe uma descrição para a obra: ");
                novaObra.setDescricao(input);

                //dataEntrega
                dataEntregaObra = new GregorianCalendar();
                input = JOptionPane.showInputDialog("Data de Entrega (Dia/Mês/Ano): ");
                dataEntregaObra.setTime(formatadorData.parse(input));
                novaObra.setDataEntrega(dataEntregaObra);

                //orcamento
                input = JOptionPane.showInputDialog("Informe o orçamento esperado: R$");
                novaObra.setOrcamento(Double.parseDouble(input));

                //custoTotal
                input = JOptionPane.showInputDialog("Informe os custos reais: R$");
                novaObra.setCustoTotal(Double.parseDouble(input));

                //terrenos - min 3
                terrenosObra = new ArrayList<>();

                while (continuar)
                {
                    novoTerreno = new Terreno();
                    proprietarioTerreno = new Proprietario();

                    // codigo terreno
                    novoTerreno.setCodigo(Integer.valueOf(String.valueOf(codigo) + String.valueOf(qtTerrenos)));

                    //codigo proprietario
                    input = JOptionPane.showInputDialog("Código do proprietário: ");

                    for (Proprietario proprietario : proprietariosCadastrados)
                    {
                        if (proprietario.getCodigo() == Integer.parseInt(input)) {
                            proprietarioTerreno = proprietario;
                            break;
                        }
                    }

                    if (proprietarioTerreno.getCodigo() == null)
                    {
                        proprietarioTerreno.setCodigo(Integer.parseInt(input));

                        //nome proprietario
                        input = JOptionPane.showInputDialog("Novo proprietário - Nome: ");
                        proprietarioTerreno.setNome(input);

                        //cpf proprietario
                        input = JOptionPane.showInputDialog(proprietarioTerreno.getNome() + ", informe o CPF: ");
                        proprietarioTerreno.setCpf(input);

                        proprietariosCadastrados.add(proprietarioTerreno);
                    }

                    novoTerreno.setProprietario(proprietarioTerreno);

                    //largura
                    input = JOptionPane.showInputDialog("Informe a largura: ");
                    novoTerreno.setLargura(Double.parseDouble(input));

                    //comprimento
                    input = JOptionPane.showInputDialog("Informa o comprimento: ");
                    novoTerreno.setComprimento(Double.parseDouble(input));

                    //metrosQuadrados - calculado automaticamente
                    novoTerreno.setMetrosQuadrados(novoTerreno.getLargura() * novoTerreno.getComprimento());

                    terrenosObra.add(novoTerreno);
                    qtTerrenos++;

                    //continuar
                    input = JOptionPane.showInputDialog("Deseja adicionar mais terrenos? (S / N) ");

                    if (input.toLowerCase(Locale.ROOT).equals("n"))
                        continuar = false;

                    if (!continuar && qtTerrenos < 3)
                    {
                        JOptionPane.showMessageDialog(null, "Pelo menos 3 terrenos são necessários na obra!");
                        continuar = true;
                    }
                }
                qtTerrenos = 0;
                continuar = true;

                novaObra.setTerrenos(terrenosObra);

                //empreiteira
                empreiteiraObra = new Empreiteira();

                input = JOptionPane.showInputDialog("Código da empreiteira: ");

                for (Empreiteira empreiteira : empreiteirasCadastradas)
                {
                    if (empreiteira.getCodigo() == Integer.parseInt(input)) {
                        empreiteiraObra = empreiteira;
                        break;
                    }
                }

                if (empreiteiraObra.getCodigo() == null)
                {
                    empreiteiraObra.setCodigo(Integer.parseInt(input));

                    //nome empreiteira
                    input = JOptionPane.showInputDialog("Nova Empreiteira - Nome: ");
                    empreiteiraObra.setNome(input);

                    empreiteirasCadastradas.add(empreiteiraObra);
                }

                novaObra.setEmpreiteira(empreiteiraObra);

                obras.add(novaObra);
                codigo++;

                //continuar
                input = JOptionPane.showInputDialog("Deseja adicionar mais obras? (S / N) ");

                if (input.toLowerCase(Locale.ROOT).equals("n"))
                    continuar = false;
            } catch (Exception e) {
                JOptionPane.showInputDialog(e.getMessage() + "\n" + e.getClass());
                System.exit(400);
            }
        }

        for (Obra obra : obras) {
            obra.exibirDados();
        }
    }
}

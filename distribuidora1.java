import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

class Faturamento {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

public class FaturamentoMensal {
    public static void main(String[] args) {
        List<Faturamento> vetor = new ArrayList<>();

        // Leitura do arquivo JSON
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.json"))) {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Faturamento>>() {}.getType();
            vetor = gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Cálculo do menor e maior valor
        double menor = vetor.stream().mapToDouble(Faturamento::getValor).min().orElse(0);
        System.out.printf("O menor valor de faturamento ocorrido em um dia do mês: %.2f%n", menor);

        double maior = vetor.stream().mapToDouble(Faturamento::getValor).max().orElse(0);
        System.out.printf("O maior valor de faturamento ocorrido em um dia do mês: %.2f%n", maior);

        double soma = vetor.stream().mapToDouble(Faturamento::getValor).sum();
        double media = soma / vetor.size();

        long quantidade = vetor.stream().filter(f -> f.getValor() > media).count();
        System.out.printf("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: %d%n", quantidade);
    }
}
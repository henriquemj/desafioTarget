public class Distribuidora {
    public static void main(String[] args) {
        double sp = 67.83643;
        double rj = 36.67866;
        double mg = 29.22988;
        double es = 27.16548;
        double outros = 19.84953;

        double total = sp + rj + mg + es + outros;

        System.out.println("_".repeat(35));
        System.out.println("\tMENSAL DA DISTRIBUIDORA\n");
        System.out.printf("Valor total: R$%.2f%n", total);

        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOUTROS = (outros / total) * 100;

        System.out.printf("Percentual SP: %.2f%%%n", percentualSP);
        System.out.printf("Percentual RJ: %.2f%%%n", percentualRJ);
        System.out.printf("Percentual MG: %.2f%%%n", percentualMG);
        System.out.printf("Percentual ES: %.2f%%%n", percentualES);
        System.out.printf("Percentual OUTROS: %.2f%%%n", percentualOUTROS);
        System.out.println("-".repeat(35));
    }
}
public class InverterTexto {
    public static void main(String[] args) {
        String texto = "Ola! Esse texto sera invertido...";
        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println(textoInvertido);
    }
}
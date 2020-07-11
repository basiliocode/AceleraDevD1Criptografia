package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        return codificar(texto, 3);
    }

    @Override
    public String descriptografar(String texto) {
        return codificar(texto, -3);
    }

    private String codificar(String texto, int n){
        if (texto.isEmpty())
            throw new IllegalArgumentException();

        texto = texto.toLowerCase();
        byte[] bytes = texto.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            byte b = (bytes[i]);
            if (b > 96 && b < 123)
                bytes[i] = (byte) (b + (n));
        }
        return new String (bytes);
    }
}

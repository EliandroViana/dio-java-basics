package edu.eliandro.exceptionHandling;

public class FormaterCep {
    public static void main(String[] args) {
        try {
            String cepFormated = formaterCep("1234567891");
            System.out.println(cepFormated);
        } catch (CepInvalidException err) {
            System.out.println("Cep invalid!");
        }
    }

    static String formaterCep(String cep) throws CepInvalidException {
        if (cep.length() != 11)
            throw new CepInvalidException();

        return "000.000.000-00";
    }
}

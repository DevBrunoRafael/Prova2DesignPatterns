package SuporteTecnico;

public class Registro {

    private final String cpfProprietario;
    private final int idAparelho;
    private final String descricaoProblema;


    public Registro(String cpfProprietario, int idAparelho, String descricaoProblema) {
        this.cpfProprietario = cpfProprietario;
        this.idAparelho = idAparelho;
        this.descricaoProblema = descricaoProblema;

    }

    @Override
    public String toString() {
        return "Registro {" +
                "\n     Proprietário (CPF): " + cpfProprietario +
                "\n     IdAparelho: " + idAparelho +
                "\n     Problema: " + descricaoProblema +
                "\n}";
    }
}

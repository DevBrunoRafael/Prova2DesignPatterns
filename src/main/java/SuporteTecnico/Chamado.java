package SuporteTecnico;

public class Chamado {
    private final int idChamado;
    private String status;
    private final Registro registro;
    private final String dadosAparelho;

    public Chamado(int IdChamado, String status, Registro registro, String dadosAparelho) {
        this.idChamado = IdChamado;
        this.status = status;
        this.registro = registro;
        this.dadosAparelho = dadosAparelho;
    }

    @Override
    public String toString() {
        return "\nCHAMADO N°(" + idChamado + ")" +
                "\nStatus: " + status +
                "\n" + registro.toString() +
                "\n\n       DADOS DO APRELHO: " + dadosAparelho;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

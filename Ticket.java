import java.util.ArrayList;

public class Ticket {
    private String nitUsuario;
    private int id;
    private String problema;
    private String estado;
    ArrayList<Bitacora> bitacora=new ArrayList<Bitacora>();


    public String getNitUsuario() {
        return nitUsuario;
    }

    public void setNitUsuario(String nitUsuario) {
        this.nitUsuario = nitUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Bitacora> getBitacora() {
        return bitacora;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora.add(bitacora);
    }

    @Override
    public String toString() {



        return "Ticket{" +
                "nitUsuario='" + nitUsuario + '\'' + "\n"+
                "       id=" + id +  "\n"+
                "       problema='" + problema + '\'' +  "\n"+
                "       estado='" + estado + '\'' +  "\n"+
                "       bitacora=" + bitacora +  "\n"+
                '}';
    }
}

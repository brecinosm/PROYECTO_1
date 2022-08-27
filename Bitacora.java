import java.util.Date;

public class Bitacora {
    private String nitSoporte;
    private Date fechaHora;
    private String mensaje;
    private TipoEvento evento;

    public String getNitSoporte() {
        return nitSoporte;
    }

    public void setNitSoporte(String nitSoporte) {
        this.nitSoporte = nitSoporte;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public TipoEvento getEvento() {
        return evento;
    }

    public void setEvento(TipoEvento evento) {
        this.evento = evento;
    }


    @Override
    public String toString() {
        return "Bitacora{" +
                "nitSoporte='" + nitSoporte + '\'' +
                ", fechaHora=" + fechaHora +
                ", mensaje='" + mensaje + '\'' +
                ", evento=" + evento +
                '}';
    }
}

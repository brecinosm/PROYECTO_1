import java.util.ArrayList;

public class ColaServicio {

    ArrayList<Ticket> cola=new ArrayList<Ticket>();
    private TipoCola tipo;

    public ArrayList<Ticket> getCola() {
        return cola;
    }

    public void setTipo(TipoCola tipo) {
        this.tipo = tipo;
    }

    public void agregar(Ticket ticket){
        cola.add(ticket);
    }

    public void quitar(int id){
        for(int i=0; i<cola.size(); i++){
            if(cola.get(i).getId()==id){
                cola.remove(i);
            }
        }
    }

}

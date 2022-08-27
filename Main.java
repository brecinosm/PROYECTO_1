import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bitacora bita = new Bitacora();
        bita.setEvento(TipoEvento.Asignar);
        bita.setMensaje("se arreglo el probelam");
        bita.setNitSoporte("1234");
        bita.setFechaHora(new Date(2001 / 01 / 12));

        Ticket nuevo = new Ticket();
        nuevo.setId(1);
        nuevo.setEstado("en cola");
        nuevo.setProblema("brayanm planco");
        nuevo.setNitUsuario("691945 ");
        nuevo.setBitacora(bita);
        nuevo.setBitacora(bita);

        System.out.println(nuevo.toString());




        /*PROYECTO*/

        ColaServicio mesa = new ColaServicio();
        mesa.setTipo(TipoCola.ColaMesa);

        ColaServicio desarrollo = new ColaServicio();
        desarrollo.setTipo(TipoCola.ColaDesarollo);


        ColaServicio atendidos = new ColaServicio();
        atendidos.setTipo(TipoCola.ColaAtendidos);


        ColaServicio soporte = new ColaServicio();
        soporte.setTipo(TipoCola.ColaSoporte);

        Scanner sc = new Scanner(System.in);

        int salida = 0;
         do {


            try {
                System.out.println("ESCOJE");
                System.out.println("1. ingresar ticket");
                System.out.println("2. Clasificar Ticket");

                salida=sc.nextInt();

                if(salida==1){

                    Bitacora bitas = new Bitacora();
                    bitas.setEvento(TipoEvento.Asignar);
                    bitas.setMensaje("se arreglo el probelam");
                    bitas.setNitSoporte("1234");
                    bitas.setFechaHora(new Date(2001 / 01 / 12));


                    Ticket nuevos = new Ticket();
                    System.out.println("ingrese el id");
                    int id=sc.nextInt();
                    nuevos.setId(id);
                    nuevos.setEstado("Ticket Iniciado");
                    nuevos.setProblema("brayanm planco");
                    nuevos.setNitUsuario("691945 ");
                    nuevos.setBitacora(bitas);

                    mesa.agregar(nuevos);

                }else if(salida==2){
                    System.out.println("Seleccione el tickec con id para pasarlo a soporte");
                    int id=sc.nextInt();
                    for(int i=0; i<mesa.getCola().size(); i++){
                        if(mesa.getCola().get(i).getId()==id){
                            soporte.agregar(mesa.getCola().get(i));
                            mesa.quitar(id);
                        }
                    }
                }

            } catch (Exception e) {
                salida=10;
                sc.nextLine();
            }

        } while (salida!=0);


        System.out.println("ssss");
    }
}
package GestorCorreo;

import java.util.ArrayList;

public class Mail {

    private String asunto;
    private String mensaje;
    private ArrayList<String> para = new ArrayList<>();

    public Mail(String asunto, String mensaje, ArrayList<String> para){
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.para = para;
    }

    public String getAsunto() {
        return asunto;
    }

    public ArrayList<String> getPara() {
        return para;
    }

    public String getMensaje() {
        return mensaje;
    }
}

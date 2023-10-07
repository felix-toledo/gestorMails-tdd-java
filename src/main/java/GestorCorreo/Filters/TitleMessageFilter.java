package GestorCorreo.Filters;

import java.util.ArrayList;

import GestorCorreo.*;

public class TitleMessageFilter extends Filter {
     public TitleMessageFilter(){
          super.setName("Filtro de Asunto y Remitente");
     }

     @Override
     public ArrayList<Mail> filter(String toSearchTitle, String toSearchAnother, Box box){
          TitleFilter titleFilter = new TitleFilter();
          MessageFilter messageFilter = new MessageFilter();
          
          ArrayList<Mail> titleResults = titleFilter.filter(toSearchTitle, box);
          ArrayList<Mail> messageResults = messageFilter.filter(toSearchAnother, box);

          ArrayList<Mail> result = new ArrayList<>(titleResults);
          result.retainAll(messageResults);

          return result;
     }

}
package edu.upc.eetac.dsa;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    HashMap<String, ResourceBundle> cache = new HashMap<String, ResourceBundle>();
    Logger log = Logger.getLogger(I18NManager.class);


    //private static final String PACKAGE = "edu.upc.eetac.dsa";

    private I18NManager() {


    }
    public static I18NManager getInstance(){
        if (instance==null){ instance=new I18NManager();}
        return instance;
    }

    public String getText(String language, String key) {

        log.info("language" +language+" key:"+key);
        ResourceBundle rb = cache.get(language);
        String res = null;

        if (rb==null) {
            rb = ResourceBundle.getBundle(language);
            cache.put(language, rb);

            log.info("utilitzo el carregador de classes per recuperar el bundle");
        }
        else log.info("utilitzo cache");

        res = rb.getString(key);
        log.info("res:" +res);
        return res;
    }
}

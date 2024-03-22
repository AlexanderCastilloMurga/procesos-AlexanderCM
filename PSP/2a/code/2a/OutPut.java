import java.util.*;
/**
 * @author Alexander
 */
public class OutPut {

    /**
     * Default constructor
     */
    public OutPut() {
    }

    /**
     * @param outFile 
     * @param outText
     */
    public void writeData(String outFile, String outText) {
        // TODO implement here
        Formatter file = null;//UUU
        try{//UUU
            file = new Formatter("C:\\Users\\alexs\\Procesos\\PSP\\2a\\code\\2a\\"+outFile);//UUU
            file.format("%s", outText);//UUU
        }catch(Exception e){//UUU
            System.out.println("No se ha podido guardar el archivo");//UUU
        }finally{//UUU
            file.close();//UUU
        }
        }
    }

package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Calculadora {
    @WebMethod
    public String tensao (@WebParam(name = "amperes") String amperes, @WebParam(name = "ohms") String ohms) {
        double amperagem = Double.parseDouble(amperes);
        double resistencia = Double.parseDouble(ohms);
        double voltagem = amperagem*resistencia;
        return "Tensão: " + voltagem;
    }

    @WebMethod
    public String corrente (@WebParam(name = "volts") String volts, @WebParam(name = "ohms") String ohms) {
        double voltagem = Double.parseDouble(volts);
        double resistencia = Double.parseDouble(ohms);
        double amperagem = voltagem/resistencia;
        return "Corrente: " + amperagem;
    }

    @WebMethod
    public String resistencia (@WebParam (name="volts") String volts, @WebParam (name="amperes") String amperes) {
        double voltagem = Double.parseDouble(volts);
        double amperagem = Double.parseDouble(amperes);
        double resistencia = voltagem/amperagem;
        return "Resistência: " + resistencia;
    }

}

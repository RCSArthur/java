/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;

import com.sun.xml.internal.ws.util.StringUtils;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author rcsarthur
 */
@WebService(serviceName = "RecebeNome")
@Stateless()
public class RecebeNome {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Enviar")    
    public String Enviar(@WebParam(name = "name") String nome) {
        int idade = 10;
        return "Nome: " + StringUtils.capitalize(nome) + ", idade: " + idade + " anos!";
    }
}

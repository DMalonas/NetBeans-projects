/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deitel.welcomesoap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Dimitrios
 */
@WebService(serviceName = "WelcomeSOAP")
public class WelcomeSOAP {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "welcome")
    public String hello(@WebParam(name = "name") String name) {
        return "Zanetoula mou I love you the most, " + name + " !";
    }
}

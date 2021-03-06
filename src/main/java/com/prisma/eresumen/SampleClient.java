package com.prisma.eresumen;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.log4j.Logger;

import com.visa.erad.EnvioStatusResponse;
import com.visa.erad.LiquidacionResponse;
import com.visa.erad.LiquidacionWSServiceService;
import com.visa.erad.LiquidacionesResponse;
import com.visa.erad.LiquidacionesWS;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2015-07-13T12:51:44.099-03:00
 * Generated source version: 2.7.16
 * 
 */
public final class SampleClient {

    private static final QName SERVICE_NAME = new QName("http://erad.visa.com/", "LiquidacionWSServiceService");
    private static final QName PORT_NAME = new QName("http://erad.visa.com/", "liquidacionesWSPort");
    
    public static void main(String args[]) throws java.lang.Exception {

    	
    	Logger logger = Logger.getLogger(SampleClient.class);
    	
    	//url o path del wsdl 
        URL wsdlURL = new URL("http://localhost:8080/resumenes/services/liquidacionWS?wsdl");
//        URL wsdlURL = new URL("liquidacionWS.xml");
        
        LiquidacionWSServiceService ss = new LiquidacionWSServiceService(wsdlURL, SERVICE_NAME);
        LiquidacionesWS port = ss.getLiquidacionesWSPort(); 
        
        Client client = ClientProxy.getClient(port);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor()); 
        
        try {
        	
        	System.out.println("invicando getLiquidaciones");
        	//seteo parametros para invocar al ws
            String _getLiquidaciones_fechaDesde = "01/01/2014";
            String _getLiquidaciones_fechaHasta = "31/12/2015";
            String _getLiquidaciones_numeroCuenta = "0122082306";
            String _getLiquidaciones_plataforma = "CRE-PPL";
            
            LiquidacionesResponse response = port.getLiquidaciones(_getLiquidaciones_fechaDesde, _getLiquidaciones_fechaHasta, _getLiquidaciones_numeroCuenta, _getLiquidaciones_plataforma);
            
            System.out.println("getLiquidaciones.result=" + response);
            System.out.println("codigo error: " + response.getCodigoError());
            System.out.println("mensaje: " + response.getMensaje());
            System.out.println("liquidaciones: " + response.getLiquidaciones());
            
            
       	 	System.out.println("invicando getLiquidacion...");
       	 	//seteo parametros para invocar al ws
		    java.lang.String _getLiquidacion_liquidacionID = "CRE-PPL05179278612015-04-09 00:00:00.0";
		    
		    LiquidacionResponse liquidacionResponse = port.getLiquidacion(_getLiquidacion_liquidacionID);
            
		    System.out.println("getLiquidacion.result=" + liquidacionResponse);
            System.out.println("codigo error: " + liquidacionResponse.getCodigoError());
            System.out.println("mensaje: " + liquidacionResponse.getMensaje());
            System.out.println("liquidacion: " + liquidacionResponse.getDocument());
            
            
       	 	System.out.println("invicando getEnvios...");
       	 	//seteo parametros para invocar al ws
		    String _getEnvios_nroCuenta = "321309407584249";
		    EnvioStatusResponse enviosResponse = port.getStatusEnvio(_getEnvios_nroCuenta);
            
		    System.out.println("getEnvio.result=" + enviosResponse);
            System.out.println("codigo error: " + enviosResponse.getCodigoError());
            System.out.println("mensaje: " + enviosResponse.getMensaje());
            System.out.println("envios: " + enviosResponse.getEnvios());

            System.out.println("Invoking renviarEmail...");
            java.lang.String _renviarEmail_token = "29d872ac-81ce-4dd5-8e3e-680861e239f1";
            com.visa.erad.ReenvioResponse _renviarEmail__return = port.renviarEmail(_renviarEmail_token);
            System.out.println("renviarEmail.result=" + _renviarEmail__return.getMensaje());
            
        } catch (Exception e) {
            System.out.println("Invocation failed with the following: " + e.getCause());
            System.out.println();
        }

        System.exit(0);
    }

    
  
}

package cloud.data.integration.module.journal.webservice;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Document;

public class JournalImportClientSOAPMessageHeaderHandler implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext smc) {

		Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		 
        if (outboundProperty.booleanValue()) {
            
            try {
            	SOAPMessage message = smc.getMessage();
                message.writeTo(System.out);
                System.out.println("");
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
                System.out.println("SOAP Header Name: " + header.getTagName());
                //SOAPHeaderElement soapHeaderElement = header.
                SOAPElement security = header.addChildElement("Security", "wsse", "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/types/");
                
                SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
                //usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
 
                SOAPElement username =
                        usernameToken.addChildElement("Username", "wsse");
                username.addTextNode("amavoori@cherryroad.com");
 
                SOAPElement password =
                        usernameToken.addChildElement("Password", "wsse");
                //password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
               password.addTextNode("Welcome1");
               //Print out the outbound SOAP message to System.out
               message.writeTo(System.out);
               System.out.println("");
            } catch (IOException e) {
                e.printStackTrace();
            } catch(SOAPException e) {
            	e.printStackTrace();
            }
 
        } else {
            try {
                 
                //This handler does nothing with the response from the Web Service so
                //we just print out the SOAP message.
                SOAPMessage message = smc.getMessage();
                message.writeTo(System.out);
                System.out.println("");
 
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch(SOAPException e) {
            	e.printStackTrace();
            }
        }
		return outboundProperty;
	}

	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return true;
	}

	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

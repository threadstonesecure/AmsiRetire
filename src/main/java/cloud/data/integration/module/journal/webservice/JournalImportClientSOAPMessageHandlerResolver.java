package cloud.data.integration.module.journal.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class JournalImportClientSOAPMessageHandlerResolver implements HandlerResolver {

	public List<Handler> getHandlerChain(PortInfo portInfo) {
		
		List<Handler> handlerChain = new ArrayList<Handler>();
		
		JournalImportClientSOAPMessageHeaderHandler clientSOAPMessageHeaderHandler =
				new JournalImportClientSOAPMessageHeaderHandler();
		
		handlerChain.add(clientSOAPMessageHeaderHandler);
		
		return handlerChain;
	}

}

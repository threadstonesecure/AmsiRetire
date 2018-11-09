package cloud.data.integration.module.journal;

import java.util.List;

import cloud.data.integration.common.service.FusionCloudDataIntegrationService;
import gov.stcroix.journalimport.client.CatalogService;
import gov.stcroix.journalimport.client.ServiceCatalogService;
import gov.stcroix.journalimport.client.ServiceException;


public class JournalOracleWS {

/*	//public static void main(String args []) throws ServiceException {
		public void run()  throws ServiceException {
		
		ServiceCatalogService serviceCatalogService = FusionCloudDataIntegrationService.getServiceCatalogService();
	
		//JournalImportService journalImportService = new JournalImportService();
		List<CatalogService> catalogServiceList = FusionCloudDataIntegrationService.getAllServiceEndPoints(serviceCatalogService);
		System.out.println("Number of Services: " + catalogServiceList.size());
		 	
		for(CatalogService catalogService : catalogServiceList) {
			System.out.println("Service QName" + catalogService.getQName().getValue());
		}
		
		//List<CatalogService> filteredList = catalogServiceList.stream()
			//	.filter(CatalogService -> CatalogService.getQName().getValue().equals("journalImport"))
			//	.collect(Collectors.toList());
		 
		String opportunityService = "{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityService";
		CatalogService catalogService = FusionCloudDataIntegrationService.getServiceEndPoint(serviceCatalogService, opportunityService);
		System.out.println("CatalogService for OpportunityService: " + catalogService.getWsdlAddress().getValue());
		System.out.println("OpportunityService QName: " + catalogService.getQName().getValue());
		System.out.println("OpportunityService Lifecycle: " + catalogService.getLifecycle().getValue());
		System.out.println("OpportunityService ServiceType: " + catalogService.getServiceType().getValue());
		System.out.println("OpportunityService XSD Location: " + catalogService.getXsdLocation());
		
		
		
	
		//We are getting a specific Catalog Service
		CatalogService svc = serviceCatalogService.getServiceEndPoint("{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityService");
		JAXBElement<String> wsdlAddr = svc.getWsdlAddress();
		System.out.println(wsdlAddr.getValue());
		JAXBElement<String> svcType = svc.getServiceType();
		System.out.println(svcType.getValue());
		
		
	}*/
}

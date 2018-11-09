package cloud.data.integration.common.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;

import cloud.data.integration.common.bipublisher.reportservice.webservice.ReportService;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ReportService_Service;
import cloud.data.integration.common.erpintegrationservice.webservice.ErpIntegrationService;
import cloud.data.integration.common.erpintegrationservice.webservice.ErpIntegrationService_Service;
import cloud.data.integration.common.journalimport.webservice.JournalImportService;
import cloud.data.integration.common.journalimport.webservice.JournalImportService_Service;
import cloud.data.integration.common.webservice.ErpObjectAttachmentService;
import cloud.data.integration.common.webservice.ErpObjectAttachmentService_Service;
//import gov.stcroix.journalimport.client.CatalogService;
//import gov.stcroix.journalimport.client.ServiceCatalogService;
//import gov.stcroix.journalimport.client.ServiceCatalogService_Service;
//import gov.stcroix.journalimport.client.ServiceException;
import gov.shelby.journalimport.client.CatalogService;
import gov.shelby.journalimport.client.ServiceCatalogService;
import gov.shelby.journalimport.client.ServiceCatalogService_Service;
import gov.shelby.journalimport.client.ServiceException;
import gov.shelby.upload.util.*;

public class FusionCloudDataIntegrationService {

	public static ErpIntegrationService getErpIntegrationService() {
		ErpIntegrationService_Service service = new ErpIntegrationService_Service();
		ErpIntegrationService erpIntegrationService = service.getErpIntegrationServiceSoapHttpPort();
		BindingProvider bindingProvider = (BindingProvider)erpIntegrationService;
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, 
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"));
		bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, JournalUtil.getPropertyValue("ERP_INTEGRATION_SERVICE_URL_WSDL"));
		return erpIntegrationService;
	}
	
public static ReportService getBIPublisherReportService() {
		
		ReportService_Service service = new ReportService_Service();
    	ReportService reportService = service.getReportService();
		BindingProvider bindingProvider = (BindingProvider)reportService;
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, 
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"));
		bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, JournalUtil.getPropertyValue("REPORT_SERVICE_URL_WSDL"));
		return reportService;
	}
	
	public static JournalImportService getJournalImportService() {
		JournalImportService_Service service = new JournalImportService_Service();
		JournalImportService journalImportService = service.getJournalImportServiceSoapHttpPort();
		BindingProvider bindingProvider = (BindingProvider)journalImportService;
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, 
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"));
		bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, JournalUtil.getPropertyValue("JOURNAL_IMPORT_SERVICE_URL_WSDL"));
		return journalImportService;
	}
	
	public static ServiceCatalogService getServiceCatalogService() {
		ServiceCatalogService_Service  service= new ServiceCatalogService_Service();
		ServiceCatalogService catalogSvc = service.getServiceCatalogServiceSoapHttpPort();
		BindingProvider bindingProvider = (BindingProvider)catalogSvc;
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, 
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"));
		bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, JournalUtil.getPropertyValue("SERVICE_CATALOG_SERVICE_URL_WSDL"));
		return catalogSvc;
	}
	
	public static ErpObjectAttachmentService authenticate(ErpObjectAttachmentService_Service service) {
		ErpObjectAttachmentService attachmentService = service.getErpObjectAttachmentServiceSoapHttpPort();
		BindingProvider bindingProvider = (BindingProvider)attachmentService;
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, 
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"));
		bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
				JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, JournalUtil.getPropertyValue("ERP_OBJECT_ATTACHMENT_SERVICE_URL_WSDL"));
		return attachmentService;
	}
	
	
	
	/**
	 * This method returns all of Service EndPoints that are available in the Service Catalog.  It returns
	 * information such as wsdl, qname, xsd, etc.
	 * @param serviceCatalogService
	 * @return List<CatalogService>
	 * @throws ServiceException
	 */
	public static List<CatalogService> getAllServiceEndPoints(ServiceCatalogService serviceCatalogService) throws ServiceException {
		
		List<String> serviceType = new ArrayList<String>();
		//We are getting all of the services that are available in the Catalog
		List<CatalogService> allServiceEndPointsList = serviceCatalogService.getAllServiceEndPoints(serviceType);
		//System.out.println("Number of Services: " + allServiceEndPointsList.size());
		
		return allServiceEndPointsList;
	}
	
	/**
	 * This method returns a specific service and WSDL based on the service qname.  For example,
	 * "{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityService"
	 * @param serviceCatalogService
	 * @param qname
	 * @return CatalogService
	 * @throws ServiceException 
	 */
	public static CatalogService getServiceEndPoint(ServiceCatalogService serviceCatalogService, String qname) throws ServiceException {
		//We are getting a specific Catalog Service
		CatalogService catalogService = serviceCatalogService.getServiceEndPoint(qname);
		return catalogService;
	}
	
	
	
	
}

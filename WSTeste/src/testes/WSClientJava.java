package testes;
import java.io.StringReader;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.Cadastro;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.CadastroInfoRequest;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira.IEFinanceira;
import br.com.bovespa.sinacor_informacaoapoio_integration_service_owner_public_contracts_efinanceira_integrationentity.MovimentoResponse;

public class WSClientJava {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		CadastroInfoRequest request = new CadastroInfoRequest();
		
		request.setAnalitico(false);
		request.setCodigoEmpresa(308);
		
		
		GregorianCalendar calIni = new GregorianCalendar(2016, 01, 01);
		GregorianCalendar calFim = new GregorianCalendar(2016, 01, 02);
		
		XMLGregorianCalendar dateIni = null;
		XMLGregorianCalendar dateFim = null;
		
		try 
		{
			dateIni = DatatypeFactory.newInstance().newXMLGregorianCalendar(calIni);
			dateFim = DatatypeFactory.newInstance().newXMLGregorianCalendar(calFim);			
			
		} catch (DatatypeConfigurationException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JAXBElement<XMLGregorianCalendar> jaxBElementGregorian = new JAXBElement<XMLGregorianCalendar>(
				new QName(XMLGregorianCalendar.class.getSimpleName()), XMLGregorianCalendar.class, 
                null, dateFim);
								
		
		request.setDataInicio(dateIni);		
		request.setDataFinal(jaxBElementGregorian);
		
		Cadastro cad = new Cadastro();
		
		IEFinanceira port = cad.getWSHttpBindingIEFinanceira();
		
		Boolean result = false;
		
		try
		{			
			result = port.authenticate("clear\\mateus.escudero", "123mudar#", 308);
			
			//ArrayOfstring array = port.consultaDeclaradosBmf(308);
			
			MovimentoResponse movRes = port.consultaMovBovespa(request);			
			//ArrayOfstring arrayTodos = port.consultaDeclaradosCFCCBOVBMF(308);
			//CadastroInfoResponse response = port.consultaCadastro(request);;
			movRes.getDadosBovespa().getValue().getKeyValueOfstringMovimentacaoBovespayxntLrBJ().get(0);
			JAXBContext context = JAXBContext.newInstance(MovimentoResponse.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			
		} catch (Exception ex) {
			ex.printStackTrace();		

		}
	}

}

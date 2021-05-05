package Adapters;

import Abstract.CheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean checkIfRealPerson(Member member) {
		try {
			KPSPublicSoap client=new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(member.getNationalityID()),member.getFirstName().toUpperCase(),
				member.getLastName().toUpperCase(),member.getBirthOfDay().getYear());
		}
		catch(Exception ex)
		{
			
		}
		return false;
	}

}

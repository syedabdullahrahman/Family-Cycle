package FamilyAssistance.kazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KaziService {
	
	@Autowired
	KaziRepository kaziRepository;

	public KaziService() {
	}

	public Kazi getKazi(String license) {

		return kaziRepository.findByKaziLicenceNumber(license);
	}

	public Kazi getKaziByUserNameandPassword(String email,String password){

		return kaziRepository.findByKaziEmailAndKaziPassword(email,password);
	}

	
	public Iterable<Kazi> getAll(){
		//ArrayList<Kazi> l = new ArrayList<>();
		//kazirepo.findAll().forEach(l::add);
		//return l;
		//return k;
		return kaziRepository.findAll();
	}

	public String addkazi(Kazi temp) {
//		FamilyAssistance.put(temp.id,temp);
//		k.add(temp);
		if (!getKazi(temp.kaziLicenceNumber).getKaziEmail().equals("")) return "Kazi Exists";
		kaziRepository.save(temp);
		return "Success";
	}

	public void updateKazi(Kazi temp,Long id) {

	}

	public void deleteKazi(Kazi temp, Long id) {

	}
}

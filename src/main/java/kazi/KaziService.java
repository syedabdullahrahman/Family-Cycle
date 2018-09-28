package kazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaziService {
	
	@Autowired
	KaziRepository kaziRepository;

	public KaziService() {
	}

	public List<Kazi> getKazi(Long licenceno) {
		
		return kaziRepository.findByKaziLicenceNumber(licenceno);
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
//		root.put(temp.id,temp);
//		k.add(temp);
		if(!getKazi(temp.kaziLicenceNumber).isEmpty()) return "Kazi Exists";
		kaziRepository.save(temp);
		return "Success";
	}

	public void updateKazi(Kazi temp,Long id) {

	}

	public void deleteKazi(Kazi temp, Long id) {

	}
}

package kazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kazi")
public class KaziController {

	@Autowired  //need dependecy injection
	KaziService ks;
	
	
//	public KaziController() {       //use contructor or autowire annotation
//		ks = new KaziService();
//		area = new Address();
//	}
	

	@RequestMapping("/all")
	public Iterable<Kazi> getAll_array(){
		return ks.getAll();
	}

	@RequestMapping("{id}")  //{} er moddhe variable lekhe //@pathvariable er sathe {} mil thakte hobe
	public List<Kazi> getPerson(@PathVariable("id") Long id) {
		//lambda expression diya oo kemne jani kore !!!
		return ks.getKazi(id);
	}

	//localhost:8080/main/login/Mahboob%20Hasan/1 etc...
	@RequestMapping("/login/{email}/{password}")
	public Kazi getKaziByName(@PathVariable("email") String email,@PathVariable("password") String password){
		return ks.getKaziByUserNameandPassword(email,password);
	}


//	//localhost:8080/main/byname?id=1&name=Mahboob%20Hasan etc...
//	@RequestMapping(value = "/byname",params = {"id","name"})
//	public List<Kazi> getKaziByName(@RequestParam("name") String name, @RequestParam("id") Long id){
//		return ks.getKaziByName(name,id);
//	}

	//@RequestMapping("/main")

	@RequestMapping(method=RequestMethod.POST, value="/addkazi")  //specify the method otherwise default GET method work
	public Object addKazi(@RequestBody Kazi temp) { //requestbody theke object ta niyo pls.
		return "{ \"registration\":\""+ks.addkazi(temp)+"\"}";

	}

	@RequestMapping(method=RequestMethod.PUT, value="/updatekazi/{id}")                //value="/updatekazi/{foo}
	public String updateKazi(@RequestBody Kazi temp, @PathVariable long id) {        //@PathVariable("foo") String id    //erokm oo chole
		ks.updateKazi(temp,id);
		return "Successful Update Operation";
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deletekazi/{id}")
	public String deleteKazi(@RequestBody Kazi temp, @PathVariable long id) {
		ks.deleteKazi(temp,id);
		return "Successful Delete Operation";
		
	}
	
}

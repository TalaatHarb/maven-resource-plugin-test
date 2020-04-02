package net.talaatharb.mavenresources.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.talaatharb.mavenresources.model.Person;

@RestController
public class PersonController {

	@Value("${newdatabase.url}")
	private String url;

	@GetMapping(path = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person getPerson() {
		System.out.println(url);
		final Person p = new Person();
		p.setId(74747);
		p.setName("Mohamed");
		return p;
	}
}

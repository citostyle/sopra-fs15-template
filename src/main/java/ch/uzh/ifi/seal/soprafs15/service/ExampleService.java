package ch.uzh.ifi.seal.soprafs15.service;

import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleService {

	public String doLogic(String a, String b) {
		return a + b;
	}
}

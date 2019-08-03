package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.SaleskenService;

@RestController
public class SakeskenController {

	@Autowired
	SaleskenService service;
	
	@PostMapping("/encode")
    public String encode(@RequestParam(value="statements") String[] input) {
        return service.encode(input);
    }
}

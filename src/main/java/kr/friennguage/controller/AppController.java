package kr.friennguage.controller;

import kr.friennguage.dto.FLRequest;
import kr.friennguage.dto.FLResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flng")
public class AppController {
	@RequestMapping(value = "/user")
	public FLResponse mappingCode(@RequestBody FLRequest request) {
		
		
		return null;
	}
}

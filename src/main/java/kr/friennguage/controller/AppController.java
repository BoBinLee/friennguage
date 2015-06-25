package kr.friennguage.controller;

import kr.friennguage.dto.FL0001;
import kr.friennguage.dto.FL0002;
import kr.friennguage.dto.FL0003;
import kr.friennguage.dto.FL0004;
import kr.friennguage.dto.FL0005;
import kr.friennguage.dto.FL0006;
import kr.friennguage.dto.FL0007;
import kr.friennguage.dto.FL0008;
import kr.friennguage.dto.FLRequest;
import kr.friennguage.dto.FLResponse;
import kr.friennguage.dto.PS0001;
import kr.friennguage.dto.PS0002;
import kr.friennguage.service.AppService;
import kr.friennguage.util.JacksonUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flng")
public class AppController {
	@Autowired
	private AppService appService;

	@RequestMapping(value = "/code")
	public FLResponse mappingCode(@RequestBody FLRequest request) {
		FLRequest.Code code = FLRequest.Code.valueOf(request.tranCd);

		String json = JacksonUtils.objectToJson(request.tranData);
		FLResponse response = null;

//		if (!code.equals(FLRequest.Code.FL0001)) {
			// String token =
//		}

		switch (code) {
		case FL0001:
			FL0001 fl0001 = JacksonUtils.jsonToObject(json, FL0001.class);
			response = appService.fl0001Service(fl0001);
			break;
		case FL0002:
			FL0002 fl0002 = JacksonUtils.jsonToObject(json, FL0002.class);
			response = appService.fl0002Service(fl0002);
			break;
		case FL0003:
			FL0003 fl0003 = JacksonUtils.jsonToObject(json, FL0003.class);
			response = appService.fl0003Service(fl0003);
			break;
		case FL0004:
			FL0004 fl0004 = JacksonUtils.jsonToObject(json, FL0004.class);
			response = appService.fl0004Service(fl0004);
			break;
		case FL0005:
			FL0005 fl0005 = JacksonUtils.jsonToObject(json, FL0005.class);
			response = appService.fl0005Service(fl0005);
			break;
		case FL0006:
			FL0006 fl0006 = JacksonUtils.jsonToObject(json, FL0006.class);
			response = appService.fl0006Service(fl0006);
			break;
		case FL0007:
			FL0007 fl0007 = JacksonUtils.jsonToObject(json, FL0007.class);
			response = appService.fl0007Service(fl0007);
			break;
		case FL0008:
			FL0008 fl0008 = JacksonUtils.jsonToObject(json, FL0008.class);
			response = appService.fl0008Service(fl0008);
			break;
		case PS0001:
			PS0001 ps0001 = JacksonUtils.jsonToObject(json, PS0001.class);
			response = appService.ps0001Service(ps0001);
			break;
		case PS0002:
			PS0002 ps0002 = JacksonUtils.jsonToObject(json, PS0002.class);
			response = appService.ps0002Service(ps0002);
			break;
		default:
			break;
		}

		return response;
	}
}

package kr.friennguage;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import kr.friennguage.dto.FL0001;
import kr.friennguage.dto.FLRequest;
import kr.friennguage.util.JacksonUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FriennguageApplication.class)
public class ControllerTests {
	private MockMvc mockMvc;

	@Autowired
	protected WebApplicationContext wac;

	@Autowired
	Environment environment;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
	}

	@Test
	public void fl0001() throws Exception {
		FLRequest<FL0001> req = new FLRequest<FL0001>();

		req.tranCd = "FL0001";
		FL0001 fl = new FL0001();

		req.tranData = fl;

		System.out.println(JacksonUtils.<FLRequest<FL0001>> objectToJson(req));
		this.<FL0001> printJson(req);
	}

	public <T> void printJson(FLRequest<T> req) {
		try {
			this.mockMvc.perform(
					post("/flng/code").contentType(MediaType.APPLICATION_JSON).content(
							JacksonUtils.<FLRequest<T>> objectToJson(req).getBytes())).andDo(print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

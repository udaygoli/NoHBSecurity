package com.uday;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.uday.controller.JsonXmlResponse;
import com.uday.info.TimeInfo;

@ContextConfiguration(classes = NoHbSecurityApplication.class)
@SpringBootTest
class NoHbSecurityApplicationTests {
	
	@Autowired
	private JsonXmlResponse jsonXmlResponse;

	@Test
	void contextLoads() {
		TimeInfo timeInfo = new TimeInfo();
		timeInfo.setTime("time");
		
		TimeInfo time = jsonXmlResponse.jsonXmlRes();
		assertThat(timeInfo.getTime()).isEqualTo(time.getTime());
	}

}

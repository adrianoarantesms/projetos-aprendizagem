package com.algaworks.cobranca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.motorcontrolApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = motorcontrolApplication.class)
@WebAppConfiguration
public class CobrancaApplicationTests {

	@Test
	public void contextLoads() {
	}

}

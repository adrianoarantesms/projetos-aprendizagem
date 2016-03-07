package com.controle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.project.MotoControlApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MotoControlApplication.class)
@WebAppConfiguration
public class MotoControlApplicationTests {

	@Test
	public void contextLoads() {
	}

}

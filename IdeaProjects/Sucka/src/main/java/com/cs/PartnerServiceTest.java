package com.cs;

import com.cs.domain.Partners;
import com.cs.service.PartnerService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class PartnerServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:jpa-app-context.xml");
		ctx.refresh();
		
		System.out.println("App context initialized successfully");
		
		PartnerService partnerService = ctx.getBean("partnerService", PartnerService.class);
		
		List<Partners> partners = partnerService.findAll();
		
		for (Partners partner: partners) {
			System.out.println(partner);
		}

	}

}

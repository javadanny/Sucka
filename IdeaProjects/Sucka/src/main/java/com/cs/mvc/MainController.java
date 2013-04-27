package com.cs.mvc;

import com.cs.domain.Partners;
import com.cs.domain.Teams;
import com.cs.service.PartnerService;
import com.cs.service.TeamService;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
	@RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:jpa-app-context.xml");
        ctx.refresh();

        PartnerService partnerService = ctx.getBean("partnerService", PartnerService.class);
        List<Partners> partners = partnerService.findAll();
        model.addAttribute("partners", partners);
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, params = "teams")
    public String displayTeams(ModelMap model) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:jpa-app-context.xml");
        ctx.refresh();

        TeamService partnerService = ctx.getBean("teamService", TeamService.class);
        List<Teams> teams = partnerService.findAll();
        model.addAttribute("teams", teams);
        return "teams";
    }

}
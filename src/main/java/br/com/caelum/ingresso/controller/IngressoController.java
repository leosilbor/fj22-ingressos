package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.IngressoDao;

@Controller
public class IngressoController {


	@Autowired
	private IngressoDao ingressoDao;
	
    @GetMapping(value="/admin/ingressos")
    public ModelAndView lista(){

        ModelAndView modelAndView = new ModelAndView("venda/lista");

        modelAndView.addObject("ingressos", ingressoDao.findAll());

        return modelAndView;
    }



}

package com.coder.spring.data;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.spring.entity.Customer;

@Controller
public class SpringController {

	//Set the initBinder StringTrimmer for validate white spaces in the form.
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor sEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, sEditor);
	}
	
	
	@RequestMapping("/")
	public String sendToHome() {
		return "home-page";
	}
	
	@GetMapping("/customer")
	public String sendToCostumer(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@PostMapping("/customerProcess")
	public String sendToCostumerConfirmation(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult bindingResult) {
			
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}
	
}





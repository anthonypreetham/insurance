package com.staragile.insurance.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {
	@Autowired
	Policyservice PolicyService;
	@RequestMapping("hello")
	public String doSomething() {
		return "hello world!!!";
		
	}
	@RequestMapping("/policy/{id}")
	public Optional<policy> getpolicy(@PathVariable String id){
		System.out.println("Inside getPolicy");
		return PolicyService.getPolicy(id);
	}
	
	
	
	@RequestMapping("/policy")
	public List<policy> getpolicies(){
		return PolicyService.getpolicies();
		
	
	}
	@RequestMapping(method=RequestMethod.POST, value="/policy")
	public String addPolicy(@RequestBody policy Policy) {
		PolicyService.addPolicy(Policy);
		return "sucessfully added";
	}
	@RequestMapping(method=RequestMethod.PUT, value="/policy/{id}")
	public String updatePolicy(@RequestBody policy Policy, @PathVariable String id) {
		PolicyService.updatePolicy(id, Policy);
		return "updated sucessfully";
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/policy/{id}")
	public String deletePolicy( @PathVariable String id) {
		PolicyService.deletePolicy(id);
		return "updated sucessfully";
	}
	
	
	
}

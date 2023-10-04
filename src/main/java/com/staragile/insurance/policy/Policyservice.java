package com.staragile.insurance.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Policyservice{
	   
	@Autowired
	PolicyDAORepositry policyDAORepositry;
	
	
	public List<policy> getpolicies(){
		/*return Arrays.asList(
				new policy("9900","anthony","madikeri","9900351155"),
				new policy("9900","anthony","madikeri","9900351155"),
				new policy("9900","anthony","madikeri","9900351155")
				
				);*/
		List<policy> policyList = new ArrayList<policy>();
		policyDAORepositry.findAll().forEach(policyList::add);
		return policyList;
	}
	public Optional<policy> getPolicy(String id){
		return policyDAORepositry.findById(id);
	}
	
	
	
	
	
	public void addPolicy(policy Policy) {
		policyDAORepositry.save(Policy);
	}
	public void updatePolicy(String id, policy Policy) {
		policyDAORepositry.save(Policy);	
	}
	public void deletePolicy(String id) {
		policyDAORepositry.deleteById(id);
	}
	
	

}

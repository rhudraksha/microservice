package rhudraksha.projects.microservices.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rhudraksha.projects.microservices.loans.model.Customer;
import rhudraksha.projects.microservices.loans.model.Loan;
import rhudraksha.projects.microservices.loans.repository.LoanRepository;

@RestController		
public class LoanController {

	@Autowired
	LoanRepository loanRepository;
	
	@PostMapping("/myLoan")
	public List<Loan> getLoanDetails(@RequestBody Customer customer)
	{
		List<Loan> loan = loanRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
		if(loan == null)
			return null;
		return loan;
		
	}
}

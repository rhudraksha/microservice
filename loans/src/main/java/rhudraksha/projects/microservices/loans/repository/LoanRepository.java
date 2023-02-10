package rhudraksha.projects.microservices.loans.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rhudraksha.projects.microservices.loans.model.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {
	List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);
}

package com.ing.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ing.bank.entity.FundTransfer;
import com.ing.bank.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select c.accountNo from User c where accountNo!=:accountnumber")
	List<Integer> getAccountNumbers(@Param("accountnumber") Long accountNo);

}

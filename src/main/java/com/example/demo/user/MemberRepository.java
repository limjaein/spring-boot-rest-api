package com.example.demo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository 
		extends JpaRepository<Member, Long>{
		
	@Query("SELECT m FROM Member m WHERE m.name = ?1")
	Optional<Member> findMemberByName(String name);
}

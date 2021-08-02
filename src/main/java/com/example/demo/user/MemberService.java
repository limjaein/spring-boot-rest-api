package com.example.demo.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	private final MemberRepository memberRepository;
	
	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	public List<Member> getMembers() {
		return memberRepository.findAll();
	}

	public void addNewMember(Member member) {
		Optional<Member> memberOptional = memberRepository.findMemberByName(member.getName());
		
		if (memberOptional.isPresent()) {
			throw new IllegalStateException("name taken");
		}
		memberRepository.save(member);
		System.out.println(member);
	}
}

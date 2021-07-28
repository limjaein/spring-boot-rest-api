package com.example.demo.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {
	
	@Bean
	CommandLineRunner commanLineRunner(
			MemberRepository repository) {
		return args -> {
			Member limjaein = new Member(
					"limjaein",
					"pwd",
					LocalDate.of(1996, Month.NOVEMBER, 27)
			);
			

			Member enan = new Member(
					"enan",
					"pwdpwd",
					LocalDate.of(1996, Month.MARCH, 11)
			);
			
			repository.saveAll(
					List.of(limjaein, enan)
			);
		};
	}
}

package com.spring.server.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 주기적으로 publish 하기 위해 필요. Sender.class의 send() 메소드 => @Scheduled
public class TransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferApplication.class, args);
	}

}

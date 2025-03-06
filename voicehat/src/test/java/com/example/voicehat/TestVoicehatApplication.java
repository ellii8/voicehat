package com.example.voicehat;

import org.springframework.boot.SpringApplication;

public class TestVoicehatApplication {

	public static void main(String[] args) {
		SpringApplication.from(VoicehatApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

package com.buyou.BuYou;

import com.buyou.BuYou.service.MassiveUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
public class BuYouApplication {

	@Autowired
	private MassiveUploadService massiveUploadService;

	public static void main(String[] args) {
		SpringApplication.run(BuYouApplication.class, args);
	}

	@PostConstruct
	public void massiveUpload() throws IOException {
		this.massiveUploadService.uploadEntities();
	}

}

package com.ecews.mqlamisplus;

import com.ecews.mqlamisplus.Repository.PersonRepo.PersonRepo;
import com.ecews.mqlamisplus.Repository.hivrepo.ArtClinicalRepo;
import com.ecews.mqlamisplus.Repository.hivrepo.HIVStatusTrackerRepo;
import com.ecews.mqlamisplus.Repository.hts.HtsClientRepo;
import com.ecews.mqlamisplus.Repository.pmtc.InfantPCRTestRepo;
import com.ecews.mqlamisplus.config.MessagingConfig;

import com.ecews.mqlamisplus.entity.models.Person.Encounter;
import com.ecews.mqlamisplus.service.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;

import java.util.List;


@SpringBootApplication

public class MqlamisplusApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(MqlamisplusApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {

	}


}

package com.ecews.mqlamisplus;

import com.ecews.mqlamisplus.Repository.PersonRepo.PersonRepo;
import com.ecews.mqlamisplus.Repository.hivrepo.ArtClinicalRepo;
import com.ecews.mqlamisplus.Repository.hivrepo.HIVStatusTrackerRepo;
import com.ecews.mqlamisplus.Repository.hivrepo.HtsClientRepo;
import com.ecews.mqlamisplus.config.MessagingConfig;

import com.ecews.mqlamisplus.models.hiv.*;
import com.ecews.mqlamisplus.models.hiv.HIVEac;
import com.ecews.mqlamisplus.models.hts.HtsClient;
import com.ecews.mqlamisplus.models.hts.IndexElicitation;
import com.ecews.mqlamisplus.models.triage.VitalSign;
import com.ecews.mqlamisplus.service.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;

import com.ecews.mqlamisplus.models.hiv.ARTClinical;
import java.util.List;


@SpringBootApplication

public class MqlamisplusApplication implements ApplicationRunner {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PersonService personService;

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private VisitService visitService;


	@Autowired
	private BiometricService biometricService;

	@Autowired
	private ArtPharmacyService artPharmacyService;

	@Autowired
	private VitalSignService vitalSignService;

	@Autowired
	private HivDrugService hivDrugService;

	@Autowired
	private RegimenTypeService regimenTypeService;

	@Autowired
	private RegimenService regimenService;

	@Autowired
	private HivEnrollmentService hivEnrollmentService;

	@Autowired
	private ArtClinicalRepo artClinicalRepo;

	@Autowired
	private ArtClinicalService artClinicalService;

	@Autowired
	private HIVEacService hivEacService;

	@Autowired
	private EacOutComeService eacOutComeService;

	@Autowired
	private  HIVEacSessionService hivEacSessionService;

	@Autowired
	private  ObservationService observationService;


	@Autowired
	private  HIVStatusTrackerService hivStatusTrackerService;

	@Autowired
	private HIVStatusTrackerRepo hivStatusTrackerRepo;

	@Autowired
	private PatientTrackerService patientTrackerService;

	@Autowired
	private  IndexElicitationService indexElicitationService;

	@Autowired
	private HtsClientRepo htsClientRepo;

	@Autowired
	private HtsClientService htsClientService;






	public static void main(String[] args) {
		SpringApplication.run(MqlamisplusApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		// This code will be executed after the application starts
		// Perform your database operation here
///////////////////////////////////////////////--------PERSON--------------------///////////////////////////////////////////////////////////////////

//		List<Person> persons = personService.getAllPersonsFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ persons.size()+ " Persons in the Db");
//		// Do something with the retrieved persons
//		for (Person person : persons) {
//			System.out.println(">>>>>>>>> Person is being Printed with firstname and id " + person.getFirstName() +" "+ person.getUuid());
//		}
//
//		for (Person person : persons) {
//
//			template.convertAndSend(MessagingConfig.PATIENTEXCHANGE, MessagingConfig.PATIENTROUTING_KEY,person);
//
//			System.out.println(">>>>>>>>>>>>> Person is being Printed " +person.getFirstName());
//		}


//////////////////////////////////////////////--------VISIT--------------//////////////////////////////////////////////////////////////////////

//		List<Visit> visits = visitService.getAllVisitsFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ visits.size()+ " visits in the Db");
//		// Do something with the retrieved persons
//		for (Visit visit : visits) {
//			System.out.println(">>>>>>>>>>>>> Visit is being Printed" +visit.getUuid());
//		}
//
//		for (Visit visit : visits) {
//
//			template.convertAndSend(MessagingConfig.VISITEXCHANGE, MessagingConfig.VISIT_ROUTING_KEY,visit);
//
//			System.out.println(">>>>>>>>>>>>> Visit is being Printed " +visit.getUuid());
//		}

//////////////////////////////////////////////////////--------BIOMETRIC-------------/////////////////////////////////////////////////////////////////

//		List<Biometric> biometrics = biometricService.getAllBiometricFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ biometrics.size()+ " Biometric in the Db");
//		// Do something with the retrieved persons
//		for (Biometric biometric : biometrics) {
//			System.out.println(">>>>>>>>>>>>> Biometric is being Printed" +biometric.getPersonUuid());
//		}
//
//		for (Biometric biometric : biometrics) {
//
//			template.convertAndSend(MessagingConfig.BIOMETRICEXCHANGE, MessagingConfig.BIOMETRICROUTING_KEY,biometric);
//
//			System.out.println(">>>>>>>>>>>>> Biometric is being Printed " +biometric.getPersonUuid());
//		}

///////////////////////////////////////////////////-----------------hiv_art_pharmacy-------------------////////////////////////////////////////////////////////////////////////

//		List<ArtPharmacy> artPharmacies = artPharmacyService.getAllArtPharmacyFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ artPharmacies.size()+ " artPharmacies in the Db");
//		// Do something with the retrieved persons
//		for (ArtPharmacy artPharmacy : artPharmacies) {
//			System.out.println(">>>>>>>>>>>>> ArtPharmacy is being Printed" +artPharmacy.getUuid());
//		}
//
//		for (ArtPharmacy artPharmacy : artPharmacies) {
//
//			template.convertAndSend(MessagingConfig.ARTPHARMACYEXCHANGE, MessagingConfig.ARTPHARMACY_ROUTING_KEY,artPharmacy);
//
//			System.out.println(">>>>>>>>>>>>> ArtPharmacy is being Printed " +artPharmacy.getUuid());
//		}

		///////////////////////////////////-------------Triage-VitalSign------------------//////////////////////////////////////////////////////////////////////



//
//		List<VitalSign> vitalSigns = vitalSignService.getVitalSignsFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ vitalSigns.size()+ " vitalSigns in the Db");
//		// Do something with the retrieved persons
//		for (VitalSign vitalSign : vitalSigns) {
//			System.out.println(">>>>>>>>>>>>> VitalSign is being Printed" +vitalSign.getUuid());
//		}
//
//		for (VitalSign vitalSign : vitalSigns) {
//
//			template.convertAndSend(MessagingConfig.VITALSIGNEXCHANGE, MessagingConfig.VITALSIGN_ROUTING_KEY,vitalSign);
//
//			System.out.println(">>>>>>>>>>>>> VitalSign is being Printed " +vitalSign.getUuid());
//		}

		///////////////////////////////////////////////////////////-------HIVDrug-----------------/////////////////////////////////////////////////////////////////

//		List<HIVDrug> hivDrugs = hivDrugService.getHivDrugsFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ hivDrugs.size()+ " hivdrugs in the Db");
//		// Do something with the retrieved persons
//		for (HIVDrug hivDrug : hivDrugs) {
//			System.out.println(">>>>>>>>>>>>> HIVDrugs is being Printed" +hivDrug.getAbbrev());
//		}
//
//		for (HIVDrug hivDrug : hivDrugs) {
//
//			template.convertAndSend(MessagingConfig.HIVDRUGEXCHANGE, MessagingConfig.HIVDRUG_ROUTING_KEY,hivDrug);
//
//			System.out.println(">>>>>>>>>>>>> HIVDrugs is being Printed " +hivDrug.getAbbrev());
//		}





		//////////////////////////////////////////////////////////---HIVREGIMENTYPE-------////////////////////////////////////////////////////////////////////////////////


//		List<RegimenType> regimenTypes = regimenTypeService.getAllRegimenTypeFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ regimenTypes.size()+ " RegimenTypes in the Db");
//		// Do something with the retrieved persons
//		for (RegimenType regimenType : regimenTypes) {
//			System.out.println(">>>>>>>>>>>>> RegimenType is being Printed" +regimenType.getDescription());
//		}
//
//		for (RegimenType regimenType : regimenTypes) {
//
//			template.convertAndSend(MessagingConfig.ARTPHARMACYEXCHANGE, MessagingConfig.ARTPHARMACY_ROUTING_KEY,regimenType);
//
//			System.out.println(">>>>>>>>>>>>> RegimenType is being Printed " +regimenType.getDescription());
//		}


		///////////////////////////////////////////////////////////////--------HIVREGIMEN------/////////////////////////////////////////////////////////////


//
//		List<Regimen> regimens = regimenService.getAllRegimenTypeFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ regimens.size()+ " Regimens in the Db");
//		// Do something with the retrieved persons
//		for (Regimen regimen : regimens) {
//			System.out.println(">>>>>>>>>>>>> RegimenType is being Printed" +regimen.getDescription());
//		}
//
//		for (Regimen regimen : regimens) {
//
//			template.convertAndSend(MessagingConfig.REGIMENEXCHANGE, MessagingConfig.REGIMEN_ROUTING_KEY,regimen);
//
//			System.out.println(">>>>>>>>>>>>> RegimenType is being Printed " +regimen.getDescription());
//		}





		///////////////////////////////////////////////////-------HIVENROLLMENT------------/////////////////////////////////////////////////////////////////////////////


//
//		List<HivEnrollment> hivEnrollments = hivEnrollmentService.getHivDrugsFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ hivEnrollments.size()+ " hivenrollment in the Db");
//		// Do something with the retrieved persons
//		for (HivEnrollment hivEnrollment : hivEnrollments) {
//			System.out.println(">>>>>>>>>>>>> HIVEnrollment is being Printed" +hivEnrollment.getUuid());
//		}
//
//		for (HivEnrollment hivEnrollment : hivEnrollments) {
//
//			template.convertAndSend(MessagingConfig.HIVENROLLMENTEXCHANGE, MessagingConfig.HIVENROLLMENT_ROUTING_KEY,hivEnrollment);
//
//			System.out.println(">>>>>>>>>>>>> HIVEnrollment is being Printed " +hivEnrollment.getUuid());
//		}

		///////////////////////////////////////////////////------HIV_ART_CLINICAL--------------//////////////////////////////////////////////////////////////////////////


//
//		List<ARTClinical> artClinicals = artClinicalService.getArtClinicalFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ artClinicals.size()+ " hivenrollment in the Db");
//		// Do something with the retrieved persons
//		for (ARTClinical artClinical : artClinicals) {
//			System.out.println(">>>>>>>>>>>>> ARTClinical is being Printed" +artClinical.getUuid());
//		}
//
//		for (ARTClinical artClinical : artClinicals) {
//
//			template.convertAndSend(MessagingConfig.HIVARTCLINICALEXCHANGE, MessagingConfig.HIVARTCLINICALROUTINGKEY,artClinical);
//
//			System.out.println(">>>>>>>>>>>>> ARTClinical is being Printed " +artClinical.getUuid());
//		}


//////////////////////////////////////////////////////////---------HIVEac-----------/////////////////////////////////////////////////////////////////////////////

//
//		List<HIVEac> hivEacs = hivEacService.getHIVEacFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ hivEacs.size()+ " hivenrollment in the Db");
//		// Do something with the retrieved persons
//		for (HIVEac hivEac : hivEacs) {
//			System.out.println(">>>>>>>>>>>>> HIVEac is being Printed" +hivEac.getUuid());
//		}
//
//		for (HIVEac hivEac : hivEacs) {
//
//			template.convertAndSend(MessagingConfig.HIVEACEXCHANGE, MessagingConfig.HIVEACROUTINGKEY,hivEac);
//
//			System.out.println(">>>>>>>>>>>>> HIVEac is being Printed " +hivEac.getUuid());
//		}



		//////////////////////////////////////////////////////-------EAC_OUT_COME-----------///////////////////////////////////////////////////////////////////////////



//		List<EacOutCome> eacOutComes = eacOutComeService.getEacOutComeFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ eacOutComes.size()+ " EacOutCome in the Db");
//		// Do something with the retrieved persons
//		for (EacOutCome eacOutCome : eacOutComes) {
//			System.out.println(">>>>>>>>>>>>> EacOutCome is being Printed" +eacOutCome.getUuid());
//		}
//
//		for (EacOutCome eacOutCome : eacOutComes) {
//
//			template.convertAndSend(MessagingConfig.EACOUTCOMEEXCHANGE, MessagingConfig.EACOUTCOMEROUTINGKEY,eacOutCome);
//
//			System.out.println(">>>>>>>>>>>>> EacOutCome is being Printed " +eacOutCome.getUuid());
//		}
//
//		//////////////////////////////////////////////////////-------HIV_EAC_SESSION-----------///////////////////////////////////////////////////////////////////////////
//
//
//
//		List<HIVEacSession> hivEacSessions = hivEacSessionService.getHIVEacSessionFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ hivEacSessions.size()+ " HIVEacSession in the Db");
//		// Do something with the retrieved persons
//		for (HIVEacSession hivEacSession : hivEacSessions) {
//			System.out.println(">>>>>>>>>>>>> HIVEacSession is being Printed" +hivEacSession.getUuid());
//		}
//
//		for (HIVEacSession hivEacSession : hivEacSessions) {
//
//			template.convertAndSend(MessagingConfig.HIVEACSESSIONEXCHANGE, MessagingConfig.HIVEACSESSIONROUTINGKEY,hivEacSession);
//
//			System.out.println(">>>>>>>>>>>>> HIVEacSession is being Printed " +hivEacSession.getUuid());
//		}


		//////////////////////////////////////////////////////-------OBSERVATION-----------///////////////////////////////////////////////////////////////////////////


//
//		List<Observation> observations = observationService.getObservationFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ observations.size()+ " Observation in the Db");
//		// Do something with the retrieved persons
//		for (Observation observation : observations) {
//			System.out.println(">>>>>>>>>>>>> Observation is being Printed" +observation.getUuid());
//		}
//
//		for (Observation observation : observations) {
//
//			template.convertAndSend(MessagingConfig.OBSERVATIONEXCHANGE, MessagingConfig.OBSERVATIONROUTINGKEY,observation);
//
//			System.out.println(">>>>>>>>>>>>> Observation is being Printed " +observation.getUuid());
//		}

		//////////////////////////////////////////////////////-------HIV_STATUS_TRACKER-----------///////////////////////////////////////////////////////////////////////////



//		List<HIVStatusTracker> hivStatusTrackers = hivStatusTrackerService.getHivStatusTrackerFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ hivStatusTrackers.size()+ " HIVStatusTracker in the Db");
//		// Do something with the retrieved persons
//		for (HIVStatusTracker hivStatusTracker : hivStatusTrackers) {
//			System.out.println(">>>>>>>>>>>>> HIVStatusTracker is being Printed" +hivStatusTracker.getUuid());
//		}
//
//		for (HIVStatusTracker hivStatusTracker : hivStatusTrackers) {
//
//			template.convertAndSend(MessagingConfig.HIVSTATUSTRACKEREXCHANGE, MessagingConfig.HIVSTATUSTRACKERROUTINGKEY,hivStatusTracker);
//
//			System.out.println(">>>>>>>>>>>>> HIVStatusTracker is being Printed " +hivStatusTracker.getUuid());
//		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<PatientTracker> patientTrackers = patientTrackerService.getpatientTrackerFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ patientTrackers.size()+ " PatientTracker in the Db");
//		// Do something with the retrieved persons
//		for (PatientTracker patientTracker : patientTrackers) {
//			System.out.println(">>>>>>>>>>>>> PatientTracker is being Printed" +patientTracker.getUuid());
//		}
//
//		for (PatientTracker patientTracker : patientTrackers) {
//
//			template.convertAndSend(MessagingConfig.PATIENTTRACKEREXCHANGE, MessagingConfig.PATIENTTRACKERROUTINGKEY,patientTracker);
//
//			System.out.println(">>>>>>>>>>>>> PatientTracker is being Printed " +patientTracker.getUuid());
//		}



		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<IndexElicitation> indexElicitations = indexElicitationService.getindexElicitationsFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ indexElicitations.size()+ " IndexElicitation in the Db");
//		// Do something with the retrieved persons
//		for (IndexElicitation indexElicitation : indexElicitations) {
//			System.out.println(">>>>>>>>>>>>> IndexElicitation is being Printed" +indexElicitation.getUuid());
//		}
//
//		for (IndexElicitation indexElicitation : indexElicitations) {
//
//			template.convertAndSend(MessagingConfig.INDEXELICITATIONEXCHANGE, MessagingConfig.INDEXELICITATIONROUTINGKEY,indexElicitation);
//
//			System.out.println(">>>>>>>>>>>>> IndexElicitation is being Printed " +indexElicitation.getUuid());
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		List<HtsClient> htsClients = htsClientService.gethtsClientFromLamisPlusDb();



		System.out.println("There are "+ htsClients.size()+ " IndexElicitation in the Db");
		// Do something with the retrieved persons
		for (HtsClient htsClient : htsClients) {
			System.out.println(">>>>>>>>>>>>> HtsClient is being Printed" +htsClient.getUuid());
		}

		for (HtsClient htsClient : htsClients) {

			template.convertAndSend(MessagingConfig.HTSCLIENTEXCHANGE, MessagingConfig.HTSCLIENTROUTINGKEY,htsClient);

			System.out.println(">>>>>>>>>>>>> HtsClient is Queing now " +htsClient.getUuid());
		}


	}



}

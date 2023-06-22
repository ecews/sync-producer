package com.ecews.mqlamisplus;

import com.ecews.mqlamisplus.Repository.PersonRepo.PersonRepo;
import com.ecews.mqlamisplus.Repository.hivrepo.ArtClinicalRepo;
import com.ecews.mqlamisplus.Repository.hivrepo.HIVStatusTrackerRepo;
import com.ecews.mqlamisplus.Repository.hts.HtsClientRepo;
import com.ecews.mqlamisplus.Repository.lims.LIMManifestSRepo;
import com.ecews.mqlamisplus.Repository.pmtc.InfantPCRTestRepo;
import com.ecews.mqlamisplus.Repository.pmtc.PmtctEnrollmentRepo;
import com.ecews.mqlamisplus.config.MessagingConfig;

import com.ecews.mqlamisplus.models.Person.Encounter;
import com.ecews.mqlamisplus.models.hts.IndexElicitation;
import com.ecews.mqlamisplus.models.hts.RiskStratification;
import com.ecews.mqlamisplus.models.laboratory.LabOrder;
import com.ecews.mqlamisplus.models.laboratory.Result;
import com.ecews.mqlamisplus.models.laboratory.Sample;
import com.ecews.mqlamisplus.models.laboratory.Test;
import com.ecews.mqlamisplus.models.lims.LIMSManifest;
import com.ecews.mqlamisplus.models.lims.LIMSResult;
import com.ecews.mqlamisplus.models.lims.LIMSSample;
import com.ecews.mqlamisplus.models.pmtc.*;
import com.ecews.mqlamisplus.models.prep.PrepClinic;
import com.ecews.mqlamisplus.models.prep.PrepEligibility;
import com.ecews.mqlamisplus.models.prep.PrepEnrollment;
import com.ecews.mqlamisplus.models.prep.PrepInterruption;
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

	@Autowired
	private RiskStratificationService riskStratificationService;

	@Autowired
	private LabOrderService labOrderService;

	@Autowired
	private ResultService resultService;

	@Autowired
	private SampleService sampleService;

	@Autowired
	private TestService testService;

	@Autowired
	private LIMSManifestService limsManifestService;

	@Autowired
	private LIMSSampleService limManifestService;

	@Autowired
	private LIMSResultService limsResultService;


	@Autowired
	private AncService ancService;

	@Autowired
	private DeliveryService deliveryService;

	@Autowired
	private PmtctEnrollmentService pmtctEnrollmentService;

	@Autowired
	private InfantArvService infantArvService;

	@Autowired
	private InfantMotherArtService infantMotherArtService;

	@Autowired
	private InfantPCRTestService infantPCRTestService;

	@Autowired
	private InfantPCRTestRepo infantPCRTestRepo;

	@Autowired
	private  InfantVisitService infantVisitService;

	@Autowired
	private  PmtctVisitService pmtctVisitService;

	@Autowired
	private PrepEligibilityService prepEligibilityService;

	@Autowired
	private PrepEnrollmentService prepEnrollmentService;

	@Autowired
	private PrepClinicService prepClinicService;

	@Autowired
	private PrepInterruptionService prepInterruptionService;


	@Autowired
	private EncounterService encounterService;













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
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<HtsClient> htsClients = htsClientService.gethtsClientFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ htsClients.size()+ " IndexElicitation in the Db");
//		// Do something with the retrieved persons
//		for (HtsClient htsClient : htsClients) {
//			System.out.println(">>>>>>>>>>>>> HtsClient is being Printed" +htsClient.getUuid());
//		}
//
//		for (HtsClient htsClient : htsClients) {
//
//			template.convertAndSend(MessagingConfig.HTSCLIENTEXCHANGE, MessagingConfig.HTSCLIENTROUTINGKEY,htsClient);
//
//			System.out.println(">>>>>>>>>>>>> HtsClient is Queing now " +htsClient.getUuid());
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//
//
//		List<RiskStratification> riskStratifications = riskStratificationService.getRiskStratificationFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ riskStratifications.size()+ " RiskStratification in the Db");
//		// Do something with the retrieved persons
//		for (RiskStratification riskStratification : riskStratifications) {
//			System.out.println(">>>>>>>>>>>>> RiskStratification is being Printed" +riskStratification.getId());
//		}
//
//		for (RiskStratification riskStratification : riskStratifications) {
//
//			template.convertAndSend(MessagingConfig.RISKSTRATIFICATIONEXCHANGE, MessagingConfig.RISKSTRATIFICATIONROUTINGKEY,riskStratification);
//
//			System.out.println(">>>>>>>>>>>>> RiskStratification is being Printed " +riskStratification.getId());
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




//		List<LabOrder> labOrders = labOrderService.getLabOrderFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ labOrders.size()+ " LabOrder in the Db");
//		// Do something with the retrieved LabOrders
//		for (LabOrder labOrder : labOrders) {
//			System.out.println(">>>>>>>>>>>>> LabOrder is being Printed" +labOrder.getId());
//		}
//
//		for (LabOrder labOrder : labOrders) {
//
//			template.convertAndSend(MessagingConfig.LABORDEREXCHANGE, MessagingConfig.LABORDERROUTINGKEY,labOrder);
//
//			System.out.println(">>>>>>>>>>>>> LabOrder is being Printed " +labOrder.getId());
//		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//
//		List<Result> results = resultService.getResultsFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ results.size()+ " Result in the Db");
//		// Do something with the retrieved LabOrders
//		for (Result result : results) {
//			System.out.println(">>>>>>>>>>>>> Result is being Printed" +result.getId());
//		}
//
//		for (Result result : results) {
//
//			template.convertAndSend(MessagingConfig.RESULTEXCHANGE, MessagingConfig.RESULTROUTINGKEY,result);
//
//			System.out.println(">>>>>>>>>>>>> Result is being Printed " +result.getId());
//		}




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//
//		List<Sample> samples = sampleService.getSampleFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ samples.size()+ " Result in the Db");
//		// Do something with the retrieved LabOrders
//		for (Sample sample : samples) {
//			System.out.println(">>>>>>>>>>>>> Sample is being Printed" +sample.getUuid());
//		}
//
//		for (Sample sample : samples) {
//
//			template.convertAndSend(MessagingConfig.SAMPLEEXCHANGE, MessagingConfig.SAMPLEROUTINGKEY,sample);
//
//			System.out.println(">>>>>>>>>>>>> Result is being Printed " +sample.getUuid());
//		}



		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//
//		List<Test> tests = testService.getTestFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ tests.size()+ " Test in the Db");
//		// Do something with the retrieved LabOrders
//		for (Test test : tests) {
//			System.out.println(">>>>>>>>>>>>> Test is being Printed" +test.getUuid());
//		}
//
//		for (Test test : tests) {
//
//			template.convertAndSend(MessagingConfig.TESTEXCHANGE, MessagingConfig.TESTROUTINGKEY,test);
//
//			System.out.println(">>>>>>>>>>>>> Test is being Printed " +test.getUuid());
//		}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<LIMSManifest> limsManifests = limsManifestService.getLIMSManifestFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ limsManifests.size()+ " LIMSManifest in the Db");
//		// Do something with the retrieved LabOrders
//		for (LIMSManifest limsManifest : limsManifests) {
//			System.out.println(">>>>>>>>>>>>> LIMSManifest is being Printed" +limsManifest.getUuid());
//		}
//
//		for (LIMSManifest limsManifest : limsManifests) {
//
//			template.convertAndSend(MessagingConfig.LIMSMANIFESTEXCHANGE, MessagingConfig.LIMSMANIFESTROUTINGKEY,limsManifest);
//
//			System.out.println(">>>>>>>>>>>>> LIMSManifest is being Printed " +limsManifest.getUuid());
//		}





		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<LIMSSample> limsSamples = limManifestService.getLIMSSampleFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ limsSamples.size()+ " LIMSManifest in the Db");
//		// Do something with the retrieved LabOrders
//		for (LIMSSample limsSample : limsSamples) {
//			System.out.println(">>>>>>>>>>>>> LIMSSample is being Printed" +limsSample.getUuid());
//		}
//
//		for (LIMSSample limsSample : limsSamples) {
//
//			template.convertAndSend(MessagingConfig.LIMSSAMPLEEXCHANGE, MessagingConfig.LIMSSAMPLEROUTINGKEY,limsSample);
//
//			System.out.println(">>>>>>>>>>>>> LIMSManifest is being Printed " +limsSample.getUuid());
//		}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//		List<LIMSResult> limsResults = limsResultService.getLIMSResultFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ limsResults.size()+ " LIMSResult in the Db");
//		// Do something with the retrieved LabOrders
//		for (LIMSResult limsResult : limsResults) {
//			System.out.println(">>>>>>>>>>>>> LIMSResult is being Printed" +limsResult.getUuid());
//		}
//
//		for (LIMSResult limsResult : limsResults) {
//
//			template.convertAndSend(MessagingConfig.LIMSRESULTEXCHANGE, MessagingConfig.LIMSRESULTROUTINGKEY,limsResult);
//
//			System.out.println(">>>>>>>>>>>>> LIMSResult is being Printed " +limsResult.getUuid());
//		}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<ANC> ancs = ancService.getAncFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ ancs.size()+ " ANC in the Db");
//		// Do something with the retrieved LabOrders
//		for (ANC anc : ancs) {
//			System.out.println(">>>>>>>>>>>>> ANC is being Printed" +anc.getUuid());
//		}
//
//		for (ANC anc : ancs) {
//
//			template.convertAndSend(MessagingConfig.ANCEXCHANGE, MessagingConfig.ANCROUTINGKEY,anc);
//
//			System.out.println(">>>>>>>>>>>>> ANC is being Printed " +anc.getUuid());
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//		List<Delivery> deliveries = deliveryService.getDeliveryFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ deliveries.size()+ " Delivery in the Db");
//		// Do something with the retrieved LabOrders
//		for (Delivery delivery : deliveries) {
//			System.out.println(">>>>>>>>>>>>> Delivery is being Printed" +delivery.getUuid());
//		}
//
//		for (Delivery delivery : deliveries)  {
//
//			template.convertAndSend(MessagingConfig.DELIVERYEXCHANGE, MessagingConfig.DELIVERYROUTINGKEY,delivery);
//
//			System.out.println(">>>>>>>>>>>>> Delivery is being Printed " +delivery.getUuid());
//		}


//		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//		List<PMTCTEnrollment> pmtctEnrollments = pmtctEnrollmentService.getPmtctFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ pmtctEnrollments.size()+ " PMTCTEnrollment in the Db");
//		// Do something with the retrieved LabOrders
//		for (PMTCTEnrollment pmtctEnrollment : pmtctEnrollments) {
//			System.out.println(">>>>>>>>>>>>> PMTCTEnrollment is being Printed" +pmtctEnrollment.getUuid());
//		}
//
//		for (PMTCTEnrollment pmtctEnrollment : pmtctEnrollments){
//
//			template.convertAndSend(MessagingConfig.PMTCTEXCHANGE, MessagingConfig.PMTCTROUTINGKEY,pmtctEnrollment);
//
//			System.out.println(">>>>>>>>>>>>> PMTCTEnrollment is being Printed " +pmtctEnrollment.getUuid());
//		}




		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<InfantArv> infantArvs = infantArvService.getInfantArvLamisPlusDb();
//
//
//
//		System.out.println("There are "+ infantArvs.size()+ " InfantArv in the Db");
//		// Do something with the retrieved LabOrders
//		for (InfantArv infantArv : infantArvs) {
//
//			System.out.println(">>>>>>>>>>>>> InfantArv is being Printed" +infantArv.getUuid());
//		}
//
//		for (InfantArv infantArv : infantArvs){
//
//			template.convertAndSend(MessagingConfig.INFANTARVEXCHANGE, MessagingConfig.INFANTARVROUTINGKEY,infantArv);
//
//			System.out.println(">>>>>>>>>>>>> InfantArv is being Printed " +infantArv.getUuid());
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//		List<InfantMotherArt> infantMotherArts = infantMotherArtService.getInfanMothertArtLamisPlusDb();
//
//
//
//		System.out.println("There are "+ infantMotherArts.size()+ " InfantMotherArt in the Db");
//		// Do something with the retrieved LabOrders
//		for (InfantMotherArt infantMotherArt : infantMotherArts) {
//
//			System.out.println(">>>>>>>>>>>>> infantMotherArts is being Printed" +infantMotherArt.getUuid());
//		}
//
//		for (InfantMotherArt infantMotherArt : infantMotherArts){
//
//			template.convertAndSend(MessagingConfig.INFANTMOTHERARTEXCHANGE, MessagingConfig.INFANTMOTHERARTROUTINGKEY,infantMotherArt);
//
//			System.out.println(">>>>>>>>>>>>> InfantArv is being Printed " +infantMotherArt.getUuid());
//		}
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//		List<InfantPCRTest> infantPCRTests = infantPCRTestService.getInfantPCRTestLamisPlusDb();
//
//
//
//		System.out.println("There are "+ infantPCRTests.size()+ " InfantPCRTest in the Db");
//		// Do something with the retrieved LabOrders
//		for (InfantPCRTest infantPCRTest : infantPCRTests) {
//
//			System.out.println(">>>>>>>>>>>>> infantPCRTests is being Printed" +infantPCRTest.getUuid());
//		}
//
//		for (InfantPCRTest infantPCRTest : infantPCRTests){
//
//			template.convertAndSend(MessagingConfig.INFANTMOTHERARTEXCHANGE, MessagingConfig.INFANTMOTHERARTROUTINGKEY,infantPCRTest);
//
//			System.out.println(">>>>>>>>>>>>> infantPCRTests is being Printed " +infantPCRTest.getUuid());
//		}


//		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//		List<InfantVisit> infantVisits = infantVisitService.getInfantVisitServiceLamisPlusDb();
//
//
//
//		System.out.println("There are "+ infantVisits.size()+ " infantVisits in the Db");
//		// Do something with the retrieved LabOrders
//		for (InfantVisit infantVisit : infantVisits) {
//
//			System.out.println(">>>>>>>>>>>>> InfantVisit is being Printed" +infantVisit.getUuid());
//		}
//
//		for (InfantVisit infantVisit : infantVisits){
//
//			template.convertAndSend(MessagingConfig.INFANTMOTHERARTEXCHANGE, MessagingConfig.INFANTMOTHERARTROUTINGKEY,infantVisit);
//
//			System.out.println(">>>>>>>>>>>>> InfantVisit is being Printed " +infantVisit.getUuid());
//		}


//		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//		List<PmtctVisit> pmtctVisits = pmtctVisitService.getPmtctVisitServiceLamisPlusDb();
//
//
//
//		System.out.println("There are "+ pmtctVisits.size()+ " PmtctVisit in the Db");
//		// Do something with the retrieved LabOrders
//		for (PmtctVisit pmtctVisit : pmtctVisits) {
//
//			System.out.println(">>>>>>>>>>>>> PmtctVisit is being Printed" +pmtctVisit.getUuid());
//		}
//
//		for (PmtctVisit pmtctVisit : pmtctVisits){
//
//			template.convertAndSend(MessagingConfig.PMTCTVISITEXCHANGE, MessagingConfig.PMTCTVISITROUTINGKEY,pmtctVisit);
//
//			System.out.println(">>>>>>>>>>>>> PmtctVisit is being Printed " +pmtctVisit.getUuid());
//		}



		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<PrepEligibility> prepEligibilities = prepEligibilityService.getPrepEligibilityFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ prepEligibilities.size()+ " PrepEligibility in the Db");
//		// Do something with the retrieved LabOrders
//		for (PrepEligibility prepEligibility : prepEligibilities) {
//
//			System.out.println(">>>>>>>>>>>>> PrepEligibility is being Printed" +prepEligibility.getUuid());
//		}
//
//		for (PrepEligibility prepEligibility : prepEligibilities){
//
//			template.convertAndSend(MessagingConfig.PREPELIGIBILITYEXCHANGE, MessagingConfig.PREPELIGIBILITYROUTINGKEY,prepEligibility);
//
//			System.out.println(">>>>>>>>>>>>> PrepEligibility is being Printed " +prepEligibility.getUuid());
//		}



		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//		List<PrepEnrollment> prepEnrollments = prepEnrollmentService.getPrepEnrollmentFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ prepEnrollments.size()+ " PrepEnrollment in the Db");
//		// Do something with the retrieved LabOrders
//		for (PrepEnrollment prepEnrollment : prepEnrollments) {
//
//			System.out.println(">>>>>>>>>>>>> PrepEnrollment is being Printed" +prepEnrollment.getDateCreated());
//		}
//
//		for (PrepEnrollment prepEnrollment : prepEnrollments){
//
//			template.convertAndSend(MessagingConfig.PREPENROLLMENTEXCHANGE, MessagingConfig.PREPENROLLMENTROUTINGKEY,prepEnrollment);
//
//			System.out.println(">>>>>>>>>>>>> PrepEnrollment is being Printed " +prepEnrollment.getUuid());
//		}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//		List<PrepClinic> prepClinics = prepClinicService.getPrepClinicFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ prepClinics.size()+ " PrepClinic in the Db");
//		// Do something with the retrieved LabOrders
//		for (PrepClinic prepClinic : prepClinics) {
//
//			System.out.println(">>>>>>>>>>>>> PrepClinic is being Printed" +prepClinic.getUuid());
//		}
//
//		for (PrepClinic prepClinic : prepClinics){
//
//			template.convertAndSend(MessagingConfig.PREPENROLLMENTEXCHANGE, MessagingConfig.PREPENROLLMENTROUTINGKEY,prepClinic);
//
//			System.out.println(">>>>>>>>>>>>> PrepClinic is being Printed " +prepClinic.getUuid());
//		}


		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//		List<PrepInterruption> prepInterruptions = prepInterruptionService.getPrepClinicFromLamisPlusDb();
//
//
//
//		System.out.println("There are "+ prepInterruptions.size()+ " PrepClinic in the Db");
//		// Do something with the retrieved LabOrders
//		for (PrepInterruption prepInterruption : prepInterruptions) {
//
//			System.out.println(">>>>>>>>>>>>> PrepInterruption is being Printed" +prepInterruption.getUuid());
//		}
//
//		for (PrepInterruption prepInterruption : prepInterruptions){
//
//			template.convertAndSend(MessagingConfig.PREPINTERRUPTIONEXCHANGE, MessagingConfig.PREPINTERRUPTIONROUTINGKEY,prepInterruption);
//
//			System.out.println(">>>>>>>>>>>>> PrepInterruption is being Printed " +prepInterruption.getUuid());
//		}





		List<Encounter> encounters = encounterService.getEncounterFromLamisPlusDb();



		System.out.println("There are "+ encounters.size()+ " Encounter in the Db");
		// Do something with the retrieved LabOrders
		for (Encounter encounter : encounters) {

			System.out.println(">>>>>>>>>>>>> Encounter is being Printed" +encounter.getUuid());
		}

		for (Encounter encounter : encounters){

			template.convertAndSend(MessagingConfig.PREPINTERRUPTIONEXCHANGE, MessagingConfig.PREPINTERRUPTIONROUTINGKEY,encounter);

			System.out.println(">>>>>>>>>>>>> Encounter is being Printed " +encounter.getUuid());
		}
	}



}

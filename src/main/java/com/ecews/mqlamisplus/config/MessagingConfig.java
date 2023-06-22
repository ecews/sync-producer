package com.ecews.mqlamisplus.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class MessagingConfig {



    public static final String QUEUE ="test_queue";
    public static final String EXCHANGE="test_exchange";

    public static final String ROUTING_KEY="test_routing_key";


    public static final String PATIENTEXCHANGE = "patient_exchange";
    public static final String PATIENTQUEUE ="patient_queue";
    public static final String PATIENTROUTING_KEY="patient_routing_key";




    public static final String PATIENTENCOUNTEREXCHANGE = "patient_encounter_exchange";
    public static final String PATIENTENCOUNTERQUEUE ="patient_encounter_queue";
    public static final String PATIENTENCOUNTERROUTING_KEY="patient_encounter_routing_key";



    public static final String BIOMETRICEXCHANGE = "biometric_exchange";
    public static final String BIOMETRICQUEUE ="biometric_queue";
    public static final String BIOMETRICROUTING_KEY ="biometric_routing_key";



    public static final String VITALSIGNEXCHANGE = "vitalsign_exchange";
    public static final String VITALSIGNQUEUE ="vitalsign_queue";
    public static final String VITALSIGN_ROUTING_KEY ="vitalsign_routing_key";


    public static final String VISITEXCHANGE = "visit_exchange";
    public static final String VISITQUEUE ="visit_queue";
    public static final String VISIT_ROUTING_KEY ="visit_routing_key";


    public static final String ARTPHARMACYEXCHANGE = "art_pharmacy_exchange";
    public static final String ARTPHARMACY_ROUTING_KEY = "art_pharmacy_routing_key";
    private static final String ARTPHARMACYQUEUE = "art_pharmacy_queue";


    public static final String HIVDRUGEXCHANGE = "hiv_drug_exchange";
    public static final String HIVDRUG_ROUTING_KEY = "hiv_routing_key";
    private static final String HIVDRUGQUEUE = "hiv_drug_queue";


    public static final String REGIMENEXCHANGE = "regimen_exchange";
    public static final String REGIMEN_ROUTING_KEY = "regimen_routing_key";
    private static final String REGIMENQUEUE = "regimen_queue";


    private static final String REGIMENTYPEQUEUE = "regimen_type_queue";
    private static final String REGIMENTYPEEXCHANGE = "regimen_type_exchange";
    private static final String REGIMENTYPE_ROUTING_KEY = "regimen_type_key";


    public static final String HIVENROLLMENTQUEUE = "hivenrollment_queue";
    public static final String HIVENROLLMENTEXCHANGE = "hivenrollment_type_exchange";
    public static final String HIVENROLLMENT_ROUTING_KEY = "hivenrollment_routing_key";


    public static final String HIVARTCLINICALQUEUE = "hiv_art_clinical_queue";
    public static final String HIVARTCLINICALEXCHANGE = "hiv_art_clinical_exchange";
    public static final String HIVARTCLINICALROUTINGKEY = "hiv_art_clinical_routing_key";
    public static final String HIVEACEXCHANGE = "hiv_eac_exchange";
    public static final String HIVEACROUTINGKEY = "hiv_eac_routing_key";
    public static final String HIVEACQUEUE = "hiv_eac_queue";

    public static final String EACOUTCOMEEXCHANGE = "eac_out_come_exchange";
    public static final String EACOUTCOMEROUTINGKEY = "eac_out_come_routing_key";
    public static final String EACOUTCOMEQUEUE = "eac_out_come_queue";


    public static final String HIVEACSESSIONEXCHANGE = "hiv_eac_session_exchange";
    public static final String HIVEACSESSIONROUTINGKEY = "hiv_eac_session_routing_key";
    public static final String HIVEACSESSIONQUEUE = "hiv_eac_session_queue";


    public static final String OBSERVATIONEXCHANGE = "observation_exchange";
    public static final String OBSERVATIONROUTINGKEY = "observation_routing_key";
    public static final String OBSERVATIONQUEUE = "observation_queue";


    public static final String HIVSTATUSTRACKEREXCHANGE = "hiv_status_tracker_exchange";
    public static final String HIVSTATUSTRACKERROUTINGKEY = "hiv_status_tracker_key";
    public static final String HIVSTATUSTRACKERQUEUE = "hiv_status_tracker_queue";


    public static final String PATIENTTRACKEREXCHANGE = "patient_tracker_exchange";
    public static final String PATIENTTRACKERROUTINGKEY = "patient_tracker_key";
    public static final String PATIENTTRACKERQUEUE = "patient_tracker_queue";


    public static final String INDEXELICITATIONQUEUE = "index_elicitation_queue";
    public static final String INDEXELICITATIONEXCHANGE = "index_elicitation_exchange";
    public static final String INDEXELICITATIONROUTINGKEY = "index_elicitation_routing_key";


    public static final String HTSCLIENTQUEUE = "hts_client_queue";
    public static final String HTSCLIENTEXCHANGE = "hts_client_exchange";
    public static final String HTSCLIENTROUTINGKEY = "hts_client_routing_key";




    public static final String RISKSTRATIFICATIONQUEUE = "risk_stratification_queue";
    public static final String RISKSTRATIFICATIONEXCHANGE = "risk_stratification_exchange";
    public static final String RISKSTRATIFICATIONROUTINGKEY = "risk_stratification_key";


    public static final String LABORDERQUEUE = "lab_order_queue";
    public static final String LABORDEREXCHANGE = "lab_order_exchange";
    public static final String LABORDERROUTINGKEY = "lab_order_key";



    public static final String RESULTQUEUE = "result_queue";
    public static final String RESULTEXCHANGE = "result_exchange";
    public static final String RESULTROUTINGKEY = "result_key";



    public static final String SAMPLEQUEUE = "sample_queue";
    public static final String SAMPLEEXCHANGE = "sample_exchange";
    public static final String SAMPLEROUTINGKEY = "sample_key";



    public static final String TESTQUEUE = "test_queue";
    public static final String TESTEXCHANGE = "test_exchange";
    public static final String TESTROUTINGKEY = "test_key";


    public static final String LIMSMANIFESTQUEUE = "lims_manifest_queue";
    public static final String LIMSMANIFESTEXCHANGE = "lims_manifest_exchange";
    public static final String LIMSMANIFESTROUTINGKEY = "lims_manifest_key";



    public static final String LIMSSAMPLEQUEUE = "lims_sample_queue";
    public static final String LIMSSAMPLEEXCHANGE = "lims_sample_exchange";
    public static final String LIMSSAMPLEROUTINGKEY = "lims_sample_key";



    public static final String LIMSRESULTQUEUE = "lims_result_queue";
    public static final String LIMSRESULTEXCHANGE = "lims_result_exchange";
    public static final String LIMSRESULTROUTINGKEY = "lims_result_key";


    public static final String ANCQUEUE = "anc_queue";
    public static final String ANCEXCHANGE = "anc_exchange";
    public static final String ANCROUTINGKEY = "anc_result_key";


    public static final String DELIVERYQUEUE = "delivery_queue";
    public static final String DELIVERYEXCHANGE = "delivery_exchange";
    public static final String DELIVERYROUTINGKEY = "delivery_key";

    public static final String PMTCTQUEUE = "pmtct_queue";
    public static final String PMTCTEXCHANGE = "pmtct_exchange";
    public static final String PMTCTROUTINGKEY = "pmtct_key";



    public static final String INFANTARVQUEUE = "infant_arv_queue";
    public static final String INFANTARVEXCHANGE = "infant_arv_exchange";
    public static final String INFANTARVROUTINGKEY = "infant_arv_key";


    public static final String INFANTMOTHERARTQUEUE = "infant_mother_art_queue";
    public static final String INFANTMOTHERARTEXCHANGE = "infant_mother_art_exchange";
    public static final String INFANTMOTHERARTROUTINGKEY = "infant_mother_art_key";

    public static final String INFANTPCRTESTQUEUE = "infant_pcr_test_queue";
    public static final String INFANTPCRTESTEXCHANGE = "infant_pcr_test_exchange";
    public static final String INFANTPCRTESTROUTINGKEY = "infant_pcr_test_key";


    public static final String INFANTVISITQUEUE = "infant_visit_queue";
    public static final String INFANTVISITEXCHANGE = "infant_visit_exchange";
    public static final String INFANTVISITROUTINGKEY = "infant_visit_key";

    public static final String PMTCTVISITQUEUE = "pmtct_visit_queue";
    public static final String PMTCTVISITEXCHANGE = "pmtct_visit_exchange";
    public static final String PMTCTVISITROUTINGKEY = "pmtct_visit_key";


    public static final String PREPELIGIBILITYQUEUE = "prep_eligibility_queue";
    public static final String PREPELIGIBILITYEXCHANGE = "prep_eligibility_exchange";
    public static final String PREPELIGIBILITYROUTINGKEY = "prep_eligibility_key";


    public static final String PREPENROLLMENTQUEUE = "prep_enrollment_queue";
    public static final String PREPENROLLMENTEXCHANGE = "prep_enrollment_exchange";
    public static final String PREPENROLLMENTROUTINGKEY = "prep_enrollment_key";


    public static final String PREPCLINICQUEUE = "prep_clinic_queue";
    public static final String PREPCLINICEXCHANGE = "prep_clinic_exchange";
    public static final String PREPCLINICROUTINGKEY = "prep_clinic_key";

    public static final String PREPINTERRUPTIONQUEUE = "prep_interruption_queue";
    public static final String PREPINTERRUPTIONEXCHANGE = "prep_interruption_exchange";
    public static final String PREPINTERRUPTIONROUTINGKEY = "prep_interruption_key";




    @Bean
    public Queue queue(){

        return new Queue(PATIENTQUEUE);
    }



    @Bean
    public TopicExchange exchange(){

        return new TopicExchange(PATIENTEXCHANGE);
    }


    @Bean
    public Binding binding(Queue queue, TopicExchange exchange){

        return BindingBuilder.bind(queue).to(exchange).with(PATIENTROUTING_KEY);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Bean
    public Queue biometricQueue(){

        return new Queue(BIOMETRICQUEUE);
    }

    @Bean
    public TopicExchange biometricExchange(){

        return new TopicExchange(BIOMETRICEXCHANGE);
    }

    @Bean
    public Binding biometricBinding(Queue biometricQueue, TopicExchange biometricExchange){

        return BindingBuilder.bind(biometricQueue).to(biometricExchange).with(BIOMETRICROUTING_KEY);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Bean
    public Queue vitalSignQueue(){

        return new Queue(VITALSIGNQUEUE);
    }

    @Bean
    public TopicExchange vitalSignExchange(){

        return new TopicExchange(VITALSIGNEXCHANGE);
    }

    @Bean
    public Binding vitalSignBinding(Queue vitalSignQueue, TopicExchange vitalSignExchange){

        return BindingBuilder.bind(vitalSignQueue).to(vitalSignExchange).with(VITALSIGN_ROUTING_KEY);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Bean
    public Queue visitQueue(){

        return new Queue(VISITQUEUE);
    }

    @Bean
    public TopicExchange visitExchange(){

        return new TopicExchange(VISITEXCHANGE);
    }

    @Bean
    public Binding visitBinding(Queue visitQueue, TopicExchange visitExchange){

        return BindingBuilder.bind(visitQueue).to(visitExchange).with(VISIT_ROUTING_KEY);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Bean
    public Queue artPharmacyQueue(){

        return new Queue(ARTPHARMACYQUEUE);
    }

    @Bean
    public TopicExchange artPharmacyExchange(){

        return new TopicExchange(ARTPHARMACYEXCHANGE);
    }

    @Bean
    public Binding artPharmacyBinding(Queue artPharmacyQueue, TopicExchange artPharmacyExchange){

        return BindingBuilder.bind(artPharmacyQueue).to(artPharmacyExchange).with(ARTPHARMACY_ROUTING_KEY);
    }



    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Bean
    public Queue regimenQueue(){

        return new Queue(REGIMENQUEUE);
    }

    @Bean
    public TopicExchange regimenExchange(){

        return new TopicExchange(REGIMENEXCHANGE);
    }

    @Bean
    public Binding regimenBinding(Queue regimenQueue, TopicExchange regimenExchange){

        return BindingBuilder.bind(regimenQueue).to(regimenExchange).with(REGIMEN_ROUTING_KEY);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Bean
    public Queue regimenTypeQueue(){

        return new Queue(REGIMENTYPEQUEUE);
    }

    @Bean
    public TopicExchange regimenTypeExchange(){

        return new TopicExchange(REGIMENTYPEEXCHANGE);
    }

    @Bean
    public Binding regimenTypeBinding(Queue regimenTypeQueue, TopicExchange regimenTypeExchange){

        return BindingBuilder.bind(regimenTypeQueue).to(regimenTypeExchange).with(REGIMENTYPE_ROUTING_KEY);

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Bean
    public Queue hivDrugQueue(){

        return new Queue(HIVDRUGQUEUE);
    }

    @Bean
    public TopicExchange hivDrugExchange(){

        return new TopicExchange(HIVDRUGEXCHANGE);
    }

    @Bean
    public Binding hivDrugBinding(Queue hivDrugQueue, TopicExchange hivDrugExchange){

        return BindingBuilder.bind(hivDrugQueue).to(hivDrugExchange).with(HIVDRUG_ROUTING_KEY);

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Bean
    public Queue hivEnrollmentQueue(){

        return new Queue(HIVENROLLMENTQUEUE);
    }

    @Bean
    public TopicExchange hivEnrollmentExchange(){

        return new TopicExchange(HIVENROLLMENTEXCHANGE);
    }

    @Bean
    public Binding hivEnrollmentBinding(Queue hivEnrollmentQueue, TopicExchange hivEnrollmentExchange){

        return BindingBuilder.bind(hivEnrollmentQueue).to(hivEnrollmentExchange).with(HIVENROLLMENT_ROUTING_KEY);

    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Bean
    public Queue artClinicaltQueue(){

        return new Queue(HIVARTCLINICALQUEUE);
    }

    @Bean
    public TopicExchange artClinicalExchange(){

        return new TopicExchange(HIVARTCLINICALEXCHANGE);
    }

    @Bean
    public Binding artClinicalBinding(Queue artClinicaltQueue, TopicExchange artClinicalExchange){

        return BindingBuilder.bind(artClinicaltQueue).to(artClinicalExchange).with(HIVARTCLINICALROUTINGKEY);

    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Bean
    public Queue hivEacQueue(){

        return new Queue(HIVEACQUEUE);
    }

    @Bean
    public TopicExchange hivEacExchange(){

        return new TopicExchange(HIVEACEXCHANGE);
    }

    @Bean
    public Binding hivEacBinding(Queue hivEacQueue, TopicExchange hivEacExchange){

        return BindingBuilder.bind(hivEacQueue).to(hivEacExchange).with(HIVEACROUTINGKEY);

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Bean
    public Queue eacOutComeQueue(){

        return new Queue(EACOUTCOMEQUEUE);
    }

    @Bean
    public TopicExchange eacOutComeExchange(){

        return new TopicExchange(EACOUTCOMEEXCHANGE);
    }

    @Bean
    public Binding eacOutComeBinding(Queue eacOutComeQueue, TopicExchange eacOutComeExchange){

        return BindingBuilder.bind(eacOutComeQueue).to(eacOutComeExchange).with(EACOUTCOMEROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Bean
    public Queue hivSessionQueue(){

        return new Queue(HIVEACSESSIONQUEUE);
    }

    @Bean
    public TopicExchange hivSessionExchange(){

        return new TopicExchange(HIVEACSESSIONEXCHANGE);
    }

    @Bean
    public Binding hivSessionBinding(Queue hivSessionQueue, TopicExchange hivSessionExchange){

        return BindingBuilder.bind(hivSessionQueue).to(hivSessionExchange).with(HIVEACSESSIONROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Bean
    public Queue observationQueue(){

        return new Queue(OBSERVATIONQUEUE);
    }

    @Bean
    public TopicExchange observationExchange(){

        return new TopicExchange(OBSERVATIONEXCHANGE);
    }

    @Bean
    public Binding observationBinding(Queue observationQueue, TopicExchange observationExchange){

        return BindingBuilder.bind(observationQueue).to(observationExchange).with(OBSERVATIONROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    @Bean
    public Queue hivStatusQueue(){

        return new Queue(HIVSTATUSTRACKERQUEUE);
    }

    @Bean
    public TopicExchange hivStatusExchange(){

        return new TopicExchange(HIVSTATUSTRACKEREXCHANGE);
    }

    @Bean
    public Binding hivStatusBinding(Queue hivStatusQueue, TopicExchange hivStatusExchange){

        return BindingBuilder.bind(hivStatusQueue).to(hivStatusExchange).with(HIVSTATUSTRACKERROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Bean
    public Queue patientTrackerQueue(){

        return new Queue(PATIENTTRACKERQUEUE);
    }

    @Bean
    public TopicExchange patientTrackerExchange(){

        return new TopicExchange(PATIENTTRACKEREXCHANGE);
    }

    @Bean
    public Binding patientBinding(Queue patientTrackerQueue, TopicExchange patientTrackerExchange){

        return BindingBuilder.bind(patientTrackerQueue).to(patientTrackerExchange).with(PATIENTTRACKERROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






    @Bean
    public Queue indexElicitationQueue(){

        return new Queue(INDEXELICITATIONQUEUE);
    }

    @Bean
    public TopicExchange indexElicitationExchange(){

        return new TopicExchange(INDEXELICITATIONEXCHANGE);
    }

    @Bean
    public Binding indexElicitationBinding(Queue indexElicitationQueue, TopicExchange indexElicitationExchange){

        return BindingBuilder.bind(indexElicitationQueue).to(indexElicitationExchange).with(INDEXELICITATIONROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    @Bean
    public Queue htsClientQueue(){

        return new Queue(HTSCLIENTQUEUE);
    }

    @Bean
    public TopicExchange htsClientExchange(){

        return new TopicExchange(HTSCLIENTEXCHANGE);
    }

    @Bean
    public Binding htsClientBinding(Queue htsClientQueue, TopicExchange htsClientExchange){

        return BindingBuilder.bind(htsClientQueue).to(htsClientExchange).with(HTSCLIENTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Bean
    public Queue riskStratificationQueue(){

        return new Queue(RISKSTRATIFICATIONQUEUE);
    }

    @Bean
    public TopicExchange riskStratificationExchange(){

        return new TopicExchange(RISKSTRATIFICATIONEXCHANGE);
    }

    @Bean
    public Binding riskStratificationBinding(Queue riskStratificationQueue, TopicExchange riskStratificationExchange){

        return BindingBuilder.bind(riskStratificationQueue).to(riskStratificationExchange).with(RISKSTRATIFICATIONROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    @Bean
    public Queue labOrderQueue(){

        return new Queue(LABORDERQUEUE);
    }

    @Bean
    public TopicExchange labOrderExchange(){

        return new TopicExchange(LABORDEREXCHANGE);
    }

    @Bean
    public Binding labOrderBinding(Queue labOrderQueue, TopicExchange labOrderExchange){

        return BindingBuilder.bind(labOrderQueue).to(labOrderExchange).with(LABORDERROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







    @Bean
    public Queue resultQueue(){

        return new Queue(RESULTQUEUE);
    }

    @Bean
    public TopicExchange resultExchange(){

        return new TopicExchange(RESULTEXCHANGE);
    }

    @Bean
    public Binding resultBinding(Queue resultQueue, TopicExchange resultExchange){

        return BindingBuilder.bind(resultQueue).to(resultExchange).with(RESULTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////








    @Bean
    public Queue sampleQueue(){

        return new Queue(SAMPLEQUEUE);
    }

    @Bean
    public TopicExchange sampleExchange(){

        return new TopicExchange(SAMPLEEXCHANGE);
    }

    @Bean
    public Binding sampleBinding(Queue sampleQueue, TopicExchange sampleExchange){

        return BindingBuilder.bind(sampleQueue).to(sampleExchange).with(SAMPLEROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






    @Bean
    public Queue testQueue(){

        return new Queue(TESTQUEUE);
    }

    @Bean
    public TopicExchange testExchange(){

        return new TopicExchange(TESTEXCHANGE);
    }

    @Bean
    public Binding testBinding(Queue testQueue, TopicExchange testExchange){

        return BindingBuilder.bind(testQueue).to(testExchange).with(TESTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    @Bean
    public Queue limsManifestQueue(){

        return new Queue(LIMSMANIFESTQUEUE);
    }

    @Bean
    public TopicExchange limsManifestExchange(){

        return new TopicExchange(LIMSMANIFESTEXCHANGE);
    }

    @Bean
    public Binding limsManifestBinding(Queue limsManifestQueue, TopicExchange limsManifestExchange){

        return BindingBuilder.bind(limsManifestQueue).to(limsManifestExchange).with(LIMSMANIFESTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////









    @Bean
    public Queue limsSampleQueue(){

        return new Queue(LIMSSAMPLEQUEUE);
    }

    @Bean
    public TopicExchange limsSampleExchange(){

        return new TopicExchange(LIMSSAMPLEEXCHANGE);
    }

    @Bean
    public Binding limsSampleBinding(Queue limsSampleQueue, TopicExchange limsSampleExchange){

        return BindingBuilder.bind(limsSampleQueue).to(limsSampleExchange).with(LIMSSAMPLEROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







    @Bean
    public Queue limsResultQueue(){

        return new Queue(LIMSRESULTQUEUE);
    }

    @Bean
    public TopicExchange limsResultExchange(){

        return new TopicExchange(LIMSSAMPLEEXCHANGE);
    }

    @Bean
    public Binding limsResultBinding(Queue limsResultQueue, TopicExchange limsResultExchange){

        return BindingBuilder.bind(limsResultQueue).to(limsResultExchange).with(LIMSRESULTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






    @Bean
    public Queue ancQueue(){

        return new Queue(ANCQUEUE);
    }

    @Bean
    public TopicExchange ancExchange(){

        return new TopicExchange(ANCEXCHANGE);
    }

    @Bean
    public Binding ancBinding(Queue ancQueue, TopicExchange ancExchange){

        return BindingBuilder.bind(ancQueue).to(ancExchange).with(ANCROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    @Bean
    public Queue deliveryQueue(){

        return new Queue(DELIVERYQUEUE);
    }

    @Bean
    public TopicExchange deliveryExchange(){

        return new TopicExchange(DELIVERYEXCHANGE);
    }

    @Bean
    public Binding deliveryBinding(Queue deliveryQueue, TopicExchange deliveryExchange){

        return BindingBuilder.bind(deliveryQueue).to(deliveryExchange).with(DELIVERYROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    @Bean
    public Queue pmtctQueue(){

        return new Queue(PMTCTQUEUE);
    }

    @Bean
    public TopicExchange pmtctExchange(){

        return new TopicExchange(PMTCTEXCHANGE);
    }

    @Bean
    public Binding pmtctBinding(Queue pmtctQueue, TopicExchange pmtctExchange){

        return BindingBuilder.bind(pmtctQueue).to(pmtctExchange).with(PMTCTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    @Bean
    public Queue infantArvQueue(){

        return new Queue(INFANTARVQUEUE);
    }

    @Bean
    public TopicExchange infantArvExchange(){

        return new TopicExchange(INFANTARVEXCHANGE);
    }

    @Bean
    public Binding infantaArvBinding(Queue infantArvQueue, TopicExchange infantArvExchange){

        return BindingBuilder.bind(infantArvQueue).to(infantArvExchange).with(INFANTARVROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    @Bean
    public Queue infantMotherQueue(){

        return new Queue(INFANTMOTHERARTQUEUE);
    }

    @Bean
    public TopicExchange infantMotherArtExchange(){

        return new TopicExchange(INFANTMOTHERARTEXCHANGE);
    }

    @Bean
    public Binding infantMotherArtBinding(Queue infantMotherQueue, TopicExchange infantMotherArtExchange){

        return BindingBuilder.bind(infantMotherQueue).to(infantMotherArtExchange).with(INFANTMOTHERARTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Bean
    public Queue infantPcrTestQueue(){

        return new Queue(INFANTPCRTESTQUEUE);
    }

    @Bean
    public TopicExchange infantPcrTestExchange(){

        return new TopicExchange(INFANTPCRTESTEXCHANGE);
    }

    @Bean
    public Binding infantPcrTestBinding(Queue infantPcrTestQueue, TopicExchange infantPcrTestExchange){

        return BindingBuilder.bind(infantPcrTestQueue).to(infantPcrTestExchange).with(INFANTPCRTESTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    @Bean
    public Queue infantVisitQueue(){

        return new Queue(INFANTVISITQUEUE);
    }

    @Bean
    public TopicExchange infantVisitExchange(){

        return new TopicExchange(INFANTVISITEXCHANGE);
    }

    @Bean
    public Binding infantVisitBinding(Queue infantVisitQueue, TopicExchange infantVisitExchange){

        return BindingBuilder.bind(infantVisitQueue).to(infantVisitExchange).with(INFANTVISITROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    @Bean
    public Queue pmtctVisitQueue(){

        return new Queue(PMTCTVISITQUEUE);
    }

    @Bean
    public TopicExchange pmtctVisitExchange(){

        return new TopicExchange(PMTCTVISITEXCHANGE);
    }

    @Bean
    public Binding pmtctVisitBinding(Queue pmtctVisitQueue, TopicExchange pmtctVisitExchange){

        return BindingBuilder.bind(pmtctVisitQueue).to(pmtctVisitExchange).with(PMTCTVISITROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






    @Bean
    public Queue prepEligibilityQueue(){

        return new Queue(PREPELIGIBILITYQUEUE);
    }

    @Bean
    public TopicExchange prepEligibilityExchange(){

        return new TopicExchange(PREPELIGIBILITYEXCHANGE);
    }

    @Bean
    public Binding prepEligibilityBinding(Queue prepEligibilityQueue, TopicExchange prepEligibilityExchange){

        return BindingBuilder.bind(prepEligibilityQueue).to(prepEligibilityExchange).with(PREPELIGIBILITYROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Bean
    public Queue prepEnrollmentQueue(){

        return new Queue(PREPENROLLMENTQUEUE);
    }

    @Bean
    public TopicExchange prepEnrollmentExchange(){

        return new TopicExchange(PREPENROLLMENTEXCHANGE);
    }

    @Bean
    public Binding prepEnrollmentBinding(Queue prepEnrollmentQueue, TopicExchange prepEnrollmentExchange){

        return BindingBuilder.bind(prepEnrollmentQueue).to(prepEnrollmentExchange).with(PREPENROLLMENTROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    @Bean
    public Queue prepClinicQueue(){

        return new Queue(PREPCLINICQUEUE);
    }

    @Bean
    public TopicExchange prepClinicExchange(){

        return new TopicExchange(PREPCLINICEXCHANGE);
    }

    @Bean
    public Binding prepClinicBinding(Queue prepClinicQueue, TopicExchange prepClinicExchange){

        return BindingBuilder.bind(prepClinicQueue).to(prepClinicExchange).with(PREPCLINICROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






    @Bean
    public Queue prepInterruptionQueue(){

        return new Queue(PREPINTERRUPTIONQUEUE);
    }

    @Bean
    public TopicExchange prepInterrptionExchange(){

        return new TopicExchange(PREPINTERRUPTIONEXCHANGE);
    }

    @Bean
    public Binding prepInterruptionBinding(Queue prepInterruptionQueue, TopicExchange prepInterrptionExchange){

        return BindingBuilder.bind(prepInterruptionQueue).to(prepInterrptionExchange).with(PREPINTERRUPTIONROUTINGKEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////








    @Bean
    public Queue patientEncounterQueue(){

        return new Queue(PATIENTENCOUNTERQUEUE);
    }

    @Bean
    public TopicExchange patientEncounterExchange(){

        return new TopicExchange(PATIENTENCOUNTEREXCHANGE);
    }

    @Bean
    public Binding patientEncounterBinding(Queue patientEncounterQueue, TopicExchange patientEncounterExchange){

        return BindingBuilder.bind(patientEncounterQueue).to(patientEncounterExchange).with(PATIENTENCOUNTERROUTING_KEY);

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Bean
    public MessageConverter messageConverter(){

        return new Jackson2JsonMessageConverter();
    }

   @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory){

        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}

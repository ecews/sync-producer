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

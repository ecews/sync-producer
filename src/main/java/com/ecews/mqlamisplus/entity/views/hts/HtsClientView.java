package com.ecews.mqlamisplus.entity.views.hts;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.Mapping;
import com.ecews.mqlamisplus.entity.models.Person.Person;
import com.ecews.mqlamisplus.entity.models.hts.HtsClient;
import com.ecews.mqlamisplus.entity.models.hts.RiskStratification;

import java.time.LocalDate;
import java.util.List;

@EntityView(HtsClient.class)
public interface HtsClientView {
    @IdMapping
    Long getId();

    @Mapping("targetGroup")
    String getTargetGroup();

    @Mapping("clientCode")
    String getClientCode();

    @Mapping("indexClientCode")
    String getIndexClientCode();

    @Mapping("dateVisit")
    LocalDate getDateVisit();

    @Mapping("referredFrom")
    Long getReferredFrom();

    @Mapping("capturedBy")
    String getCapturedBy();

    @Mapping("testingSetting")
    String getTestingSetting();

    @Mapping("firstTimeVisit")
    Boolean getFirstTimeVisit();

    @Mapping("numChildren")
    Integer getNumChildren();

    @Mapping("numWives")
    Integer getNumWives();

    @Mapping("typeCounseling")
    Long getTypeCounseling();

    @Mapping("indexClient")
    Boolean getIndexClient();

    @Mapping("previouslyTested")
    Boolean getPreviouslyTested();

    @Mapping("facilityId")
    Long getFacilityId();

    @Mapping("extra")
    Object getExtra();

//    @Mapping("personUuid")
//    String getPersonUuid();

    @Mapping("person.uuid")
    String getPersonUuid();

    @Mapping("uuid")
    String getUuid();

//    // One-to-One association with Person
//    Person getPerson();

    @Mapping("pregnant")
    Long getPregnant();

    @Mapping("breastFeeding")
    Boolean getBreastFeeding();

    @Mapping("relationWithIndexClient")
    Long getRelationWithIndexClient();

    @Mapping("knowledgeAssessment")
    Object getKnowledgeAssessment();

    @Mapping("riskAssessment")
    Object getRiskAssessment();

    @Mapping("tbScreening")
    Object getTbScreening();

    @Mapping("stiScreening")
    Object getStiScreening();

    @Mapping("sexPartnerRiskAssessment")
    Object getSexPartnerRiskAssessment();

    @Mapping("test1")
    Object getTest1();

    @Mapping("confirmatoryTest")
    Object getConfirmatoryTest();

    @Mapping("tieBreakerTest")
    Object getTieBreakerTest();

    @Mapping("hivTestResult")
    String getHivTestResult();

    @Mapping("test2")
    Object getTest2();

    @Mapping("confirmatoryTest2")
    Object getConfirmatoryTest2();

    @Mapping("tieBreakerTest2")
    Object getTieBreakerTest2();

    @Mapping("hivTestResult2")
    String getHivTestResult2();

    @Mapping("archived")
    int getArchived();

    @Mapping("syphilisTesting")
    Object getSyphilisTesting();

    @Mapping("hepatitisTesting")
    Object getHepatitisTesting();

    @Mapping("others")
    Object getOthers();

    @Mapping("cd4")
    Object getCd4();

    @Mapping("recency")
    Object getRecency();

    @Mapping("postTestCounselingKnowledgeAssessment")
    Object getPostTestCounselingKnowledgeAssessment();

    @Mapping("indexNotificationServicesElicitation")
    Object getIndexNotificationServicesElicitation();

    // One-to-Many association with IndexElicitation
//    List<IndexElicitationView> getIndexElicitation();

//    // One-to-One association with RiskStratification
//    RiskStratification getRiskStratification();


//    // One-to-One association with RiskStratification
//    RiskStratification getRiskStratification();

    @Mapping("riskStratificationCode")
    String getRiskStratificationCode();

    @Mapping("prepOffered")
    Boolean getPrepOffered();

    @Mapping("prepAccepted")
    Boolean getPrepAccepted();

    @Mapping("prepGiven")
    String getPrepGiven();

    @Mapping("otherDrugs")
    String getOtherDrugs();


    List<IndexElicitationView> getIndexElicitation();
}

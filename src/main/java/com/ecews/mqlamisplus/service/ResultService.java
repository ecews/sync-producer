package com.ecews.mqlamisplus.service;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.view.EntityViewManager;
import com.blazebit.persistence.view.EntityViewSetting;
import com.ecews.mqlamisplus.Repository.laboratory.ResultRepo;
import com.ecews.mqlamisplus.entity.models.laboratory.LabOrder;
import com.ecews.mqlamisplus.entity.models.laboratory.Result;
import com.ecews.mqlamisplus.entity.views.laboratory.LabOrderView;
import com.ecews.mqlamisplus.entity.views.laboratory.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class ResultService {

    @Autowired
    ResultRepo resultRepo;

    public final EntityManager em;
    public final CriteriaBuilderFactory cbf;
    private final EntityViewManager evm;



    public ResultService(EntityManager em, CriteriaBuilderFactory cbf, EntityViewManager evm) {
        this.em = em;
        this.cbf = cbf;
        this.evm = evm;
    }








    public List<Result> getResultsFromLamisPlusDb() {

        List<Result> results = resultRepo.findAll();

        return results;
    }


    public List<ResultView> getAllResult() {
        var settings = EntityViewSetting.create(ResultView.class);
        var cb = cbf.create(em, ResultView.class)
                .from(Result.class)
                .orderByAsc("id");
        return evm.applySetting(settings, cb).getResultList();

        //.withCountQuery(false).getResultList();
        // return patientRepository.findByLastModifiedGreaterThan(patientMaxTime);
    }


}

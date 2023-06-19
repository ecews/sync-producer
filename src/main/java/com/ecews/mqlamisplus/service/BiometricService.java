package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.Repository.BiometricRepo.BiometricRepo;
import com.ecews.mqlamisplus.models.biometric.Biometric;
import com.ecews.mqlamisplus.models.visit.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiometricService {


    @Autowired
    BiometricRepo biometricRepo;
    public List<Biometric> getAllBiometricFromLamisPlusDb() {


        List<Biometric> biometric = biometricRepo.findAll();

        return biometric;
    }
}

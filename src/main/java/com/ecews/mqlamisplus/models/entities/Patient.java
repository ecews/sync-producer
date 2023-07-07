package com.ecews.mqlamisplus.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "patient")
public class Patient implements Serializable {

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private long patientId;

    @Id
    @Column(name = "patientid")
    private long patientId;

    @Column(name = "patientname")
    private String patientName;

    @Column(name = "qty")
    private int qty;

    @Column(name = "price")
    private double price;

    @Column(name = "patient_name")
    private String patient_name;
}

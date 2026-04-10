/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cybercrime.model;

public class Complaint {

    private String complaintId;
    private String email;
    private String crimeType;
    private String description;
    private String status;

    public Complaint(String complaintId,String email,String crimeType,String description,String status){

        this.complaintId = complaintId;
        this.email = email;
        this.crimeType = crimeType;
        this.description = description;
        this.status = status;

    }

    public String getComplaintId(){ return complaintId; }
    public String getEmail(){ return email; }
    public String getCrimeType(){ return crimeType; }
    public String getDescription(){ return description; }
    public String getStatus(){ return status; }

}

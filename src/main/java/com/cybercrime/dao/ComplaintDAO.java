/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cybercrime.dao;

import com.cybercrime.database.MongoDBConnection;
import com.cybercrime.model.Complaint;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class ComplaintDAO {

    MongoDatabase db = MongoDBConnection.getDatabase();
    MongoCollection<Document> complaints = db.getCollection("complaints");

    public void fileComplaint(Complaint complaint){

        Document doc = new Document("complaintId",complaint.getComplaintId())
                .append("email",complaint.getEmail())
                .append("crimeType",complaint.getCrimeType())
                .append("description",complaint.getDescription())
                .append("status",complaint.getStatus());

        complaints.insertOne(doc);

    }

    public Document getComplaint(String id){

        return complaints.find(new Document("complaintId",id)).first();

    }

    public List<Document> getAllComplaints(){

        List<Document> list = new ArrayList<>();

        for(Document doc : complaints.find()){
            list.add(doc);
        }

        return list;
    }

}

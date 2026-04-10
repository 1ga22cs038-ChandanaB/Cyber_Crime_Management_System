/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cybercrime.database;

/**
 *
 * @author admin
 */

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

    private static final String URI = "mongodb://localhost:27017";
    private static final String DB_NAME = "cybercrime_db";

    private static MongoDatabase database;

    static {
        try {
            MongoClient client = MongoClients.create(URI);
            database = client.getDatabase(DB_NAME);
            System.out.println("Connected to MongoDB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}

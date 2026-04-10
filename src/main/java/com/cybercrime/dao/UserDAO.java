package com.cybercrime.dao;

import com.cybercrime.database.MongoDBConnection;
import com.cybercrime.model.User;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class UserDAO {

    MongoDatabase db = MongoDBConnection.getDatabase();
    MongoCollection<Document> users = db.getCollection("users");

    public void registerUser(User user){

        Document doc = new Document("name",user.getName())
                .append("email",user.getEmail())
                .append("phone",user.getPhone())
                .append("password",user.getPassword());

        users.insertOne(doc);

    }

    public boolean validateLogin(String email,String password){

        Document user = users.find(
                new Document("email",email)
                        .append("password",password)
        ).first();

        return user != null;

    }

}
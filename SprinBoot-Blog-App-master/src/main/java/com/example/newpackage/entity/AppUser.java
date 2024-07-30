package com.example.newpackage.entity;

import org.springframework.data.annotation.Id;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
public class AppUser {

    @Id
    private ObjectId userId;

    @Indexed(unique = true)
    @NonNull
    private String userName;

    @NonNull
    private String userPassword;

    @DBRef
    private List<DiaryEntry> diaryEntries = new ArrayList<>();
}
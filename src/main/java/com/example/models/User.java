package com.example.models;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

String userId;
String firstName;
String lastName;
String email;
}

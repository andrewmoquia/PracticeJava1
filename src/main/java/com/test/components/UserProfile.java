package com.test.components;

public class UserProfile {
    private final String username;          // Cannot be null (primitive-like)
    private final String email;             // Cannot be null (primitive-like)
    private Integer age;              // Can be null (Wrapper class)
    private String address;           // Can be null (Wrapper class)
    private Integer membershipLevel;  // Can be null (Wrapper class)

    // Constructor
    public UserProfile(String username, String email, Integer age, String address, Integer membershipLevel) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.address = address;
        this.membershipLevel = membershipLevel;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(Integer membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    // Method to display user profile
    public void displayProfile() {
        System.out.println("User Profile:");
        System.out.println("Username: " + (username != null ? username : "Username not provided"));
        System.out.println("Email: " + email);
        System.out.println("Age: " + (age != null ? age : "Not provided"));
        System.out.println("Address: " + (address != null ? address : "Not provided"));
        System.out.println("Membership Level: " + (membershipLevel != null ? membershipLevel : "Not provided"));
    }
}

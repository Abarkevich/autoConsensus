package api.classes.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CreatedUser {
    private String status;
    private String data;
    private String uuid;
    private String email;
    private String firstName;
    private String lastName;
    private String displayName;
    private String timeCreated;
    private String timeUpdated;
    private String phoneNumber;
    private String twitterLink;
    private String linkedinLink;
    private String googleLink;
    private String groupname;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("data")
    private void unpackNested(Map<String, Object> data) {
        Map<String, Object> user =  (Map<String, Object>) data.get("user");
        this.uuid = (String) user.get("uuid");
        this.email = (String) user.get("email");
        this.displayName = (String) user.get("displayName");
        this.firstName  = (String) user.get("firstName");
        this.lastName  = (String) user.get("lastName");
        this.phoneNumber = (String) user.get("phoneNumber");
        this.timeCreated  = (String) user.get("timeCreated");
        this.timeUpdated  = (String) user.get("timeUpdated");
        this.linkedinLink  = (String) user.get("linkedinLink");
        this.googleLink  = (String) user.get("googleLink");
        this.twitterLink  = (String) user.get("twitterLink");
        this.status  = (String) user.get("status");


    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(String timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public String getGoogleLink() {
        return googleLink;
    }

    public void setGoogleLink(String googleLink) {
        this.googleLink = googleLink;
    }
}

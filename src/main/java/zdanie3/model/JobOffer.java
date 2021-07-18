
package zdanie3.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobOffer {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("address_text")
    @Expose
    private String addressText;
    @SerializedName("marker_icon")
    @Expose
    private String markerIcon;
    @SerializedName("workplace_type")
    @Expose
    private String workplaceType;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("company_url")
    @Expose
    private String companyUrl;
    @SerializedName("company_size")
    @Expose
    private String companySize;
    @SerializedName("experience_level")
    @Expose
    private String experienceLevel;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("remote_interview")
    @Expose
    private Boolean remoteInterview;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("employment_types")
    @Expose
    private List<EmploymentType> employmentTypes = null;
    @SerializedName("company_logo_url")
    @Expose
    private String companyLogoUrl;
    @SerializedName("skills")
    @Expose
    private List<Skill> skills = null;
    @SerializedName("remote")
    @Expose
    private Boolean remote;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    public String getMarkerIcon() {
        return markerIcon;
    }

    public void setMarkerIcon(String markerIcon) {
        this.markerIcon = markerIcon;
    }

    public String getWorkplaceType() {
        return workplaceType;
    }

    public void setWorkplaceType(String workplaceType) {
        this.workplaceType = workplaceType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Boolean getRemoteInterview() {
        return remoteInterview;
    }

    public void setRemoteInterview(Boolean remoteInterview) {
        this.remoteInterview = remoteInterview;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<EmploymentType> getEmploymentTypes() {
        return employmentTypes;
    }

    public void setEmploymentTypes(List<EmploymentType> employmentTypes) {
        this.employmentTypes = employmentTypes;
    }

    public String getCompanyLogoUrl() {
        return companyLogoUrl;
    }

    public void setCompanyLogoUrl(String companyLogoUrl) {
        this.companyLogoUrl = companyLogoUrl;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Boolean getRemote() {
        return remote;
    }

    public void setRemote(Boolean remote) {
        this.remote = remote;
    }

    public JobOffer(String title) {
        this.title = title;
        this.street = street;
        this.city = city;
        this.countryCode = countryCode;
        this.addressText = addressText;
        this.markerIcon = markerIcon;
        this.workplaceType = workplaceType;
        this.companyName = companyName;
        this.companyUrl = companyUrl;
        this.companySize = companySize;
        this.experienceLevel = experienceLevel;
        this.latitude = latitude;
        this.longitude = longitude;
        this.publishedAt = publishedAt;
        this.remoteInterview = remoteInterview;
        this.id = id;
        this.employmentTypes = employmentTypes;
        this.companyLogoUrl = companyLogoUrl;
        this.skills = skills;
        this.remote = remote;
    }



    @Override
    public String toString() {
        return "JobOffer{" +
                "title='" + title + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", addressText='" + addressText + '\'' +
                ", markerIcon='" + markerIcon + '\'' +
                ", workplaceType='" + workplaceType + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyUrl='" + companyUrl + '\'' +
                ", companySize='" + companySize + '\'' +
                ", experienceLevel='" + experienceLevel + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", remoteInterview=" + remoteInterview +
                ", id='" + id + '\'' +
                ", employmentTypes=" + employmentTypes +
                ", companyLogoUrl='" + companyLogoUrl + '\'' +
                ", skills=" + skills +
                ", remote=" + remote +
                '}';
    }
}

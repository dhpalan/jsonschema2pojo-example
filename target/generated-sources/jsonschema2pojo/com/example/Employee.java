
package com.example;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.example.common.Gender;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee
 * <p>
 * An Employee
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "employee-id",
    "first-name",
    "middle-name",
    "last-name",
    "gender",
    "work-email",
    "date-of-birth"
})
public class Employee {

    /**
     * The unique identifier for an employee
     * 
     */
    @JsonProperty("employee-id")
    @JsonPropertyDescription("The unique identifier for an employee")
    private Integer employeeId;
    /**
     * Employee's first name.
     * 
     */
    @JsonProperty("first-name")
    @JsonPropertyDescription("Employee's first name.")
    @Size(max = 150)
    private String firstName;
    /**
     * Employee's middle name.
     * 
     */
    @JsonProperty("middle-name")
    @JsonPropertyDescription("Employee's middle name.")
    @Size(max = 100)
    private String middleName;
    /**
     * Employee's last name.
     * 
     */
    @JsonProperty("last-name")
    @JsonPropertyDescription("Employee's last name.")
    @Size(max = 150)
    private String lastName;
    /**
     * The gender type.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The gender type.")
    private Gender gender;
    /**
     * The email address.
     * 
     */
    @JsonProperty("work-email")
    @JsonPropertyDescription("The email address.")
    @Pattern(regexp = "^.+@[^\"\\-].+$")
    @Size(min = 3, max = 254)
    private String workEmail;
    /**
     * Date and Time in Internet date and time format. For example, yyyy-MM-ddTHH:mm:ss.SSSZ
     * 
     */
    @JsonProperty("date-of-birth")
    @JsonPropertyDescription("Date and Time in Internet date and time format. For example, yyyy-MM-ddTHH:mm:ss.SSSZ")
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])[T,t]([0-1][0-9]|2[0-3]):[0-5][0-9]:([0-5][0-9]|60)([.][0-9]+)?([Zz]|[+-][0-9]{2}:[0-9]{2})$")
    @Size(min = 20, max = 64)
    private String dateOfBirth;

    /**
     * The unique identifier for an employee
     * 
     */
    @JsonProperty("employee-id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * The unique identifier for an employee
     * 
     */
    @JsonProperty("employee-id")
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Employee's first name.
     * 
     */
    @JsonProperty("first-name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Employee's first name.
     * 
     */
    @JsonProperty("first-name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Employee's middle name.
     * 
     */
    @JsonProperty("middle-name")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Employee's middle name.
     * 
     */
    @JsonProperty("middle-name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Employee's last name.
     * 
     */
    @JsonProperty("last-name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Employee's last name.
     * 
     */
    @JsonProperty("last-name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * The gender type.
     * 
     */
    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    /**
     * The gender type.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * The email address.
     * 
     */
    @JsonProperty("work-email")
    public String getWorkEmail() {
        return workEmail;
    }

    /**
     * The email address.
     * 
     */
    @JsonProperty("work-email")
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    /**
     * Date and Time in Internet date and time format. For example, yyyy-MM-ddTHH:mm:ss.SSSZ
     * 
     */
    @JsonProperty("date-of-birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date and Time in Internet date and time format. For example, yyyy-MM-ddTHH:mm:ss.SSSZ
     * 
     */
    @JsonProperty("date-of-birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("employeeId");
        sb.append('=');
        sb.append(((this.employeeId == null)?"<null>":this.employeeId));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("workEmail");
        sb.append('=');
        sb.append(((this.workEmail == null)?"<null>":this.workEmail));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.workEmail == null)? 0 :this.workEmail.hashCode()));
        result = ((result* 31)+((this.employeeId == null)? 0 :this.employeeId.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employee) == false) {
            return false;
        }
        Employee rhs = ((Employee) other);
        return ((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.workEmail == rhs.workEmail)||((this.workEmail!= null)&&this.workEmail.equals(rhs.workEmail))))&&((this.employeeId == rhs.employeeId)||((this.employeeId!= null)&&this.employeeId.equals(rhs.employeeId))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))));
    }

}

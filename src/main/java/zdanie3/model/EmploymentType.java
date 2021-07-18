
package zdanie3.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmploymentType {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("salary")
    @Expose
    private Salary salary;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public EmploymentType(String type, Salary salary) {
        this.type = type;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmploymentType{" +
                "type='" + type + '\'' +
                ", salary=" + salary +
                '}';
    }
}

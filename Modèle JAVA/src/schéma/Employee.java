package schéma;

public class Employee {
    private String name;
    private String firstName;
    private Double salary;
    private Integer age;
    private String service;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public String getService() {
        return service;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setService(String service) {
        this.service = service;
    }
}

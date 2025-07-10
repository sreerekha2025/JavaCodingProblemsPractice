public class Employee {

        int age;
        String name;
        Double salary;

        public Employee(int age, String name, Double salary){
            this.age = age;
            this.name = name;
            this.salary = salary;
        }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age "+age+" "+"name "+name+" "+"salary "+salary;
    }
}

package ch15;

public class NewEmployee2 {

    private String name;
    private int id;
    private NewDepartment dept;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDept(NewDepartment dept) {
        this.dept = dept;
    }

    public NewDepartment getDept() {
        return dept;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n")
            .append("Name: ").append(name).append("\n")
            .append("Dept.: ").append(dept);

        return sb.toString();
    }
}

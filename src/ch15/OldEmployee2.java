package ch15;

public class OldEmployee2 {

    private String name;
    private int id;
    private int dept;

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

    public void setDept(int dept) {
        this.dept = dept;
    }

    public int getDept() {
        return dept;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n")
            .append("Name: ").append(name).append("\n")
            .append("Dept.: ").append(OldDepartment2.toString[dept]);

        return sb.toString();
    }
}

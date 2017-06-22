package be.vdab.constructorOefn;

public class Department {

    String deptName = "GB";
    String location = "Gent";
    String manager = "John";
    public Department (){
    }
    public Department (String deptName, String location, String manager){
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public static void main(String[] args) {
        Department d = new Department();
        System.out.println ( "Gegevens van "+ d.getDeptName());
        System.out.println ("Locatie: "+ d.getLocation()+ " en manager: "+ d.getManager());
    }
}

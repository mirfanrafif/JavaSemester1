package PBO.jobsheet4.tugas;

public class TugasTest {
    public static void main(String[] args) {

        //Making instance of Employees
        Employee p = new Employee("Nugroho", "123", "0812");
        Employee q = new Employee("Budi", "234", "0823");
        Employee r = new Employee("Rudi", "345", "0855");
        Owner o = new Owner("Me", "0812");

        //Making instance of tasks
        Task t = new Task(1, "Bug Fixing on #99", 5);
        Task u = new Task(2, "New Features on #102", 2);
        System.out.println();

        //add Employees on their job
        t.addDeveloper(p);t.addDeveloper(q);u.addDeveloper(r);
        t.setManager(p);u.setManager(r);

        //making project
        Project pr = new Project(1212, "PT Jeruk Indah Employee Manager", o, 3);
        System.out.println();

        //add Tasks to the project
        pr.addTask(t);
        pr.addTask(u);

        //show info on project
        pr.showInfo();
    }
}

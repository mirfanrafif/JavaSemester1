package PBO.jobsheet4.tugas;

public class Task {
    private int id;
    private String description;
    private Employee[] developer;
    private Employee manager;

    public Task(int id, String description, int amount){
        this.id = id;
        this.description = description;
        init(amount);
    }

    public void init(int amount){
        developer = new Employee[amount];
        System.out.println( amount + " space for Developer Successfully added.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee[] getDeveloper() {
        return developer;
    }

    public void setDeveloper(Employee[] developer) {
        this.developer = developer;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void addDeveloper(Employee employee){
        for (int i = 0; i < developer.length; i++) {
            if (developer[i] == null){
                developer[i] = employee;
                System.out.println("Developer Successfully added in slot " + i);
                break;
            }
        }
    }

    public String info(){
        String info = "";
        info += "Task ID : " + id + "\n";
        info += "Task Description : " + description + "\n";
        info += "Manager : " + manager.info() + "\n";
        info += "Developer : ";
        for (int i = 0; i < developer.length; i++) {
            if (developer[i]!=null){
                info += developer[i].info();
            }else {
                break;
            }
        }
        return info;
    }


}

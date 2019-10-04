package PBO.jobsheet4.tugas;

public class Project {
    private int id;
    private String description;
    private Owner owner;
    private Task[] tasks;

    public Project(int id, String description, Owner owner, int amount) {
        this.id = id;
        this.description = description;
        this.owner = owner;
        init(amount);

    }

    private void init(int amount){
        tasks = new Task[amount];
        System.out.println(amount + " task space(s) has been added");
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task){
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null){
                tasks[i] = task;
                System.out.println("Task sucessfully added in slot " + i);
                break;
            }
        }
    }

    public void showInfo(){
        System.out.println("Project ID : #" + id);
        System.out.println("Description : " + description);
        System.out.println("Owner : " + owner.info());
        System.out.println("Tasks : ");
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null){
                System.out.println(tasks[i].info());
            }
        }


    }
}

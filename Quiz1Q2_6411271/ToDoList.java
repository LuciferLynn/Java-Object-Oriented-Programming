package Quiz1Q2_6411271;

public class ToDoList {

    // 1. Data members
    private int nTasks;
    private String[] toDo;
    private boolean[] done;


    // 2. Constructors
    ToDoList() {
        nTasks = 1;
        toDo = new String[nTasks];
        done = new boolean[nTasks];
        // default value for boolean is false
        // so all the boolean values in done will be initialised as false
    }

    ToDoList(int nItems) {
        nTasks = nItems;
        toDo = new String[nTasks];
        done = new boolean[nTasks];
    }

    //3. Methods
    public void setTask(int taskN, String task) {
        toDo[taskN] = task;
    }

    public String getTask(int taskN) {
        return toDo[taskN];
    }

    public void setDone(int taskN) {
        done[taskN] = true;
    }

    public void displayAllTasks() {
        for (String each: toDo) {
            System.out.println(each);
        }

//        for (int i = 0; i < nTasks; i++) { // this also works but i prefer the other method
//            System.out.println(getTask(i));
//        }
    }

    public void displayAllDoneTasks() {
        for (int i = 0; i < nTasks; i++) {
            if (done[i] == true) {
                System.out.println(toDo[i]);
            }
        }
    }

}

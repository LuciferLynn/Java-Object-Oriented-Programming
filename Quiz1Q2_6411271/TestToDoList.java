package Quiz1Q2_6411271;

public class TestToDoList {

    public static void main(String[] args) {
        ToDoList list1 = new ToDoList(5);
        list1.setTask(0,"Cook");
        list1.setTask(1,"Clean");
        list1.setTask(2, "Sandwiches");
        list1.setTask(3, "Laundry");
        list1.setTask(4, "Dishes");

        list1.setDone(0);
        list1.setDone(1);

        System.out.println("\nTasks:");
        list1.displayAllTasks();

        System.out.println("\nCompleted Tasks:");
        list1.displayAllDoneTasks();

        // # # # # # # # # #

        ToDoList list2 = new ToDoList(4);
        list2.setTask(0,"Play games");
        list2.setTask(1, "Do Assignments");
        list2.setTask(2, "Cry");
        list2.setTask(3, "Sleep");

        list2.setDone(2);

        System.out.println("\nTasks:");
        list2.displayAllTasks();

        System.out.println("\nCompleted Tasks:");
        list2.displayAllDoneTasks();

        System.out.println("\nTesting Purposes");
        System.out.println("Task 2 of List 2: " + list2.getTask(0));
        // System.out.println(list2.toDo[0]); We cannot use this line because we set toDo array as private
    }

}

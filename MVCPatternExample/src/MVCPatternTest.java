public class MVCPatternTest {
    public static void main(String[] args) {
        // Create the model
        Student model = new Student("1", "John Doe", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(model, view);

        // Update and display the student details
        controller.updateView();

        // Update the student name
        controller.setStudentName("Jane Doe");

        // Update and display the student details
        controller.updateView();
    }
}

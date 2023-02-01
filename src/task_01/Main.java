package task_01;

// Исправьте ошибки.
public class Main {

    static String name;

    public static void main(String[] args) {

        name = "Robot 1.0";
        getRobotInfo(getRobot(name)/* ??? **/);

        name = "Robot 2.0";
        getRobotInfo(getRobot(name)/* ??? **/);
    }

    private static Robot/* ??? **/ getRobot(String name) {
       return new Robot(name);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot.getName()/* метод взврата имени потока **/ + " state: " + robot.getState()/* метод взврата состояния потока **/);
        robot.start();/* поток стартует **/
        System.out.println(robot.getName()/* метод взврата имени потока **/ + " state: " + robot.getState()/* метод взврата состояния потока **/);
    }
}

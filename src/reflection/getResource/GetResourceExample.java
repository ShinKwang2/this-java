package reflection.getResource;

public class GetResourceExample {

    public static void main(String[] args) {
        Class clazz = Car.class;

        String gitPath = clazz.getResource("git.PNG").getPath();
        String gitFlowPath = clazz.getResource("image/gitFlow.png").getPath();

        System.out.println(gitPath);
        System.out.println(gitFlowPath);
    }
}

import java.lang.reflect.Method;

public class AnnotationDemo {

    public static void main(String[] args) {
        // ��������� ��� ������ ����� ArrayUtils
        Method[] methods = ArrayUtils.class.getDeclaredMethods();

        // ��������� ���������� ��� ������, �� �������� ���������� MethodInfo �� Author
        for (Method method : methods) {
            if (method.isAnnotationPresent(annotation.MethodInfo.class) && method.isAnnotationPresent(annotation.Author.class)) {
                annotation.MethodInfo methodInfo = method.getAnnotation(annotation.MethodInfo.class);
                annotation.Author author = method.getAnnotation(annotation.Author.class);

                System.out.println("Method Name: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
                System.out.println("Author: " + author.firstName() + " " + author.lastName());
                System.out.println("------------------------------");
            }
        }
    }
}

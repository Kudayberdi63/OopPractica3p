public class Main {
    public static void main(String[] args) {
        int countJava = 0;
        int countJs = 0;
        int sum = 0;
        Student student1 = new Student("Kuba", 14, "Java");
        Student student2 = new Student("Nurik", 13, "JS");
        Student student3 = new Student("Muxa", 11, "Java");
        Student student4 = new Student("Musa", 12, "JS");
        Student student5 = new Student("Isa", 19, "Java");
        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            if (student.group.equals("Java")) {
                countJava++;
            } else
                countJs++;
            int result = sum / students.length;
            System.out.println("JAVA : " + countJava);
            System.out.println("JS :" + countJs);
            System.out.println("Result" + result);

        }

    }

}
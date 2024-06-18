package day10;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {

    // 이 코드들의 공통점 : 상위 클래스는 인스턴스로 들어갈 수 없다.
    Course<Person> personCourse = new Course<>("일반인", 5);
    personCourse.add(new Person("일반인"));
    personCourse.add(new Worker("직장인"));
    personCourse.add(new Student("학생"));
    personCourse.add(new HighStudent("고등학생"));

    Course<Worker> workerCourse = new Course<>("직장인과정", 5);
    workerCourse.add(new Worker("직장인"));

    Course<Student> studentCourse = new Course<>("학생과정", 5);
    studentCourse.add(new Student("학생"));
    studentCourse.add(new HighStudent("고등학생"));

    Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
    highStudentCourse.add(new HighStudent("고등학생"));

    registerCourse(personCourse);
    registerCourse(workerCourse);
    registerCourse(studentCourse);
    registerCourse(highStudentCourse);

    System.out.println("===============");
    System.out.println("===============");
    System.out.println("===============");

    registerCourseStudent(studentCourse);
    registerCourseStudent(highStudentCourse);

    System.out.println("===============");
    System.out.println("===============");
    System.out.println("===============");

    registerCourseWorker(workerCourse);
    registerCourseWorker(personCourse);
  }

  // Course<> 의 타입 키워드에 따라 차이가 발생한다.
  public static void registerCourse(Course<?> course) { // 전체 다 가능
    System.out.println(course.getName() + "수강생 " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseStudent(Course<? extends Student> course) { // Student 포함 하위만 가능
    System.out.println(course.getName() + "수강생 " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseWorker(Course<? super Worker> course) { // Worker 포함 상위만 가능
    System.out.println(course.getName() + "수강생 " + Arrays.toString(course.getStudents()));
  }
}

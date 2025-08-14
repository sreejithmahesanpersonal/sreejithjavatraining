package com.sreejithjava.ClassDemo;

public class AnnotationDemo {
    // Custom annotation declaration
    @interface MyAnnotation {
        String value() default "Default Value";
    }

    // Class using the custom annotation
    @MyAnnotation(value = "Custom Value")
    public class AnnotatedClass {
        public void display() {
            System.out.println("This is an annotated class.");
        }
    }

    public static void main(String[] args) {
        AnnotationDemo demo = new AnnotationDemo();
        AnnotatedClass annotatedClass = demo.new AnnotatedClass();
        annotatedClass.display();

        // Accessing the annotation value
        MyAnnotation annotation = annotatedClass.getClass().getAnnotation(MyAnnotation.class);
        System.out.println("Annotation Value: " + annotation.value());
    }
}

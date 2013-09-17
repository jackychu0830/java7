package c;

import c.myannotation.Todo;
import c.myannotation.Copyright;
import c.myannotation.InProgress;
import static java.lang.System.out;
import java.lang.reflect.*;
import java.util.*;

public class AnnotationTester {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            List<Method> todoMethods = new ArrayList<>();
            List<Method> inProgressMethods = new ArrayList<>();
            List<Method> overrideMethods = new ArrayList<>();

            Class c = Class.forName(args[i]);
            Method[] methods = c.getMethods();
            out.printf("%nClass %s in processing...%n", c.getName());

            //Check @Copyright
            boolean hasCopyright = c.isAnnotationPresent(Copyright.class);
            if (hasCopyright) {
                Copyright cr = (Copyright) c.getAnnotation(Copyright.class);
                out.printf("Copyright@%s%n", cr.value());
            }

            for (int j = 0; j < methods.length; j++) {
                //Check @Todo
                boolean hasTodo = methods[j].isAnnotationPresent(Todo.class);
                if (hasTodo) {
                    todoMethods.add(methods[j]);
                }
                //Check @InProgress
                boolean hasInProgress = methods[j].isAnnotationPresent(InProgress.class);
                if (hasInProgress) {
                    inProgressMethods.add(methods[j]);
                }
                //Check @Override
                /*
                boolean hasOverride = methods[j].isAnnotationPresent(Override.class);
                if (hasOverride) {
                    overrideMethods.add(methods[j]);
                }
                */
            }

            //process @Todo
            out.println("Todo list:");
            for (Method m : todoMethods) {
                Todo todo = m.getAnnotation(Todo.class);
                out.printf("    Method: %s, Owner=%s, Priority=%s, Deadline=%s%n",
                    m.getName(), todo.owner(), todo.priority(), todo.deadline());
            }

            //process @InProgress
            out.println("InProgress list:");
            for (Method m : inProgressMethods) {
                out.printf("    Method: %s%n", m.getName());
            }

            //process @Override
            out.println("Override list:");
            for (Method m : overrideMethods) {
                out.printf("    Method: %s%n", m.getName());
            }
        }
    }
}

package pl.samouczekprogramisty.samouczeklive.interview;

public class JavaDestructor {

    private static class AutoAlmostDestructor implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("I've been auto-closed!");
        }
    }

    private static class NonReliableDestructorDontLookHere {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("I've been finalized!");
        }
    }

    public static void main(String[] args) throws Exception {
        // try/finally
        AutoAlmostDestructor yy = null;
        try {
            yy = new AutoAlmostDestructor();
        }
        finally {
            yy.close();
        }

        // AutoCloseable (syntactic sugar)
        try(AutoAlmostDestructor xx = new AutoAlmostDestructor()) {
            System.out.println(xx);
        }

        // DON'T DO THAT IN REAL CODE!
        NonReliableDestructorDontLookHere nonReliableDestructor = new NonReliableDestructorDontLookHere();
        nonReliableDestructor = null;
        // It's a suggestion. It may, or may not execute garbage collection.
        System.gc();
    }
}

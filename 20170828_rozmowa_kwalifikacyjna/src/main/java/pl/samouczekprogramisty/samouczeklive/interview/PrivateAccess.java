package pl.samouczekprogramisty.samouczeklive.interview;

import java.lang.reflect.Field;

public class PrivateAccess {

    private static class InnerClass {
        private String privateAttribute = "secret!";
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        InnerClass innerClassInstance = new InnerClass();
        System.out.println(innerClassInstance.privateAttribute);

        OtherPrivateAccess otherClass = new OtherPrivateAccess();
        Field privateField = otherClass.getClass().getDeclaredField("anotherSecret");
        privateField.setAccessible(true);
        System.out.println(privateField.get(otherClass));
    }

}

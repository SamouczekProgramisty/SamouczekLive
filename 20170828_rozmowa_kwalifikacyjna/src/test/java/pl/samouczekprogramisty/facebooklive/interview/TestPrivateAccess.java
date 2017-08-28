package pl.samouczekprogramisty.facebooklive.interview;

public class TestPrivateAccess {

    public static class InnerClass {
        private int field;

        public InnerClass(int field) {
            this.field = field;
        }

        public int getField() {
            return field;
        }
    }

    @Test
    public void shouldAccessPrivateFieldFromInnerClass() {

    }
}

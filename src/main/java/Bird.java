public enum Bird implements CharSequence {
     MOTACILLA_CITREOLA("motacilla-citreola"),
     MOTACILLA_CINEREA("motacilla-cinerea");

     public final String name;

     private Bird(String name){
          this.name = name;
     }

     public int length() {
          return 0;
     }

     public char charAt(int index) {
          return 0;
     }

     public CharSequence subSequence(int start, int end) {
          return null;
     }
}

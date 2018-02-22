package mkobit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

class MyTest {

  @ExtendWith(MyDumbExtension.class)
  @Test
  void annotatedTest() {
  }

  @Test
  void unAnnotatedTest() {
  }
}

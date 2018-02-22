package mkobit;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyDumbExtension implements BeforeEachCallback {
  @Override
  public void beforeEach(final ExtensionContext context) throws Exception {
    System.out.println("We should fail");
    throw new RuntimeException("Things should fail!");
  }
}

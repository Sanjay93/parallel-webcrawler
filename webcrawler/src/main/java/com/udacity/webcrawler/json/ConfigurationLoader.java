package com.udacity.webcrawler.json;

import java.io.Reader;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * A static utility class that loads a JSON configuration file.
 */
public final class ConfigurationLoader {

  private final Path path;

  /**
   * Create a {@link ConfigurationLoader} that loads configuration from the given {@link Path}.
   */
  public ConfigurationLoader(Path path) {
    this.path = Objects.requireNonNull(path);
  }

  /**
   * Loads configuration from this {@link ConfigurationLoader}'s path
   *
   * @return the loaded {@link CrawlerConfiguration}.
   */
  public CrawlerConfiguration load() {
    // TODO: Fill in this method.
//      URL testDir = Path.of(path).toUri().toURL();
//      Paths.get(ClassLoader.getSystemResource(path).toURI());
//      this.getClass().getResourceAsStream(path.getFileName().);
//      URLClassLoader loader = new URLClassLoader(new URL[]{testDir});

    return new CrawlerConfiguration.Builder().build();
  }

//  private static Class<?> getTestClass(String testFolder, String className) throws Exception {
//    URL testDir = Path.of(testFolder).toUri().toURL();
//    URLClassLoader loader = new URLClassLoader(new URL[]{testDir});
//    Class<?> klass = Class.forName(className, true, loader);
//    if (!UnitTest.class.isAssignableFrom(klass)) {
//      throw new IllegalArgumentException("Class " + klass.toString() + " must implement UnitTest");
//    }
//    return klass;
//  }
  /**
   * Loads crawler configuration from the given reader.
   *
   * @param reader a Reader pointing to a JSON string that contains crawler configuration.
   * @return a crawler configuration
   */
  public static CrawlerConfiguration read(Reader reader) {
    // This is here to get rid of the unused variable warning.
    Objects.requireNonNull(reader);
    // TODO: Fill in this method

    return new CrawlerConfiguration.Builder().build();
  }
}


package af.gov.anar.hooks.common.serialization;

/**
 * 
 */
public interface FromApiJsonDeserializer<T> {

    T commandFromApiJson(final String json);
}

package af.gov.anar.hooks.infrastructure.common.serialization;

/**
 * 
 */
public interface FromApiJsonDeserializer<T> {

    T commandFromApiJson(final String json);
}

package af.gov.anar.hooks.infrastructure.common.serialization;

/**
 * Abstract implementation of {@link FromApiJsonDeserializer} that can be
 * extended for specific commands.
 */
public abstract class AbstractFromApiJsonDeserializer<T> implements FromApiJsonDeserializer<T> {

    @Override
    public abstract T commandFromApiJson(final String json);
}
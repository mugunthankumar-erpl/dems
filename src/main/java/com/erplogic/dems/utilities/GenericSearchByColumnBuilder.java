/**
 *
 */
package com.erplogic.dems.utilities;

import java.lang.reflect.Field;
import java.util.Map;

import org.springframework.beans.BeanUtils;

/**
 * @author Admin
 *
 */
public class GenericSearchByColumnBuilder<T> {

    public T buildSearchExample(final Map<String, String> searchParams, final Class<T> entityClass) {
        final T searchExample = BeanUtils.instantiateClass(entityClass);

        for (final Map.Entry<String, String> entry : searchParams.entrySet()) {
            final String paramName = entry.getKey();
            final String paramValue = entry.getValue();

            try {
                final Field field = entityClass.getDeclaredField(paramName);
                field.setAccessible(true);

                final Class<?> fieldType = field.getType();
                final Object convertedValue = convertParameterValue(paramValue, fieldType);

                field.set(searchExample, convertedValue);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                // Handle exceptions or log them
            }
        }

        return searchExample;
    }

    private Object convertParameterValue(final String paramValue, final Class<?> targetType) {
        if (targetType == String.class) {
            return paramValue;
        } else if (targetType == Integer.class || targetType == int.class) {
            return Integer.parseInt(paramValue);
        } else if (targetType == Double.class || targetType == double.class) {
            return Double.parseDouble(paramValue);
        } else if (targetType == Boolean.class || targetType == boolean.class) {
            return Boolean.parseBoolean(paramValue);
        } else {
            // Handle other data types as needed
            return null;
        }
    }
}

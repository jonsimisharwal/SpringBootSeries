package util;
import Exception.ValidationException;
@FunctionalInterface
public interface Validation<String> {

    void validate(String value) throws ValidationException;
}

package io.lazaro.pagination.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import javax.persistence.Entity;
import java.util.Map;

/**
 * @author Lázaro
 * @version 1.0
 * @since 08/07/2022
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class HttpResponse {
    protected String timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String message;
    protected Map<?, ?> data;
}

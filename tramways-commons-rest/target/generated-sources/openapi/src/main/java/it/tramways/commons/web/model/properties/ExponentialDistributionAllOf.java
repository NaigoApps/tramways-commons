package it.tramways.commons.web.model.properties;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExponentialDistributionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-06T22:11:40.260454+02:00[Europe/Rome]")
public class ExponentialDistributionAllOf   {
  @JsonProperty("lambda")
  private BigDecimal lambda;

  public ExponentialDistributionAllOf lambda(BigDecimal lambda) {
    this.lambda = lambda;
    return this;
  }

  /**
   * Get lambda
   * @return lambda
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLambda() {
    return lambda;
  }

  public void setLambda(BigDecimal lambda) {
    this.lambda = lambda;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExponentialDistributionAllOf exponentialDistributionAllOf = (ExponentialDistributionAllOf) o;
    return Objects.equals(this.lambda, exponentialDistributionAllOf.lambda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lambda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExponentialDistributionAllOf {\n");
    
    sb.append("    lambda: ").append(toIndentedString(lambda)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


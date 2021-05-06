package it.tramways.commons.web.model.properties;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.commons.web.model.properties.Distribution;
import it.tramways.commons.web.model.properties.UniformDistributionAllOf;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UniformDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-08T22:59:25.148602400+02:00[Europe/Berlin]")
public class UniformDistribution extends Distribution  {
  @JsonProperty("left")
  private BigDecimal left;

  @JsonProperty("right")
  private BigDecimal right;

  public UniformDistribution left(BigDecimal left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   * @return left
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLeft() {
    return left;
  }

  public void setLeft(BigDecimal left) {
    this.left = left;
  }

  public UniformDistribution right(BigDecimal right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   * @return right
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getRight() {
    return right;
  }

  public void setRight(BigDecimal right) {
    this.right = right;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniformDistribution uniformDistribution = (UniformDistribution) o;
    return Objects.equals(this.left, uniformDistribution.left) &&
        Objects.equals(this.right, uniformDistribution.right) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniformDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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


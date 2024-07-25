package scalac.issues;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AnnotatedRecord(
  @JsonProperty("userId")
  java.util.@jakarta.validation.Valid Optional<scalac.issues.@jakarta.validation.Valid UserId> userId) {};

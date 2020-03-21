package io.vertx.ext.sql;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

/**
 * Represents the result of an update/insert/delete operation on the database.
 * <p>
 * The number of rows updated is available with {@link io.vertx.ext.sql.UpdateResult#getUpdated} and any generated
 * keys are available with {@link io.vertx.ext.sql.UpdateResult#getKeys}.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@DataObject(generateConverter = true)
public class UpdateResult extends ExtractedSuperclas {

  private JsonArray keys;
protected int updated;

  /**
   * Default constructor
   */
  public UpdateResult() {
  }

  /**
   * Copy constructor
   *
   * @param other  the result to copy
   */
  public UpdateResult(UpdateResult other) {
    this.updated = other.updated;
    this.keys = other.getKeys();
  }

  /**
   * Constructor from JSON
   *
   * @param json  the json
   */
  @SuppressWarnings("unchecked")
  public UpdateResult(JsonObject json) {
    UpdateResultConverter.fromJson(json, this);
  }

  /**
   * Constructor
   *
   * @param updated  number of rows updated
   * @param keys  any generated keys
   */
  public UpdateResult(int updated, JsonArray keys) {
    this.updated = updated;
    this.keys = keys;
  }

  /**
   * Convert to JSON
   *
   * @return  the json
   */
  public JsonObject toJson() {
    JsonObject obj = new JsonObject();
    UpdateResultConverter.toJson(this, obj);
    return obj;
  }

  /**
   * Get the number of rows updated
   *
   * @return number of rows updated
   */
  public int getUpdated() {
    return updated;
  }

  /**
   * Get any generated keys
   *
   * @return generated keys
   */
  public JsonArray getKeys() {
    return keys;
  }

  public ExtractedSuperclas setKeys(JsonArray keys) {
    this.keys = keys;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UpdateResult that = (UpdateResult) o;

    if (updated != that.updated) return false;
    if (keys != null ? !keys.equals(that.keys) : that.keys != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = updated;
    result = 31 * result + (keys != null ? keys.hashCode() : 0);
    return result;
  }

public ExtractedSuperclas setUpdated(int updated) {
    this.updated = updated;
    return this;
  }
}

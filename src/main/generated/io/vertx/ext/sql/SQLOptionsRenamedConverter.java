package io.vertx.ext.sql;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.ext.sql.SQLOptionsRenamed}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.sql.SQLOptionsRenamed} original class using Vert.x codegen.
 */
public class SQLOptionsRenamedConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, SQLOptionsRenamed obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "autoGeneratedKeys":
          if (member.getValue() instanceof Boolean) {
            obj.setAutoGeneratedKeys((Boolean)member.getValue());
          }
          break;
        case "autoGeneratedKeysIndexes":
          if (member.getValue() instanceof JsonArray) {
            obj.setAutoGeneratedKeysIndexes(((JsonArray)member.getValue()).copy());
          }
          break;
        case "catalog":
          if (member.getValue() instanceof String) {
            obj.setCatalog((String)member.getValue());
          }
          break;
        case "fetchDirection":
          if (member.getValue() instanceof String) {
            obj.setFetchDirection(io.vertx.ext.sql.FetchDirection.valueOf((String)member.getValue()));
          }
          break;
        case "fetchSize":
          if (member.getValue() instanceof Number) {
            obj.setFetchSize(((Number)member.getValue()).intValue());
          }
          break;
        case "queryTimeout":
          if (member.getValue() instanceof Number) {
            obj.setQueryTimeout(((Number)member.getValue()).intValue());
          }
          break;
        case "readOnly":
          if (member.getValue() instanceof Boolean) {
            obj.setReadOnly((Boolean)member.getValue());
          }
          break;
        case "resultSetConcurrency":
          if (member.getValue() instanceof String) {
            obj.setResultSetConcurrency(io.vertx.ext.sql.ResultSetConcurrency.valueOf((String)member.getValue()));
          }
          break;
        case "resultSetType":
          if (member.getValue() instanceof String) {
            obj.setResultSetType(io.vertx.ext.sql.ResultSetType.valueOf((String)member.getValue()));
          }
          break;
        case "schema":
          if (member.getValue() instanceof String) {
            obj.setSchema((String)member.getValue());
          }
          break;
        case "transactionIsolation":
          if (member.getValue() instanceof String) {
            obj.setTransactionIsolation(io.vertx.ext.sql.TransactionIsolation.valueOf((String)member.getValue()));
          }
          break;
      }
    }
  }

  public static void toJson(SQLOptionsRenamed obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(SQLOptionsRenamed obj, java.util.Map<String, Object> json) {
    json.put("autoGeneratedKeys", obj.isAutoGeneratedKeys());
    if (obj.getAutoGeneratedKeysIndexes() != null) {
      json.put("autoGeneratedKeysIndexes", obj.getAutoGeneratedKeysIndexes());
    }
    if (obj.getCatalog() != null) {
      json.put("catalog", obj.getCatalog());
    }
    if (obj.getFetchDirection() != null) {
      json.put("fetchDirection", obj.getFetchDirection().name());
    }
    json.put("fetchSize", obj.getFetchSize());
    json.put("queryTimeout", obj.getQueryTimeout());
    json.put("readOnly", obj.isReadOnly());
    if (obj.getResultSetConcurrency() != null) {
      json.put("resultSetConcurrency", obj.getResultSetConcurrency().name());
    }
    if (obj.getResultSetType() != null) {
      json.put("resultSetType", obj.getResultSetType().name());
    }
    if (obj.getSchema() != null) {
      json.put("schema", obj.getSchema());
    }
    if (obj.getTransactionIsolation() != null) {
      json.put("transactionIsolation", obj.getTransactionIsolation().name());
    }
  }
}

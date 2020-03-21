package io.vertx.ext.sql.impl;

import io.vertx.ext.sql.SQLConnection;

public class ExtractedSuperclass {
  protected final SQLConnection connectionRenamed ;

  public ExtractedSuperclass(SQLConnection connection) {
    this.connectionRenamed = connection;
  }
}

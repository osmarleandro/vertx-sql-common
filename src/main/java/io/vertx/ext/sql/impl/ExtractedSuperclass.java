package io.vertx.ext.sql.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.sql.SQLConnection;

public class ExtractedSuperclass {
  protected final SQLConnection connectionRenamed ;

  public ExtractedSuperclass(SQLConnection connection) {
    this.connectionRenamed = connection;
  }

  protected void closeConnectionRenamed(Handler<AsyncResult<Void>> handler) {
    connectionRenamed.close(handler);
  }
}

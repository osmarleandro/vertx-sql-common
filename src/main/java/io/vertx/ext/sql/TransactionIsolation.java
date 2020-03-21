/*
 * Copyright (c) 2011-2014 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.ext.sql;

import io.vertx.codegen.annotations.VertxGen;

import java.sql.Connection;

/**
 * Represents a Transaction Isolation Level
 *
 * @author <a href="mailto:plopes@redhat.com">Paulo Lopes</a>
 */
@VertxGen
public enum TransactionIsolation {

  /**
   * Implements dirty read, or isolation level 0 locking, which means that no shared locks are issued and no exclusive
   * locks are honored. When this option is set, it is possible to read uncommitted or dirty data; values in the data
   * can be changed and rows can appear or disappear in the data set before the end of the transaction. This is the
   * least restrictive of the four isolation levels.
   */
  READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),

  /**
   * Specifies that shared locks are held while the data is being read to avoid dirty reads, but the data can be changed
   * before the end of the transaction, resulting in nonrepeatable reads or phantom data.
   */
  READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),

  /**
   * Locks are placed on all data that is used in a query, preventing other users from updating the data, but new
   * phantom rows can be inserted into the data set by another user and are included in later reads in the current
   * transaction. Because concurrency is lower than the default isolation level, use this option only when necessary.
   */
  REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),

  /**
   * Places a range lock on the data set, preventing other users from updating or inserting rows into the data set until
   * the transaction is complete. This is the most restrictive of the four isolation levels. Because concurrency is
   * lower, use this option only when necessary.
   */
  SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE),

  /**
   * For engines that support it, none isolation means that each statement would essentially be its own transaction.
   */
  NONE(Connection.TRANSACTION_NONE);

  private final int type;

  TransactionIsolation(int type) {
    this.type = type;
  }

  public int getType() {
    return type;
  }

  public static TransactionIsolation from(int level) {
    switch (level) {
      case Connection.TRANSACTION_READ_COMMITTED:
        return TransactionIsolation.READ_COMMITTED;
      case Connection.TRANSACTION_READ_UNCOMMITTED:
        return TransactionIsolation.READ_UNCOMMITTED;
      case Connection.TRANSACTION_REPEATABLE_READ:
        return TransactionIsolation.REPEATABLE_READ;
      case Connection.TRANSACTION_SERIALIZABLE:
        return TransactionIsolation.SERIALIZABLE;
      case Connection.TRANSACTION_NONE:
        return TransactionIsolation.NONE;
      default:
        return null;
    }
  }

  /**
 * @deprecated Use {@link HandlerUtil#from(String)} instead
 */
public static TransactionIsolation from(String level) {
	return HandlerUtil.from(level);
}
}

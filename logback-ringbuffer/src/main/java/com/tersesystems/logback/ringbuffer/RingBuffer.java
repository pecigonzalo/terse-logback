package com.tersesystems.logback.ringbuffer;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import org.jctools.queues.MessagePassingQueue;

public interface RingBuffer extends ContextAware, LifeCycle, MessagePassingQueue<ILoggingEvent> {

  /** @return Get the name of this appender. The name uniquely identifies the appender. */
  String getName();

  /**
   * Set the name of this appender. The name is used by other components to identify this appender.
   *
   * @param name the name.
   */
  void setName(String name);
}

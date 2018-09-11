package com.nxy.service;

/**
 * The <code>Monitorable</code> interface should be implemented by any
 * class whose instances are intended to be monitored. The class must
 * define a method of no arguments called <code>monitor</code>.
 *
 * @author  Zhao Peiran
 * @see     java.util.concurrent.Callable
 * @since   JDK1.8
 */
@FunctionalInterface
public interface Monitorable {
    /**
     * When an object implementing interface <code>Monitorable</code> is used
     * to create a monitor, starting the monitor causes the Log files
     * <code>monitor</code> method to calculate the target.
     */
    public abstract void monitor();
}

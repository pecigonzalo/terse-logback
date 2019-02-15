package com.tersesystems.logback.context;

import org.slf4j.Marker;

import java.util.Map;

public interface Context<M extends Marker, THIS extends Context<M, THIS>> {
    THIS and(Context<? extends Marker, ?> context);

    THIS withTracer();

    M asMarker();

    boolean isTracingEnabled();

    Map<?,?> entries();
}
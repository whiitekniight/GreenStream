package org.apache.commons.p008io;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class TaggedIOException extends IOExceptionWithCause {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (IOException) super.getCause();
    }
}

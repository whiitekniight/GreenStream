package androidx.media3.exoplayer.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Loader$UnexpectedLoaderException extends IOException {
    public Loader$UnexpectedLoaderException(Throwable r4) {
        StringBuilder r0 = new StringBuilder("Unexpected ");
        r0.append(r4.getClass().getSimpleName());
        if (r4.getMessage() == null) goto L5;
        String r1 = ": " + r4.getMessage();
    L6:
        r0.append(r1);
        super(r0.toString(), r4);
        return;
    L5:
        r1 = "";
        goto L6
    }
}

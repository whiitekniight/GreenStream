package ar.tvplayer.p002tv;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class MessageGuardException extends RuntimeException {
    static String fingerprint;
    private final String guard;

    /* JADX INFO: renamed from: id */
    protected final String f1594id;

    public MessageGuardException(Throwable r2) {
        this(r2, null);
    }

    public MessageGuardException(Throwable r4, String r5) {
        super(r4.getLocalizedMessage(), r4);
        String r0 = r4.getMessage();
        if (r0 != null) goto L5;
        r0 = "NO_MSG";
    L5:
        StringBuilder r1 = new StringBuilder();
        r1.append(r0);
        r1.append(" ");
        r1.append(fingerprint);
        if (r5 == null) goto L8;
        r1.append(" ");
        r1.append(r5);
    L8:
        this.guard = r1.toString();
        this.f1594id = r5;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String r0 = getClass().getName() + "_" + Base64.encodeToString(this.guard.getBytes("UTF-8"), 11).replace('-', '$');
        String r1 = getLocalizedMessage();
        if (r1 == null) goto L6;
        return r0 + ": " + r1;
    L6:
        return r0;
    }
}

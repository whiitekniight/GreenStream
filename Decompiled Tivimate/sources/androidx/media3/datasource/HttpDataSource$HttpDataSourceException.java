package androidx.media3.datasource;

import com.google.android.gms.internal.measurement.ˏʻ;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: ʽʽ */
    public final int f1140;

    public HttpDataSource$HttpDataSourceException(int r2) {
        if (r2 != 2000) goto L5;
        r2 = 2001;
    L5:
        super(r2);
        this.f1140 = 1;
    }

    public HttpDataSource$HttpDataSourceException(int r2, int r3, IOException r4) {
        if (r2 == 2000) goto L5;
    L7:
        super(r4, r2);
        this.f1140 = r3;
        return;
    L5:
        if (r3 != 1) goto L7;
        r2 = 2001;
        goto L7
    }

    public HttpDataSource$HttpDataSourceException(int r2, IOException r3, String r4) {
        if (r2 != 2000) goto L5;
        r2 = 2001;
    L5:
        super(r4, r3, r2);
        this.f1140 = 1;
    }

    public HttpDataSource$HttpDataSourceException(int r2, String r3) {
        if (r2 != 2000) goto L5;
        r2 = 2001;
    L5:
        super(r2, r3);
        this.f1140 = 1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static HttpDataSource$HttpDataSourceException m742(int r3, IOException r4) {
        String r0 = r4.getMessage();
        if ((r4 instanceof SocketTimeoutException) == false) goto L6;
        int r02 = 2002;
    L13:
        if (r02 != 2007) goto L17;
        return new HttpDataSource$CleartextNotPermittedException(2007, r4, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted");
    L17:
        return new HttpDataSource$HttpDataSourceException(r02, r3, r4);
    L6:
        if ((r4 instanceof InterruptedIOException) == false) goto L8;
        r02 = 1004;
        goto L13
    L8:
        if (r0 != null) goto L10;
    L12:
        r02 = 2001;
        goto L13
    L10:
        if (ˏʻ.ˈⁱ(r0).matches("cleartext.*not permitted.*") == false) goto L12;
        r02 = 2007;
        goto L13
    }
}

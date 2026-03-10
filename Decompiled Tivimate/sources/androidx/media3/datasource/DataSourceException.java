package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ int f1138 = 0;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f1139;

    public DataSourceException(int r1) {
        this.f1139 = r1;
    }

    public DataSourceException(int r1, String r2) {
        super(r2);
        this.f1139 = r1;
    }

    public DataSourceException(Exception r1, int r2) {
        super(r1);
        this.f1139 = r2;
    }

    public DataSourceException(String r1, Exception r2, int r3) {
        super(r1, r2);
        this.f1139 = r3;
    }
}

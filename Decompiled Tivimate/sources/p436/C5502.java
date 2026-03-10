package p436;

import android.database.sqlite.SQLiteProgram;
import p046.InterfaceC1676;

/* JADX INFO: renamed from: ﹳﾞ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public class C5502 implements InterfaceC1676 {

    /* JADX INFO: renamed from: ʾˋ */
    public final SQLiteProgram f19717;

    public C5502(SQLiteProgram r1) {
        this.f19717 = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19717.close();
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ʻٴ */
    public final void mo4414(int r2, String r3) {
        this.f19717.bindString(r2, r3);
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo4415(int r2, byte[] r3) {
        this.f19717.bindBlob(r2, r3);
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo4416(int r2, double r3) {
        this.f19717.bindDouble(r2, r3);
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo4417(int r2) {
        this.f19717.bindNull(r2);
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo4418(int r2, long r3) {
        this.f19717.bindLong(r2, r3);
    }
}

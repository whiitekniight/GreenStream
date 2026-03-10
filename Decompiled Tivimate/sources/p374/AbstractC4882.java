package p374;

import p025.C1393;
import p046.InterfaceC1678;
import p171.C3030;
import p429.InterfaceC5415;

/* JADX INFO: renamed from: ᵔᴵ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4882 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f17302;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f17303;

    public AbstractC4882(int r1, int r2) {
        this.f17303 = r1;
        this.f17302 = r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void mo8027(InterfaceC5415 r2) {
        if ((r2 instanceof C3030) == false) goto L7;
        mo8026(((C3030) r2).f10596);
        return;
    L7:
        throw new C1393("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void mo8026(InterfaceC1678 r2) {
        throw new C1393("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}

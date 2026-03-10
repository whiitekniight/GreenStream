package p436;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import p046.InterfaceC1679;
import p341.InterfaceC4588;

/* JADX INFO: renamed from: ﹳﾞ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5504 implements InterfaceC4588 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ InterfaceC1679 f19719;

    public /* synthetic */ C5504(InterfaceC1679 r1) {
        this.f19719 = r1;
    }

    @Override // p341.InterfaceC4588
    /* JADX INFO: renamed from: ٴﹶ */
    public final Object mo8013(Object r2, Object r3, Object r4, Object r5) {
        SQLiteDatabase r22 = (SQLiteDatabase) r2;
        SQLiteQuery r52 = (SQLiteQuery) r5;
        C5502 r23 = new C5502(r52);
        this.f19719.mo3864(r23);
        return new SQLiteCursor((SQLiteCursorDriver) r3, (String) r4, r52);
    }
}

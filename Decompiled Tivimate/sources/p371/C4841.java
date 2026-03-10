package p371;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p151.C2839;
import p309.AbstractC4175;
import p330.EnumC4399;

/* JADX INFO: renamed from: ᵔـ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4841 implements InterfaceC4846 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ long f17125;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C2839 f17126;

    public /* synthetic */ C4841(long r1, C2839 r3) {
        this.f17125 = r1;
        this.f17126 = r3;
    }

    @Override // p371.InterfaceC4846
    public final Object apply(Object r8) {
        SQLiteDatabase r82 = (SQLiteDatabase) r8;
        ContentValues r0 = new ContentValues();
        r0.put("next_request_ms", Long.valueOf(this.f17125));
        C2839 r1 = this.f17126;
        String r2 = r1.f10054;
        EnumC4399 r3 = r1.f10052;
        if (r82.update("transport_contexts", r0, "backend_name = ? and priority = ?", new String[]{r2, String.valueOf(AbstractC4175.m8440(r3))}) >= 1) goto L5;
        r0.put("backend_name", r1.f10054);
        r0.put("priority", Integer.valueOf(AbstractC4175.m8440(r3)));
        r82.insert("transport_contexts", null, r0);
    L5:
        return null;
    }
}

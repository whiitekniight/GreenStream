package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ٴᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C0042 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static C0028 m286(Object r1, Object r2) {
        C0028 r12 = (C0028) r1;
        C0028 r22 = (C0028) r2;
        if (r22.isEmpty() == false) goto L5;
    L10:
        return r12;
    L5:
        if (r12.f415 == true) goto L7;
        r12 = r12.m235();
    L7:
        r12.m236();
        if (r22.isEmpty() == true) goto L10;
        r12.putAll(r22);
        goto L10
    }
}

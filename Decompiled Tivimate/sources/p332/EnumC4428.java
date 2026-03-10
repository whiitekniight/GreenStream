package p332;

import p322.C4268;

/* JADX INFO: renamed from: ᴵˉ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4428 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4428 f16185 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC4428 f16186 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final /* synthetic */ C4268 f16187 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC4428 f16188 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final /* synthetic */ EnumC4428[] f16189 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC4428 f16190 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final char f16191;

    /* JADX INFO: renamed from: ᴵˊ */
    public final char f16192;

    static {
        EnumC4428 r0 = new EnumC4428("OBJ", 0, '{', '}');
        f16185 = r0;
        EnumC4428 r1 = new EnumC4428("LIST", 1, '[', ']');
        f16186 = r1;
        EnumC4428 r5 = new EnumC4428("MAP", 2, '{', '}');
        f16190 = r5;
        EnumC4428 r3 = new EnumC4428("POLY_OBJ", 3, '[', ']');
        f16188 = r3;
        EnumC4428[] r4 = {r0, r1, r5, r3};
        f16189 = r4;
        f16187 = new C4268(r4);
    }

    EnumC4428(String r1, int r2, char r3, char r4) {
        this.f16191 = r3;
        this.f16192 = r4;
    }

    public static EnumC4428 valueOf(String r1) {
        return (EnumC4428) Enum.valueOf(EnumC4428.class, r1);
    }

    public static EnumC4428[] values() {
        return (EnumC4428[]) f16189.clone();
    }
}

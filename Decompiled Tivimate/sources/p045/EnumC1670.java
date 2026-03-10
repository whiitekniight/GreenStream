package p045;

import p329.InterfaceC4393;

/* JADX INFO: renamed from: ʼﹳ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1670 extends Enum implements InterfaceC4393 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC1670[] f5549 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f5550;

    static {
        f5549 = new EnumC1670[]{new EnumC1670(0, "FILE_SUPERSEDED", 0), new EnumC1670(1, "FILE_OPENED", 1), new EnumC1670(2, "FILE_CREATED", 2), new EnumC1670(3, "FILE_OVERWRITTEN", 3)};
    }

    EnumC1670(long r1, String r3, int r4) {
        this.f5550 = r1;
    }

    public static EnumC1670 valueOf(String r1) {
        return (EnumC1670) Enum.valueOf(EnumC1670.class, r1);
    }

    public static EnumC1670[] values() {
        return (EnumC1670[]) f5549.clone();
    }

    @Override // p329.InterfaceC4393
    public final long getValue() {
        return this.f5550;
    }
}
